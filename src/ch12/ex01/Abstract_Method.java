package ch12.ex01;

abstract class A {
	// 인스턴스 필드 : 객체화 Heap
	int a = 10;
	int b = 20;

	// 일반 메소드 : 구현부가 있는 메소드
	void print() {
		System.out.println();
	}

	// 추상 메소드 : 구현부가 없는 메소드
	abstract void run();
}

class Cat extends A { // 콘크리트 클래스 : 추상클래스에서 선언해놓은 추상메소드를 구현하는 클래스
	@Override
	void run() {
		System.out.println("고양이는 펄쩍펄쩍 뛰어다닙니다.");
	}
}

class Dog extends A {
	@Override
	void run() {
		System.out.println("개는 껑충껑충 뛰어다닙니다.");
	}
}

class Egle extends A {
	@Override
	void run() {
		System.out.println("독수리는 훨훨 날아다닙니다.");
	}
}


public class Abstract_Method {
	public static void main(String[] args) {
		// 1. 추상클래스 : 추상메소드를 포함하는 클래스
//		A a = new A();
		
		// 2. 추상클래스는 타입으로 지정이 가능 : 자식을 객체화 해서 부모타입으로 지정
		A cat1 = new Cat();		// cat1 : A / Cat
		A dog1 = new Dog();		// dog1 : A / Dog
		A egle1 = new Egle();	// egle1 : A / Egle
		
		// 3. 부모의 추상메소드를 실행하면 오버라이딩된 자식클래스의 메소드가 출력
		cat1.run();
		dog1.run();
		egle1.run();
		
		// 4. 배열에 넣고 출력
		A[] arr = new A[] {cat1, dog1, egle1};
		
		// 5. for문을 사용해 배열 각방의 내용을 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i].run();
		}
		
		// 6. enhanced for문을 사용해 출력
		for (A a : arr) {
			a.run();
		}
	}
}
