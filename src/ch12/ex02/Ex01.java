package ch12.ex02;

abstract class Calc {
	abstract int add (int a, int b);	// 두 정수값을 인풋받아 더한값을 리턴
	abstract int diff (int a, int b);
	abstract int mul (int a, int b);
	abstract double div (int a, int b);
}

class Clac1 extends Calc {

	@Override
	int add(int a, int b) {
		int n = a + b;
		return n;
	}

	@Override
	int diff(int a, int b) {
		int n = a - b;
		return n;
	}

	@Override
	int mul(int a, int b) {
		int n = a * b;
		return n;
	}

	@Override
	double div(int a, int b) {
		double n = a / b;
		return n;
	}
	
}

abstract class Calc2 {
	abstract int add (int a, int b);
	abstract int diff (int a, int b);
	abstract int mul (int a, int b);
	abstract double div (int a, int b);
}

public class Ex01 {
	public static void main(String[] args) {
		// 위에있는 추상클래스를 1. 콘크리트클래스를 생성해서 작동,
		// 2. 익명클래스로 작동
		
		System.out.println("콘크리트 클래스사용");
		Calc c1 = new Clac1();
		System.out.println(c1.add(1, 2));
		System.out.println(c1.diff(5, 3));
		System.out.println(c1.mul(2, 3));
		System.out.println(c1.div(8, 4));
		
		
		System.out.println("익명 클래스 이용");
		Calc2 c2 = new Calc2() {
			
			@Override
			int add(int a, int b) {
				int n = a + b;
				return n;
			}

			@Override
			int diff(int a, int b) {
				int n = a - b;
				return n;
			}

			@Override
			int mul(int a, int b) {
				int n = a * b;
				return n;
			}

			@Override
			double div(int a, int b) {
				double n = a / b;
				return n;
			}
		};
		
		System.out.println(c2.add(1, 2));
		System.out.println(c2.diff(5, 3));
		System.out.println(c2.mul(2, 3));
		System.out.println(c2.div(8, 4));
	}
}
