package ch04.ex03;

import java.util.Iterator;

public class For_Statment {

	public static void main(String[] args) {
/*
			반복문 : for, while, do while , 조건이 true일동안 반복, 조건이 false이면 구문을 빠져나온다.
			
			for (변수의 초기값; 조건;증감식){
				조건이 True인동안 반복 실행
			}	
 */
		
		// 1. for문의 기초
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		
		for (int i = 100, j = 200; i < 1000; i++, j++) {
			System.out.printf("변수 i : %d, 변수 j : %d\n", i, j);
		}
		
		System.out.println("---------------------------------------------");
		
		int b;
		for ( b = 0; b < 100; b+=2) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		// for문을 이용해 0~1000 사이의 3의 배수만 출력
		for (int c = 0; c < 1000; c+=3) {
			System.out.print(c + ",");
		}
		System.out.println();

		// for문을 사용해서 2단
		for (int i = 2, j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
		
		System.out.println();
		
		// for문을 사용해서 2단 (printf를 이용해서)
		for (int i = 2, j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j,  i * j);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
