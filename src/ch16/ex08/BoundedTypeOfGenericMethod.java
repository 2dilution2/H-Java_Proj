package ch16.ex08;

class A {	// 일반클래스의 제너릭 메소드
	
	// Number 클래스 : 정수나 실수를 처리하는 부모클래스
	
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

// 인터페이스 : 제너릭타입 제한시 인터페이스로 다중제한 가능(클래스는 하나만 가능)
	// 인터페이스로 제한을 두면 인터페이스를 구현한 하위의 모든 클래스가 타입 지정 가능

interface IF1{
	void print();
}
class Aa<T extends IF1>{
}

interface IF2{
	void eat();
}
interface IF3{
	void run();
}

class E <T extends IF1>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class B {
	public <T extends IF1> void method1(T t) {
		t.print();
	}
}


public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<Double> method1(88.88);
		
		a.<Float> method1(99.99F);
		a.<Integer> method1(100);
		
//		a.<String> method1("안녕");
		
		System.out.println("--------------------");
		
		B b1 = new B();
//		b1.<IF1> method1();		// 인터페이스는 객체생성 불가, 자식을 객체화 해서 타입으로는 지정 가능
		
//		b1.<IF1> method1(new Aa());
		
	}
}
