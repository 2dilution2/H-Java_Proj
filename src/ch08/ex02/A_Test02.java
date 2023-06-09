package ch08.ex02;

import ch08.ex02.A;

public class A_Test02 {
	public static void main(String[] args) {
		// A 클래스와 다른 패키지에 존대 : import / 클래스의 전체이름 : 패키지명, 클래스명
		
		// 1. 다른패키지의 클래스를 전체이름으로 사용
		ch08.ex02.A a1 = new ch08.ex02.A();
		
		// 2. import 해서 사용
		A a2 = new A();
		
		// 접근가능한 필드나, 메소드 : public 접근제어자만 접근가능
		System.out.println(a1.a);		// public
		System.out.println(a1.b);		// protected (상속관계가 설정되어있을때 다른패키비제서 접근이 됨)
		System.out.println(a1.c);		// default
//		System.out.println(a1.d);		// private
		
		a1.abc();
		a1.bcd();
		a1.cde();
//		a1.def();
		
	}
}
