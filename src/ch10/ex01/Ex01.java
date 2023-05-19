package ch10.ex01;

// 부모 클래스 (Animal)
class Animal {
	String name;
	int age;
	String color;
	
	void eat () {
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}
	
	void sleep () {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
}

// 자식클래스 (Tiger, Egle, Lion)

class Tiger extends Animal {
	String sound;
	void tigerRun () {
		System.out.println("호랑이는 겅중겅중 뜁니다.");
	}
}
 
class Egle extends Animal {
	String sound;
	void egleRun () {
		System.out.println("독수리는 하늘을 납니다.");
	};
}

class Lion extends Animal {
	String sound;
	void lionRun () {
		System.out.println("사자는 펄쩍펄쩍 뜁니다.");
	};
}

class LionChild extends Lion {
	void lionChildRun() {
		System.out.println("새끼사자는 엉금엉금 기어갑니다.");
	}
}
// 자식의 자식 클래스 (LionChild)

public class Ex01 {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		t1.name = "호돌이";
		t1.age = 3;
		t1.color = "호피무늬";
		t1.sound = "어흥";
		
		t1.tigerRun();
		t1.eat();
		t1.sleep();
		
		Egle e1 = new Egle();
		
		e1.name = "수리";
		e1.age = 5;
		e1.color = "갈색";
		e1.sound = "끼이익";

		e1.egleRun();
		e1.eat();
		e1.sleep();
		
		Lion l1 = new Lion();
		
		l1.name = "사자";
		l1.age = 7;
		l1.color = "노란색";
		l1.sound = "으르렁";

		l1.lionRun();
		l1.eat();
		l1.sleep();
		
		LionChild l2 = new LionChild();
		
		l2.name = "아가사자";
		l2.age = 2;
		l2.color = "노란색";
		l2.sound = "으르렁";

		l2.lionChildRun();
		l2.eat();
		l2.sleep();
	}
}
