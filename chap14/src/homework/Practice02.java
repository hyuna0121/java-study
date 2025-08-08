package homework;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice02 {
	public long method1(String path) {
		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(path)) {
			int data;
			byte[] buffer = new byte[500];
			while ((data = fis.read(buffer)) != -1) {
				String result = new String(buffer, 0, data, "UTF-8");
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
	
	public long method2(String path) {
		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(path);
			 BufferedInputStream bis = new BufferedInputStream(fis)) {
			int data;
			byte[] buffer = new byte[500];
			while ((data = bis.read(buffer)) != -1) {
				String result = new String(buffer, 0, data, "UTF-8");
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
}
