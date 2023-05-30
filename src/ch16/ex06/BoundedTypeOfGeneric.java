package ch16.ex06;

// 제너릭에 들어오는 타입 제한을 위한 클래스 생성
class A {}

class B extends A {}

class C extends B {}

class D <T extends B> {	// T : B,C 만 처리되도록 제한을 가함
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class E <T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
		// E 클래스를 객체화 했을때 T에 모든 타입이 올 수 있다.
		E<String> e1 = new E<>();
		E<Integer> e2 = new E<>();
		E<Double> e3 = new E<>();
		E<A> e4 = new E<>();
		E<B> e5 = new E<>();
		E<B> e6 = new E<>();
		
		// D클래스를 객체화 했을 떄 T에타입제한 : B,C만 올 수 있다.
//		D<String> d1 = new D<>();
//		D<Integer> d2 = new D<>();
//		D<Double> d3 = new D<>();
//		D<A> d4 = new D<>();
		
		D<B> d5 = new D<>();
		D<B> d6 = new D<>();
	}
}
