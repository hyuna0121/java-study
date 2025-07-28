package homework03.model.vo;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
		receiver.deposit(amount);
	}
}
