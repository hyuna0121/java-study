package homework.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	public SmartPhone() {}
	
	@Override
	public void makeCall() { System.out.println("번호를 누르고 통화버튼을 누름"); }

	@Override
	public void takeCall() { System.out.println("수신 버튼을 누름"); }

	@Override
	public abstract void picture();

	@Override
	public abstract void touch();

	@Override
	public abstract void charge();
	
	public abstract void printMaker();
}
