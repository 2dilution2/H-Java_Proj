package ch10.ex06;

class Aa {
	void abc () {
		System.out.println("Aa클래스의 abc()");
	}
	void ab () {
		System.out.println("Aa클래스의 ab()");
	}
}

class Bb extends Aa {
	
	@Override
	void abc() {
		System.out.println("Bb클래스의 abc()");
	}
	
	void bcd () {
		abc();		// this 생략
	}
	
	void cde () {
		super.abc();	// 부모객체의 abc메소드 호출
	}
	
	void def () {
		super.ab();	// 부모객체의 ab메소드 호출
	}
	
}

public class Super_Keyword02 {
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Bb bb = new Bb();		// bb : Aa, Bb티입 내포
		bb.bcd();	// 자기 자신의 abc() 메소드 호출됨, this 
		bb.cde();	// 부모클래스의 abc() 호출
		bb.def();	// 부모클래스의 ab() 호출
	}
}
