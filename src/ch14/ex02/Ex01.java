package ch14.ex02;

class A {

}

class B extends A {

}

class C extends A {

}

public class Ex01 {
	public static void main(String[] args) {
		// 예외처리

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 처리");
		}

		
		A a1 = new B();

		try {
			C c1 = (C) a1;
		} catch (ClassCastException e) {
			System.out.println("ClassCastException 처리");
		}
		System.out.println("프로그램 마지막라인");
	}
}
