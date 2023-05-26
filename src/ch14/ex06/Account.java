package ch14.ex06;

public class Account {
	
	
	private long balance = 10000;
	
	public Account() {	}
	
	
	// getter : 메소드를 호출 시 필드의 정보를 출력
	public long getBalance () {
		return balance;
	}
	
	// 예금을 입금/출금하는 메소드 money에  + 가 인풋되면 예금을 추가, - 가 인풋되면 예금을 빼는 것, 인풋값을 받아 저장
	
	public void deposit (int money) {
		System.out.println("현 잔액은 " + balance + "원이고, " + money + "원이 입금되었습니다.");
		balance += money;
		System.out.println("총 잔액은 " + balance + "원입니다.");
	}
	
	/// 예금을 출금하는 메소드 : money를 인풋받아서 예금잔고보다 작으면 balanceException발생
	public void withdraw (int money) throws BalanceException {
		if (balance < money) {
			
			throw new BalanceException("현재 예금잔고가 부족합니다." + (money-balance) + "원이 부족합니다.");
			
		} else {
			System.out.println("현 잔액은 " + balance + "원이고, " + money + "원이 출금되었습니다.");
			balance -= money;
			System.out.println("총 잔액은 " + balance + "원입니다.");
		}
	}
}
