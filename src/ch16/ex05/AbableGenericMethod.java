package ch16.ex05;

class A {
	
	// 매개변수타입으로 들어오는 변수에서 Object의 메소드만 사용 가능하다.
	public <T> void method (T t) {
//		t.length();		// length() : String 타입에만 존재하는 메소드
		
		System.out.println(t.equals("안녕"));	// Object의 메소드로 사용 가능
	}
	
	public int method2 (String s) {
		return s.length();
	}
}

public class AbableGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.method2("안녕하세요"));
		
		a.<String> method("안녕");
		a.method("안녕");
		
		a.<Integer> method(10);
		a.method(10);
		
	}
}
