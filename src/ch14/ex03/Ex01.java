package ch14.ex03;

class A {
	int a;
}

class B extends A {
	int b;
}

class C extends A {
	int c;
}

public class Ex01 {
	public static void main(String[] args) {

		A a1 = new B();

		String[] arr = new String[] { "안녕", "오늘", "날씨", "맑음" };

		String str = null;

		System.out.println("===1방법으로 예외처리 (각각 처리)===");

		try {
			C c1 = (C) a1; // 예외발생
		} catch (ClassCastException e) {
			System.out.println("ClassCastException - 처리");
		}
		try {
			System.out.println(arr[4]); // 예외발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ClassCastException - 처리");
		}
		try {
			System.out.println(str.charAt(1)); // 예외발생
		} catch (NullPointerException e) {
			System.out.println("NullPointerException - 처리");
		}

		System.out.println("===2방법으로 예외처리 (여러 catch로 예외처리)===");

		try {
			C c1 = (C) a1; // 예외발생
			System.out.println(arr[4]); // 예외발생
			System.out.println(str.charAt(1)); // 예외발생
		} catch (ClassCastException e) {
			System.out.println("ClassCastException - 처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ClassCastException - 처리");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException - 처리");
		}

		System.out.println("===3방법으로 예외처리 (Exception으로 한꺼번에 처리)===");

		try {
			C c1 = (C) a1; // 예외발생
			System.out.println(arr[4]); // 예외발생
			System.out.println(str.charAt(1)); // 예외발생
		} catch (Exception e) {
			System.out.println("Exception - 한번에 처리");
		}

		System.out.println("===4방법으로 예외처리 (catch블럭에서 세밀하게 처리하고 그외는  Exception처리)===");

		try {
			C c1 = (C) a1; // 예외발생
			System.out.println(arr[4]); // 예외발생
			System.out.println(str.charAt(1)); // 예외발생
		} catch (ClassCastException e) {
			System.out.println("ClassCastException - 처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ClassCastException - 처리");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException - 처리");
		} catch (Exception e) {
			System.out.println("Exception - 나머지 한번에 처리");
		}

	}
}
