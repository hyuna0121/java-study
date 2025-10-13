-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
		no INT AUTO_INCREMENT,
		title VARCHAR(100) NOT NULL,
		writer VARCHAR(100) NOT NULL,
		content TEXT,
		reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
		-- DATE 타입일 때 : reg_date DATE NOT NULL DEFAULT CURRENT_DATE
		upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
		-- ON UPDATE CURRENT_TIMESTAMP : UPDATE 시 자동으로 수정 시간도 갱신
		PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board(title, writer, content) 
VALUES 
		("게시글 제목 1", "user1", "test1"),
		("게시글 제목 2", "user2", "test2"),
		("게시글 제목 3", "user3", "test3");

-- 조회
SELECT * FROM board; -- 전체 게시글 목록 조회
SELECT * FROM board WHERE no = 4; -- 특정 게시글 조회

-- 수정
UPDATE board 
SET 
		title = "게시글 제목 4",
		writer = 'user4',
		content = 'test4' 
		-- upd_date = now() -- 수정일 현재 시간으로 갱신
WHERE no = 4;

-- 삭제
DELETE FROM board WHERE no = 1;

-- 댓글 테이블
CREATE Table comment(
		id INT AUTO_INCREMENT,
		board_no INT NOT NULL,
		commenter VARCHAR(50) NOT NULL,
		comment TEXT,
		reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
		PRIMARY KEY(id),
		Foreign Key (board_no) REFERENCES board(no) ON DELETE CASCADE
		-- ON DELETEE CASCADE : 외래키(FK)에 설정하는 옵션으로
		-- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
		-- 예 : board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);