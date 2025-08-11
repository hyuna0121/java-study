package homework;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		String content = new String(sb);
		fd.fileSave(file, content);
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String content = new String(sb);
		fd.fileEdit(file, content);
	}
}
