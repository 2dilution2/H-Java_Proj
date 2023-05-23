package ch10.ex06;

class A {
	int a;

	// 다른생성자가 존재하지않을경우 기본생성자는 생략가능
	// 자식클래스를 생성하는 순간 부모클래스의 다른생성자가 존재할 때 기본생성자를 반드시 명시적으로 만들어야 한다.
	A () {
		
	}
	
	A (int a){
		this.a = a;
	}
}

class B extends A {
	// 기본생성자가 생략되어있음
	// 자식클래스는 객체화할때 부모클래스의 생성자를 호출
	B (int a) {
		super();	
	}

}

public class Super_Keyword {
	public static void main(String[] args) {
		
	}
}
