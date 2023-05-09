package ch04.ex05;

import java.util.Scanner;

public class Do_While_Statement02 {
	public static void main(String[] args) {
		// do while문을 이용하여 무한루프를 돌리기
		// 4번을 누르면 종료
		Scanner sc = new Scanner(System.in);
		int num;
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		String name = "이희석";
		
		do {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1. 평균출력\t\t2. 합계출력\t\t3. 이름출력\t\t4. 프로그램 종료");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("위의 번호를 입력하시오");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.printf("평균은 %4.2f입니다\n", a+b+c+d/4.0);
			} else if (num == 2) {
				System.out.printf("합계는 %d입니다\n", a+b+c+d);
			} else if (num == 3) {
				System.out.printf("이름은 %s 입니다.\n", name);
			} else if (num>4) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.println("종료되었습니다.");
			}
			
		} while (num != 4);
		
		
		
		
		
		
		
	}
}
