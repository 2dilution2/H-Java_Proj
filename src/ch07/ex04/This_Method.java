package ch07.ex04;

class C {		// this()메소드를 사용하지않고, 생성자를 초기화 한다. 
	
}

class D {		// this() 메소드를 사용하여 생성자를 초기화 한다
	int m1, m2, m3, m4;
	
	// 매개변수 없는 생성자
	D () {
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	
	D (int a) {
		this();
		m1 = a;
	}
	
	D (int a, int b) {
		this();
		m2 = b;
	}
	
	D (int a, int b, int c) {
		this();
		m3 = c;
	}
}

public class This_Method {
	public static void main(String[] args) {
		
		
		
	}
}
