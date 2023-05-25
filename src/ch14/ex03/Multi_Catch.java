package ch14.ex03;

public class Multi_Catch {
	public static void main(String[] args) {
		// 1. 각각 처리하는 방법
		
		try {
			
			System.out.println(3/0);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException - 발생");
		}
		
		try {
			
			int num = Integer.parseInt("10!");
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException - 발생");
		}
		
		// 2. try블럭에 여러 예외를 한번에 처리
		try {
			
			System.out.println(3/0);
			int num = Integer.parseInt("10!");
			
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("입력한 값은 정수로 변환할 수 없습니다.");
		}
		
		
		// 3. catch 여러예외를 반꺼번에 처리
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10!");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("여러예외를 하나의 블럭에서 처리");
		}
		
	}
}
