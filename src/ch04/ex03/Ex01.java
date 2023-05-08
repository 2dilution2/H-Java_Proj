package ch04.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 1~9까지의 정수를 인풋 받아서 for문을 사용
		// 인풋받은 구구단를 출력
		Scanner sc= new Scanner(System.in);
		
		System.out.println("출력을 원하는 구구단을 입력하세요.");
		
		for (int i = sc.nextInt() , j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
		
		for (int i = sc.nextInt(), j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j,  i * j);
		}
		
		sc.close();
		
	}

}
