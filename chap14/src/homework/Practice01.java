package homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice01 {
	public void method1(String song) {
		try (FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야1.dat")) {
			byte[] array = song.getBytes("UTF-8");
			fos.write(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2(String song) {
		try (FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야2.dat");
			 BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			byte[] array = song.getBytes("UTF-8");
			bos.write(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
