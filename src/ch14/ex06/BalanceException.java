package ch14.ex06;

// 은행의 잔고가 부족하면 강제로 발생시키는 예외
public class BalanceException  extends Exception{
	// 기본 생성자
	public BalanceException() {	}
	
	// 2. 메세지를 처리하는 생성자
	BalanceException (String message) {
		super(message);
	}
}
