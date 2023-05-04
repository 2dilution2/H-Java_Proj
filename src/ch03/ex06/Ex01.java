package ch03.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 문제 : Scanner로 정수값을 인풋, 삼항 연산자를 사용해 그 값이 홀수인지 짝수인지 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		String val1 ;
		int tmp;
		
		
		System.out.println("정수를 입력하시오");
		tmp = sc.nextInt();
		
		val1 = (tmp%2 == 0) ? "짝수입니다." : "홀수 입니다";
		
		System.out.printf("입력하진 숫자는 %d이고 ", tmp);
		System.out.println(val1);
	}
}
