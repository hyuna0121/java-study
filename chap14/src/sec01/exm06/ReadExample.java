package sec01.exm06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		// 3바이트를 읽고 인덱스 2부터 순차적으로 저장
		int readByteNum = is.read(buffer, 2, 3);
		if (readByteNum != -1) { // 읽은 바이트가 있다면
			for (byte b : buffer) {
				System.out.println(b);
			}
		}
		
		// 참고 : 두개는 동일한 코드
//		is.read(buffer, 0, 5);
//		is.read(buffer);
		
		is.close();
	}
}
