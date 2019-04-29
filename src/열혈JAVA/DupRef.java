package ¿­Ç÷JAVA;

public class DupRef {

	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
	
		BankAccount ref = new BankAccount();
						
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
		}
		public static void check(BankAccount acc) {
		acc.checkMyBalance();
		}
		BankAccount ref = null;
}		
		
class BankAccount {
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

