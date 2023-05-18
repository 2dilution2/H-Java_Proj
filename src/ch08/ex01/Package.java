package ch08.ex01;
// 클래스 외부 구성요소
import ch08.ex02.Student;
	
class A {
	public int a;
	protected int b;
	/*default*/ int c;
	private int d;
	
	// 메소드에 선언된 접근제어자
	public void a() {			// 외부 패키지에서 호출 가능
		System.out.println("a 메소드 출력");
	}
	protected void b() {		// 상속관계가 있을때만 외부패키지에서 접근 가능 
		System.out.println("b 메소드 출력");
	}
	/*default*/ void c() {		// 같은 패키지 내에서만 접근 가능
		System.out.println("c 메소드 출력");
	}
	private void d() {			// 같은 클래스에서만 접근 가능
		System.out.println("d 메소드 출력");
	}
}

public class Package {
	// 클래스 내부 구성요소 블럭
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		// 외부 클래스를 import할때는 해당 클래스의 접근 지정자가 public
		
		// import 후 외부패키지를 불러들일 수 있음
		Student s1 = new Student();
		
		// import 없이 바로 접근 : 클래스의 전체이름으로 접근 : 패키지명.클래스명
		ch08.ex02.Student s2 = new ch08.ex02.Student(); 
		
		s1.stName = "홍길동";
		
	}
}
