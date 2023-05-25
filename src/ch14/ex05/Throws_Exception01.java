package ch14.ex05;


// 1. 직접 예외를 처리함
class A {
	void abc() {
			bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// 2. 예외 전가 : 메소드를 호출하는 곳에서 예외를 처리
class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void bcd () throws InterruptedException {
		Thread.sleep(1000);
	}
}

public class Throws_Exception01 {

}
