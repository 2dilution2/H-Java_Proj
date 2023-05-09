package ch04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// do while 
		int a;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1. 구구단 출력\t\t2. 19단 출력\t\t3. 19단 중 7의 배수단 출력\t\t4. 프로그램 종료");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("위의 번호를 입력하시오");
			a = sc.nextInt();
			
			if (a == 1) {
				for (int i = 1; i < 10; i++) {
					System.out.println(i + "단");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i*j);	
					}
					System.out.println();
				}
				System.out.println();
			} else if (a == 2) {
				for (int i = 1; i < 20; i++) {
					System.out.println(i + "단");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i*j);	
					}
					System.out.println();
				}
				System.out.println();
			} else if (a == 3) {
				for (int i = 1; i < 20; i++) {
					if (i%7 == 0) {
						System.out.println(i + "단");						
						for (int j = 1; j < 20; j++) {
							System.out.printf("%d * %d = %d\t", i, j, i*j);	
						}
					}
				}
				System.out.println();
			} else if (a<4) {
				System.out.println("잘못 눌렀습니다");
			}else {
				System.out.println("종료되었습니다.");				
			}
			
		} while (a != 4);
		
	}

}
