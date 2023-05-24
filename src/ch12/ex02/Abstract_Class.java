package ch12.ex02;

// 1. 콘크리트 클래스 생성 후 사용 : 자주 사용하는 경우
abstract class A {	// 추상클래스
	// 추상메소드
	abstract void cry ();
}

class B extends A {	// 		
	@Override
	void cry() {
		System.out.println("구현된 메소드 출력");
	}
}

// 2. 익명클래스로 사용하는 방법 : 한번사용하고 버리는 경우
abstract class C {
	abstract void cry();
}

abstract class D {
	abstract void run();
	abstract void eat();
}

public class Abstract_Class {
	public static void main(String[] args) {
		
		// 1. 구현 클래스를 만들고 사용하는 방법 (콘크리트 클래스를 객체화 해서 타입을 추상클래스로 저장 후 출력
		A a1 = new B();
		a1.cry();
		
		// 2. 익명클래스를 생성해서 사용하는 방법
		C c1 = new C() {
			
			@Override
			void cry() {
				System.out.println("C클래스의 구현된 메소드");
			}
		};
		c1.cry();
		
		D d1 = new D() {
			
			@Override
			void run() {
				System.out.println("D클래스의 run()");
			}
			
			@Override
			void eat() {
				System.out.println("D클래스의 eat()");
			}
		};
		
		d1.eat();
		d1.run();
		
	}
}
