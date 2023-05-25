package ch14.ex02;

public class TryCatch {
	public static void main(String[] args) {
		// 예외처리 : 예외가 발생되더라도 프로그램이 멈추지않도록 처리

		try {

			System.out.println(3 / 0);

		} catch (ArithmeticException e) {
			// try 블럭에서 오류가 발생되면 catch블럭이 작동이 되고, 
			// try 블럭에서 오류가 발생되지않으면 catch블럭이 작동되지않음
			
			System.out.println("catch블럭 작동");
		} finally {
			// try블럭의 오류발생여부와 관계없이 작동
			System.out.println("Finally 블럭은 무조건 작동한다.");
			
		}

		System.out.println("===프로그램 마지막 라인===");
		
	}
}
