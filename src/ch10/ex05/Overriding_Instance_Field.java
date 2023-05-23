package ch10.ex05;

class A {
	int m = 20;
	
	void print () {
		System.out.println("A - print()");
	}
}

class B extends A {
	int m = 30;
	
	// 인스턴스메소드는 오버라이딩 
	void print () {
		System.out.println("B - print()");
	}
}

public class Overriding_Instance_Field {
	public static void main(String[] args) {
		// 자식객체를 생성하면서 부모타입으로 지정
		A a1 = new B();
		
		//m필드의 값을 출력
		System.out.println(a1.m);
		
		a1.print();
		
		B b1 = (B) a1;
		System.out.println(b1.m);
		b1.print();
	}
}
