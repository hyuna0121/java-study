package homework03.controller;

import homework03.model.vo.Account;
import homework03.model.vo.Bank;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-654-321", 50000);
		
		acc1.withdraw(30000);
		acc2.deposit(100000);
		
		Bank bank = new Bank();
		bank.transfer(acc1, acc2, 50000);
		
		System.out.println(acc1.getAccountNumber() + " " + acc1.getBalance());
		System.out.println(acc2.getAccountNumber() + " " + acc2.getBalance());
	}
}
