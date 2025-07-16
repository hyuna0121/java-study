package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내라
		int keyCode;
		
		// 키보드로부터 키코드를 읽어올 때 예외가 발생할 수 있음 -> 예외처리
		keyCode = System.in.read(); // 콘솔에서 키보드로부터 입력을 받을때까지 기다림(입력이 없으면 멈춰있음)
		System.out.println("KeyCode : " + keyCode);
		
		keyCode = System.in.read(); 
		System.out.println("KeyCode : " + keyCode); // CR
		
		keyCode = System.in.read(); 
		System.out.println("KeyCode : " + keyCode); // LF
	}

}
