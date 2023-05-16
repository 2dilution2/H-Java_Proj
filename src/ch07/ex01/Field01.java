package ch07.ex01;

class A {
	
	// 필드 : Heap에 저장이 됨 
	// 		- 인스턴스 필드 : 필드 이름 앞에 static키가 들어가있지않은 필드, Heap에 저장됨, 객체화 해야 사용 가능
	//			다른 객체와 공유되지않는 필드
	//		- 정적(static)필드 : 필드 이름앞에 static키가 붙어있는 필드, static 공간에 저장됨
	//			객체화해서 사용, 객체화 하지않고 , 클랫 이름으로 바로 사용
	
	int a;				// 인스턴스 필드, 그 객체에서만 사용가능, Heap
	static int b;		// 정적(static)필드, 모든 객체에서 공유되는 필드
	
}

public class Field01 {
	public static void main(String[] args) {
		
		// A클래스 (타입) 으로 a객체 생성
		A a = new A();		// a객체를 생성, 기본생성자를 호출
		A aa = new A();
		A aaa = new A();
		
		// 각 객체의 필드값 입력 : 인스턴스 필드의 값을 입력 : 그 객체에서만 허용
		a.a = 10;
		aa.a = 20;
		aaa.a = 30;
		
		System.out.println(a.a);
		System.out.println(aa.a);
		System.out.println(aaa.a);
		System.out.println("------------------");
		
		// 정적(static) 필드의 값 입력 : 모든 객체가 공유되는 필드 <- A class 로 생성된 모든 객체가 공유되어 사용 되는 필드
		a.b = 10;
		aa.b = 20;
		aaa.b = 30;
		
		System.out.println(a.b);
		System.out.println(aa.b);
		System.out.println(aaa.b);
		
		// 정적(static) 필드 : 객체화 하지않고, 클래스 이름으로 바로 사용 가능
		
		A.b = 50;
		
		System.out.println(A.b);
		
		System.out.println(a.b);
		System.out.println(aa.b);
		System.out.println(aaa.b);
		
		
		
		
		
		
		
	}
}
