package homework;

public class UnSupportedException extends Exception {
	public UnSupportedException() {
		super("원인을 알 수 없는 오류가 발생했습니다.");
	}
}
