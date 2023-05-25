package ch14.ex05;

class Aa {
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException {
		cde();
	}
	void cde() throws InterruptedException {
		Thread.sleep(1000);
	}
}


public class Throws_Exception02 {
	public static void main(String[] args) {
		Aa a1 = new Aa();
		try {
			a1.abc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
