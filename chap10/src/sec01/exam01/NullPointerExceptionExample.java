package sec01.exam01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null; // null값이 들어갔기 때문에 data가 메모리(stack)에 할당됨, null로 초기화 시 참조하는 객체가 없음
		System.out.println(data.toString()); // 객체에 접근 -> 접근할 객체가 없음
		// NPE 발생 시 .을 찾아서 참조 변수가 객체를 참조하고 있는 지 확인
		// 실행 예외의 경우 컴파일 가능(실행 중 발생)
	}
}
