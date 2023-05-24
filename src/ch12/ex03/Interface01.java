package ch12.ex03;

// 1. 정식표현 : 코드가 길어짐
interface A {		// 필드, 메소드
	
	// 필드
	public static final int a = 3;
	
	// 메소드
	public abstract void abc();
	
	// 구현한 메소드를 선언 시 오류 발생
//	void bcd() {}
}

// 인터페이스의 구현되지않는 메소드를 구현하는 클래스
class Aa implements A {
	@Override
	public void abc() {
		System.out.println("A인터페이스의 구현되지않는 메소드를 구현한 메소드 abc()");
	}
}

// 2. 약식표현 : 많이 사용
interface B {
	int a = 3;	// public static final 생략
	void abc();
}

class Bb implements B {
	@Override
	public void abc() {
		System.out.println("B인터페이스의 구현되지않는 메소드를 구현한 메소드 abc()");
	}
}

public class Interface01 {
	public static void main(String[] args) {
		// 1. 인터페이스는 객체화 할 수 없다.
//		A a = new A();
		
		// 2. 인터페이스를 구현한 클래스를 객체화 해서 타입으로는 지정 가능
		A a1 = new Aa();
		a1.abc();		// 오버라이딩 된 메소드 출력
		
		System.out.println("-----------------------");
		
		// 1. 인터페이스는 객체화 할 수 없다.
//		B b = new B();
		
		// 2. 인터페이스를 구현한 클래스를 객체화 해서 타입으로는 지정 가능
		B b1 = new Bb();
		b1.abc();		// 오버라이딩 된 메소드 출력
		System.out.println(a1.a);
	}
}
