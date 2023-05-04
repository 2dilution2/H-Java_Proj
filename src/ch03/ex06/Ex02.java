package ch03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋, 3,6,9의 배수인지 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		String val1 ;
		int tmp;
		
		
		System.out.println("정수를 입력하시오");
		tmp = sc.nextInt();
		
		val1 = (tmp%3 == 0) ? "3,6,9의 배수입니다." : "3,6,9의 배수가 아닙니다";
		
		System.out.print("입력하진 숫자는 ");
		System.out.println(val1);

	}

}
