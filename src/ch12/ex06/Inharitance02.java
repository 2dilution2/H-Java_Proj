package ch12.ex06;

interface Animal1 {
	void cry();
}
interface Animal2 {
	void run();
}
interface Animal3 {
	void eat();
}

// 인터페이스가 인터페이스를 상속 할 수 있다. (extends)

interface k extends Animal1, Animal2, Animal3 {
	
}

class G implements k {

	@Override
	public void cry() {
		System.out.println("모든 동물은 웁니다.");
	}

	@Override
	public void run() {
		System.out.println("모든 동물은 달립니다.");
	}

	@Override
	public void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	
}

public class Inharitance02 {
	public static void main(String[] args) {
		K k1 = new G();
		k1.cry();
		k1.run();
		
	}
}
