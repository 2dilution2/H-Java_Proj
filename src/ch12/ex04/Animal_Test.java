package ch12.ex04;

public class Animal_Test {
	public static void main(String[] args) {
		// 1. 각 클래스를 객체화 해서 Interface타입으로 지정 후 메소드 호출, Animal (인터페이스) / 
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Lion();
		Animal a4 = new Tiger();
		
		a1.cry();
		a1.run();
		
		a2.cry();
		a2.run();
		
		a3.cry();
		a3.run();
		
		a4.cry();
		a4.run();
		
		System.out.println("---------------------");
		
	}
}
