package ch12.ex07;

interface A {
	
	// 필드 <-  public static final이 생략
	int a = 20;
	int b = 30;
	String c = "현대자동차";
	
	// 메소드 <- public abstract 생략
	void abc();				// 2000년도에 구현된 메소드 : USB 1.0
	void bcd();				// 2005년도에 구현된 메소드 : USB 2.0
	default void cde() {	// 2010년도에 구현된 메소드 : USB 3.0	 새로운 기능을 구현
		System.out.println("2010년도에 USB 3.0을 구현한 메소드");
	}
	
	static void def() {
		System.out.println("static메소드 : 객체 생성없이 바로 호출이 가능");
	};
}

// 위의 인터페이스를 구현한 클래스가 1000개 있다 가정


class Aa implements A {
	@Override
	public void abc() {
		System.out.println("Aa : 2000년도에 USB 1.0을 구현한 메소드");
	}
	@Override
	public void bcd() {
		System.out.println("Aa : 2005년도에 USB 2.0을 구현한 메소드");
	}
}

class Aaa implements A {
	@Override
	public void abc() {
		System.out.println("Aaa : 2000년도에 USB 1.0을 구현한 메소드");
	}
	@Override
	public void bcd() {
		System.out.println("Aaa : 2005년도에 USB 2.0을 구현한 메소드");
	}
	@Override
	public void cde() {
		System.out.println("Aaa : 부모의 default 메소드에 오버라이딩");
	}
	
}
		
public class Default_Method {
	public static void main(String[] args) {
		// 자식클래스를 생성하면서 인터페이스 타입으로 지정
		A a1 = new Aa();
		
		a1.abc();
		a1.bcd();
		a1.cde();
		
		A a2 = new Aaa();
		
		a2.abc();
		a2.bcd();
		a2.cde();
		
		A.def();
		
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		
//		A.a = 50;	// final로 수정 불가
	}
}
