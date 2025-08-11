package homework;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileDAO {
	public boolean checkName(String file) {
		File note = new File("C:/homework/" + file);
		return note.exists();
	}
	
	public void fileSave(String file, String s) {
		File note = new File("C:/homework/" + file);
		
		try (Writer writer = new FileWriter(note)) {
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		File note = new File("C:/homework/" + file);
		
		try (Reader reader = new FileReader(note)) {
			int data;
			while ((data = reader.read()) != -1) {
				sb.append((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
		// String에 써서 저장하되 이어서 저장될 수 있도록 함 
	}
}
