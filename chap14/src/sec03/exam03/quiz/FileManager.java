package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if (dir.exists() && dir.isDirectory()) {
			File[] contents = dir.listFiles();
			
			for (File file : contents) {
				if (file.delete()) System.out.println(file.getPath() + " -> 삭제 완료");
				else System.out.println(file.getPath() + " -> 삭제 안됨");
			}
		}
	}
}
