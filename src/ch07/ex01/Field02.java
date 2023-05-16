package ch07.ex01;

class B {
	
	int m;
	static int n;
}

public class Field02 {
	public static void main(String[] args) {
		
		
		
		// B타입으로  b1, b2, b3객체 생성
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		
		// 인스턴스 필드 : m <= 객체 내부에서 고유공간, 다른객와 값이 공유되지않는 필드
		
		b1.m = 1;
		b2.m = 2;
		b3.m = 3;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		System.out.println(b3.m);
		
		// 정적(static) 필드 : 모든 객체에서 값을 동유하는 필드, 클래스 영역에 값이 저장됨
		b1.n = 10;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
		
		
	}
}
