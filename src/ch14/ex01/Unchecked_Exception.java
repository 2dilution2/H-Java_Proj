package ch14.ex01;

class A {
	int a;
	int b;
}

class B extends A {
	int c;
	int d;
}

class C extends A {
	int e;
	int f;
}

public class Unchecked_Exception {
	public static void main(String[] args) {
		// 1. ArithmethicException : 정수를 0으로 나누면 발생되는 예외
			// 컴퓨터 프로그램에서는 0으로 나눌 시 오류발생
//		System.out.println(3/0);
		
		// 2. ClassCastingException : 다운캐스팅할때 타입이 객체안에 존재하지않을때
		A a1 = new B();
		A a2 = new C();
		
//		C c1 = (C) a1;
		
		// 3. ArrayIndexOutOfBoundException : 배열의 방번호를 넘어간 경우 발생되는 예외
		int[] arr = new int [] {1,2,3,4,5};
//		System.out.println(arr[5]);
		
		// 4. NumberFormatException : 문자타입의 정수나 실수를 정수나 실수로 바꿀때 발생
		String a = "10!";
//		int num = Integer.parseInt(a);
		
		// 5. NullPointException : 참조주소의 값이 Null 인데 메소드를 호출하는 경우
		a = null;
		
		System.out.println(a.charAt(2));
	}
}
