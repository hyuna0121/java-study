package sec02.exam02;

public class Message {
	public String command; // 메시지를 어떻게 처리할 지
	public String to; // 누구에게 보낼 지
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
