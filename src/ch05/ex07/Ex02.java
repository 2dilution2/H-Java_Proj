package ch05.ex07;

public class Ex02 {
	public static void main(String[] args) {
/*
		main 메소드의 배열 
		args : 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		for문을 사용해 처리
		합계 : <실수의 합>
 */
		
		double sum = 0;
		
		
		for (int i = 1; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
			
		}
		System.out.printf("합계는 : %.3f", sum);
		
	}
}
