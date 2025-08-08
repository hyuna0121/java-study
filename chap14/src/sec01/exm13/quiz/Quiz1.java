package sec01.exm13.quiz;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Quiz1 {
//	Quiz
//	FileReader를 사용하여 
//	"C:/Temp/output.txt" 파일을 읽어와서 콘솔에 표준 출력하세요.
	
//  힌트: 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력 
//       또는 읽은 char 배열을 문자열로 변환 후 출력
	
	public static void main(String[] args) {
		try (Reader reader = new FileReader("C:/Temp/output.txt")) {
			char[] buffer = new char[100];
			int readCharNum;
			while ((readCharNum = reader.read(buffer)) != -1) {
				// 방법1 : 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력
				// 문자 한씩 직접 처리해야 하는 경우 사용
				for (int i = 0; i < readCharNum; i ++) {
					System.out.print(buffer[i]);
				}
				
				// 방법2 : 읽은 char 배열을 문자열로 변환 후 출력
				String result = new String(buffer, 0, readCharNum);
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
