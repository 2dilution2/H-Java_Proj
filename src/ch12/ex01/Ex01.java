package ch12.ex01;

abstract class Car {	// 추상클래스 : 트럭, 자가용, 굴삭기, 봉고
	
	abstract void run();
	abstract void eat();
	
}

class Truck extends Car {

	@Override
	void run() {
		System.out.println("트럭은 짐을 싣고달립니다.");
	}

	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다.");
	}
	
}

class Sedan extends Car {

	@Override
	void run() {
		System.out.println("자가용은 사람을 태우고달립니다.");
	}

	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다.");
	}
	
}

class excavator extends Car {

	@Override
	void run() {
		System.out.println("굴삭기는 땅을파고 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다.");
	}
	
}

class bongo extends Car {

	@Override
	void run() {
		System.out.println("봉고는 사람을 많이 태우고 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("봉고는 LPG를 먹습니다.");
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Car t1 = new Truck();
		Car s1 = new Sedan();
		Car e1 = new excavator();
		Car b1 = new bongo();
		
		t1.eat();
		t1.run();
		
		s1.eat();
		s1.run();
		
		e1.eat();
		e1.run();
		
		b1.eat();
		b1.run();
		
	}
}
