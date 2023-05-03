package ch02.ex01;

public class UseageOfDataType {
	
	public static void main(String[] args) {
		// 변수선언 두가지 방법
		// 1. 변수를 선언하고 나중에 값 대입
		int a;
		
//		System.out.println(a); // 변수초기화가 되지않아 오류가 발생
		
		a = 10;
		System.out.println(a);
		
		// 2. 변수 선언과 동시에 값 대입
		int b = 20;
		System.out.println(b);
		
		b = 30;
		System.out.println(b);
		
		// 상수선언 : 변수이름 앞에 final울 넣는다, 상수의 이름은 전체 대문자로 사용
			// 상수는 초기화가 되면 다른값으로 변경이 불가
		
		final double PI = 3.14;
		System.out.println(PI);
		
//		PI = 3.1415;		// 변경이 불가하다.
		
		
	}
}
