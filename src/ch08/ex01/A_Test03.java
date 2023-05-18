package ch08.ex01;

import ch08.ex02.A;

public class A_Test03 extends A { 		// A : 부모클래스, A_Test03 : 자식 클래스  <- 상속관계 형성
	
	// 부모클래스 : A 클래스의 필드 중 : public 과 protected만 접근가능
	int k = a;
	int l = b;
//	int m = c;
//	int n = d;
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		// 접근 가능한 필드, 메소드 : public / protected
		System.out.println(a1.a);
		a1.abc();
		
		A_Test03 t1 = new A_Test03();
		
		System.out.println(t1.a);	// A클래스의 a필드 : public
		System.out.println(t1.b);	// A클래스의 b필드 : protected
		
		
	}
}
