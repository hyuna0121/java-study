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
			while (true) {
				int data = reader.read();
				if (data == -1) break;
				System.out.print((char) data);
			}
			
//			char[] buffer = new char[300];
//			int readBytes = reader.read(buffer);
//			String result = new String(buffer, 0, readBytes);
//			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
