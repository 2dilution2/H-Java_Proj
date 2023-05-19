package ch10.ex03;

class A {
	void print () {		// 인스턴스 메소드(static이 없음) 
		System.out.println("A클래스의 print()");
	}
}

class B extends A {		// B는 A를 상속받는다.
	@Override
	void print() {
		System.out.println("B클래스의 print()");
	}
}

class C extends A {
	@Override
	void print() {
		System.out.println("C클래스의 print()");
	}
}

public class MethodOverRiding01 {
	public static void main(String[] args) {
		
		// A클래스를 객체화 해서 A타입으로 지정
		A a = new A();	// a : A
		a.print();
		
		B b = new B();
		b.print();		// Override전까지 A클래스의 print()가 출력
		
		C c = new C();
		c.print();
		
		System.out.println("자식객체를 생성하면서 부모타입으로 지정한 경우 : 오버라이딩된 메소드가 출력");
		
		A ab = new B();
		ab.print();
		
		A ac = new C();
		ac.print();
		
		
		
	}
}
