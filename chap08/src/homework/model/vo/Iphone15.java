package homework.model.vo;

public class Iphone15 extends SmartPhone {
	public Iphone15() {}

	@Override
	public void makeCall() { super.makeCall(); }

	@Override
	public void takeCall() { super.takeCall(); }

	@Override
	public void picture() { System.out.println("1200, 1600만 화소 트리플 카메라"); }

	@Override
	public void touch() { System.out.println("정전식"); }

	@Override
	public void charge() { System.out.println("고속 충전"); }

	@Override
	public void printMaker() { System.out.print("애플"); }
}
