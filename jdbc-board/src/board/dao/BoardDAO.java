package board.dao;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import board.dto.Board;

/**
 * 데이터 접근 객체
 * 데이터베이스에 접근하는 로직들을 작성
 * 여기서는 게시글 데이터에 접근
 */
public class BoardDAO extends DBConnection {
	// 상속을 받으면 BoardDAO 객체를 생성할 때
	// 부모인 DBConnection 객체도 생성되면서 DB에 연결됨!
	
	/**
	 * 게시글 목록
	 */
	public List<Board> list() {
		// 게시글 목록을 담을 컬렉션 객체 생성
		List<Board> boardList = new ArrayList<Board>();
		
		// SQL 작성
		// 최근 작성글부터 보여지도록 변경
		String sql = "SELECT * FROM board ORDER BY reg_date DESC;";
		
		try {
			// 1. SQL 실행 객체 생성 - Statement(stmt)
			stmt = conn.createStatement();
			
			// 2. SQL 실행 요청 -> 반환되는 결과 ResultSet(rs)
			rs = stmt.executeQuery(sql);
			
			// 3. 조회된 결과를 리스트(boardList)에 추가
			while (rs.next()) { // 조회된 결과의 다음 행으로 이동
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") : 해당 컬럼의 데이터를 반환
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				board.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
				
				// 게시글 목록 추가
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글 목록 조회 - 예외 발생");
			e.printStackTrace();
		}
		
		// 4. 게시글 목록 반환
		return boardList;
	}
	
	/**
	 * 게시글 조회
	 * @param no
	 * @return
	 */
	public Board select(int no) {
		// 게시글 정보를 담을 객체 생성
		Board board = new Board();
		
		// SQL 작성
		String sql = "SELECT * FROM board WHERE no = ?";
		
		// 조회 프로세스 : SQL 실행 객체 생성 -> SQL 실행 요청 -> 조회 결과 -> 반환
		try {
			// 1. SQL 실행 객체 생성 - PreParedStatement(pstmt)
			pstmt = conn.prepareStatement(sql);
			
			// no 매개변수 값을 ? 파라미터에 동적으로 바인딩
			// pstmt.setXXX(물음표 순서 번호, 매핑할 값);
			pstmt.setInt(1, no); // 첫 번째 ?에 정수 no를 넣음
			
			// SQL 실행 요청 -> 반환되는 결과는 ResultSet(rs)
			rs = pstmt.executeQuery();
			
			// 조회된 결과 1건 가져오기
			if (rs.next()) {
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") : 해당 컬럼의 데이터를 반환
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				board.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
			} else {
				// 조회된 게시글이 존재하지 않는 경우
				System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
				return null;
			}
		} catch (SQLException e) {
			System.out.println("게시글 조회 - 예외 발생");
			e.printStackTrace();
		}
		
		// 4. 게시글 정보 1건 반환
		return board;
	}
	
	/**
	 * 게시글 등록
	 * @param board
	 * @return
	 */
	public int insert(Board board) {
		int result = 0; // DB에 적용된 데이터 개수
		String sql = "INSERT INTO board(title, writer, content) VALUES (?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			
			result = pstmt.executeUpdate();
			// executeUpdate()
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int로 반환
			// 예 : 게시글 1개 등록 시
			// result = 1 (성공)
			// result = 0 (실패)
		} catch (SQLException e) {
			System.out.println("게시글 등록 - 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * 게시글 수정
	 * @param board
	 * @return
	 */
	public int update(Board board) {
		int result = 0; // DB에 적용된 데이터 개수
		String sql = "UPDATE board SET title = ?, writer = ?, content = ? WHERE no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getNo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("게시글 수정 - 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * 게시글 삭제
	 * @param no
	 * @return
	 */
	public int delete(int no) {
		int result = 0;
		String sql = "DELETE FROM board WHERE no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("게시글 삭제 - 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
}
