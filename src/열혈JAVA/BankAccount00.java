package ¿­Ç÷JAVA;

public class BankAccount00 {

	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	
	
	BankAccount1 yoon1 = new BankAccount1();
	
	yoon1.initAccount("12-34-89", "990990-9090990", 10000);
	
	yoon1.checkMyBalance();
	}
}

class BankAccount1 {
	
	int balance = 0;
	String accNumber;
	String ssNumber;

	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;	
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("ÀÜ¾× : " + balance);
		return balance;
	}
}