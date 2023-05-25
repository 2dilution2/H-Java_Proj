package ch14.ex03;

public class Multi_Catch02 {
	public static void main(String[] args) {
		
		// 여러 예외들을 세부적으로 처리하고 나머지 예외는 Exception으로 처리
		
		try {
			
			System.out.println(3/0);
			int num = Integer.parseInt("10!");
			
		} catch (ArithmeticException e) {

			System.out.println();
			
		} catch (NumberFormatException e) {
			
			System.out.println();
			
		} catch (Exception e) {
			
			System.out.println("Exception클래스가 모든 예외를 캡쳐");
			
		}
	}
}
