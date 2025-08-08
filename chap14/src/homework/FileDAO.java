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
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환 
		StringBuilder sb = new StringBuilder();
		File note = new File("C:/homework/" + file);
		try (Reader reader = new FileReader(note)) {
			sb.append(reader.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
