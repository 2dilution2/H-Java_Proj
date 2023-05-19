package ch10.ex02;

class Animal {
	String name;
	int age;
	void eat () {
		
	}
}

class Tiger extends Animal {
	String sound;
	void tigerRun() {
		
	}
}

class Lion extends Animal {
	String sound;
	void lionRun () {
		
	}
}

public class TypeCasting {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		// a1은 Animal 타입만 존재 : Animal클래스의 킬드나 메소드만 접근
			// al : Tiger , Lion, LionChild타입을 가지고있지않다.
		
		a1.age = 10;
		a1.name = "동물";
		a1.eat();
		
		Tiger t1 = new Tiger();
		
		t1.sound = "어흥";
		t1.tigerRun();
		
		t1.name = "호랑이";
		t1.age = 20;
		t1.eat();
		
		// 업캐스팅 : 자식 타입을 부모타입으로 변환
		Animal a2 = t1;		// Tiger => Animal 업캐스팅 (Animal 타입의 필드나 메소드만 접근 가능)
		
		// a2는 Animal티입으로 업캐스팅 : Animal의 필드/메소드만 접근
		System.out.println(a2.name);
		System.out.println(a2.age);
//		System.out.println(a2.sound);		// Tiger의 필드/메소드는 접근 불가
		
		// a2는 Animal타입으로 정의 : Tiger / Animal
		
		// 다운캐스팅 : 부모 => 자식 변환, 명시해서 변환, 반드시 instanceOf를 새용해 실행 시 오류가 나지않도록 처리 필요
		Tiger tt1 = (Tiger) a2;
		
		// tt1은 Tiger티입으로 다운캐스팅 : Tiger / Animal <= 부모/자식 필드/메소드 모두 사용 가능
		System.out.println(tt1.name);
		System.out.println(tt1.age);
		System.out.println(tt1.sound);
		tt1.tigerRun();
		
		System.out.println("-----------------------");
		
		// 3. Lion 객체를 생성 : l1 : Lion / Animal
			// 자식클래스를 객체화 시키면 부모클래스의 필드/메소드 모두 사용 가능
		Lion l1 = new Lion();
		
		Animal aa2 = l1;
		
		Lion ll2 = (Lion) aa2;
		
		System.out.println("----instanceof----");
		
		// 객체내부에 해당 타입이 존재하면 true, 존재하지않으면 false
		System.out.println(ll2 instanceof Animal);
		System.out.println(ll2 instanceof Lion);
		
		System.out.println(a1 instanceof Tiger);
		System.out.println(a1 instanceof Animal);

		
		if(a1 instanceof Tiger) {
			Tiger ttt1 = (Tiger) a1;		// 객체 내부에 해당 타입이 존재하지않는 경우 실행 시 오류가 발생
		} else {
			System.out.println("해당객체에는 Tiger 타입이 존재하지않습니다.");
		}
		
		
	}
}
