package ch10.ex06;

class Aaa {
	// 기본 생성자
	Aaa () {
		System.out.println("Aaa 생성자 호출");
	}
}

class Bbb extends Aaa{
	Bbb () {
		// super();	생략
		System.out.println("Bbb 생성자 호출");
	}
}

class Ccc {
	Ccc (int a) {
		System.out.println(a);
		System.out.println("C 생성자 호출");
	}
}

class Ddd extends Ccc {
	Ddd() {
		super(3);
		System.out.println("D 생성자 호출");
	}
}

public class Super_Method {
	public static void main(String[] args) {
		
		// 자식객체 생성시 부모의 기본생성자를 먼저 호출 후 자신의 객체가 생성됨
		Bbb bbb1 = new Bbb();
		
		System.out.println("------------------------------");
		
		// 자식객체 생성 시 부모객체를 먼저 호출
		Ddd ddd1 = new Ddd();
		
		
	}
}
