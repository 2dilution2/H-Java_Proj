package ch14.ex06;

public class Account_Test {
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.deposit(30000);
		
		System.out.println(a1.getBalance() + "원");
		
		a1.deposit(50000);
		
		System.out.println(a1.getBalance() + "원");
		try {
			a1.withdraw(100000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a1.getBalance() + "원");
		
	}
}
