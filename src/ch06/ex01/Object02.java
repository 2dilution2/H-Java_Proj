package ch06.ex01;

//클래스 외부 블럭 : 1. 패키지이름, 2. 임포트, 3. 외부클래스

class A{	// 외부클래스 : public클래스는 1개만 존재해야함
	
	// 1. 생성자 : 리턴타입이 없고 클래스 이름과 동일한 메소드, 객체를 생성시 생성자를 호출,
		// A(){} : 인풋의 매개변수가 없는 생성자를 기본생성자, 기본생성자는 생략될 수 있다.
		// 생성자는 필드의 값을 초기화 할때 사용됨
	public A() {}		// 기본 생성자 : 생략가능, 생성자가 존재하지않으면 객체를 생성할 수 없다.
	// 2. 필드 : 객체화 해서 사용됨. (Heap 메모리에 저장됨)
	int m = 3;
	int n = 7;
	double d = 10.5;
	
	// 3. 메소드 (호출 시 작동, 필드의 내용을 출력하는 메소드
	public void print () {
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("d : " + d);
	}
	
}

public class Object02 {
	// 클래스 내부 블럭 : 1. 필드, 2. 메소드(함수), 3. 생성자, 4. 이너 클래스 (클래스 내부의 클래스)
	
	public static void main(String[] args) {
		//메인 메소드 (함수)
		
		int b = 10;
		
		// 객체생성 : 클래스의 필드와 메소드를 객체화 해서 RAM으로 로드함
		A a = new A();
		
		// 객체의 필드값을 출력
		System.out.println(a.m);
		System.out.println(a.n);
		System.out.println(a.d);
		
		// a객체의 메소드 호출
		a.print();
		
		System.out.println("------------------------");
		// 객체의 필드값을 수정 후 출력
		a.m = 100;
		a.n = 200;
		a.d = 300.55;
		
		// 메소드 호출

		a.print();
		
		System.out.println("------------------------");
	}
}
