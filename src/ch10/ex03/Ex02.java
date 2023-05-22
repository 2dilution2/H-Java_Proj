package ch10.ex03;

import java.util.Iterator;

class Animal1 {
	
	void run () {
		System.out.println("Animal 클래스의 run() - 모든 동물은 달립니다.");
	}
}

class Tiger1 extends Animal1 {
	@Override
	void run() {
		System.out.println("호랑이는 껑충껑충 달립니다.");
	}
}

class Egle1 extends Animal1 {
	@Override
	void run() {
		System.out.println("독수리는 훨훨 납니다.");
	}
}

class Cat extends Animal1 {
	@Override
	void run() {
		System.out.println("고양이는 살금살금 걷습니다.");
	}
	
}

class CatChild extends Cat {
	@Override
	void run() {
		System.out.println("새끼고양이는 엉금엉금달립니다.");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		// 자식클래스를 객체화해서 부모타입으로 지정
		// 보모의 메소드를 호출 시 자식의 오버라이딩된 메소드가 출력
		
		Animal1 a1 = new Tiger1();
		Animal1 a2 = new Egle1();
		Animal1 a3 = new Cat();
		Animal1 a4 = new CatChild();
		
		// Animal 의 run()메소드	<= 자식클래스의 run()이 작동됨 
		
		a1.run();
		a2.run();
		a3.run();
		a4.run();
		
		// 배열에 저장해서 한번에 출력
		System.out.println("-----배열에 저장 후 한번에 출력------");
		
		Animal1[] arr1 = new Animal1[] {a1, a2, a3, a4};
		
		// for 문을 이용해 각 배열의 메소드 호출
		for (int i = 0; i < arr1.length; i++) {
			
			// Animal 타입의 run이 호출됨
			arr1[i].run();
		}
		
		// Enhanced for문을 이용해 출력
		System.out.println("----Enhanced for문을 이용해 출력----");
		
		for (Animal1 k : arr1) {
			k.run();
		}
		
		
		
	}
}
