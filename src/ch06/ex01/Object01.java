package ch06.ex01;

import java.util.Scanner;

// 클래스 외부 블럭 : 1. 패키지, 2. 임포트, 3. 외부클래스

public class Object01 {
	// 클래스 내부 블럭 : 1. 필드, 2. 메소드(함수), 3. 생성자 : 클래스 이릅과 동일한 메소드(return이 없음)
	
	// 생성자 : 변수의 값을 초기화 시에 사용됨, 객체 생성시 생성자를 호출함
	public Object01() {}
	
	// 필드 : 객체화를 해서 사용가능
	int a = 100;		
	int b = 200;
	
	// 메소드 (함수) : 호출 시 작동 / 
	public void plus(int a, int b) {
		System.out.println(a + b);
	}
		
	public static void main(String[] args) {
		// main메소드 블럭
		
		int a = 10;		// 지역변수 : 메소드 내부에서 선언된 변수
		Scanner sc = new Scanner(System.in);
		
		// 1. 객체생성 : 클래스를 틀로해서 메모리에 올라가는 인스턴스, 클래스 <==> 객체
		Object01 oc1 = new Object01();
		// 클래스명 객체 = Heap영역에_객체생성 생성자호출
		
		// 2. 객체의 필드값 출력
		System.out.println(oc1.a);
		System.out.println(oc1.b);
		
		// 3. 객체의 메소드 호출
		oc1.plus(10, 20);
		
		System.out.println("----------------------------------");
		// 클래스는 객체화를 해야 사용 할 수 있다.
		// 하나의 클래스로 여러개의 객체를 생성할 수 있다.
		
		Object01 oc2 = new Object01();
		
		// 객체의 필드값 수정 및 출력
		oc2.a = 500;
		oc2.b = 700;
		
		System.out.println(oc1.a);
		System.out.println(oc1.b);
		
		// 메소드 호출
		oc2.plus(oc2.a, oc2.b);
		
		
		
		
		
		
	}
}
