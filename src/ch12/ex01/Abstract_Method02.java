package ch12.ex01;
abstract class Animal {			// 추상 클래스
	// 구현부가 없이 선언만 된 클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}
class Tiger extends Animal {	// 콘크리트 클래스 : 추상메소드를 모두 구현한 클래스
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 빠르게 달립니다.");
	}
	
	@Override
	void cry() {
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
}

abstract class Lion extends Animal {	// 추상클래스 : 부모의 추상멤소드를 일부만 구현

	@Override
	void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}

	@Override
	void run() {
		System.out.println("사자는 잘 달리지 않습니다.");
	}
	
}

class LionChild extends Lion {			// 콘크리트 클래스 : 부모의 추상메소드를 모두 구현한 클래스
	@Override
	void cry() {
		System.out.println("새끼사자는 응애 하고 웁니다.");
	}
}

public class Abstract_Method02 {
	public static void main(String[] args) {
		// 1. 추상 클래스는 객체화 할 수 없다.
//		Animal a2 = new Animal();
		
		// 2. 자식클래스를 객테화해서 타입으로 지정은 가능하다.
		Animal a2 = new Tiger();
		
//		Animal a3 = new Lion();	// 추상 클래스이므로 객체화 할 수 없다.
		
		Animal a3 = new LionChild();
		
	}
}
