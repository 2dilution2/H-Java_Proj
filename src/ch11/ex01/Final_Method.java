package ch11.ex01;

class Aa {
	
	// 자식클래스에서 오버라이딩이 가능 : 부모의 실행블럭을 새롭게 정의가능
	void print () {
		System.out.println("Aa클래스의 print()");
	}
	
	// 오버라이딩이 불가한 클래스 : 중요한 정보
	final void run () {
		System.out.println("Aa클래스의 run()");
	}
}

public class Final_Method {
	public static void main(String[] args) {
		
		
	}
}
