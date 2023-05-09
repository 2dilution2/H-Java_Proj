package ch04.ex03;

import java.util.Iterator;

public class For_Statement04 {

	public static void main(String[] args) {
		// for문에서 오류를 일으키기 쉬운 부분
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		// 무한루프 발생
		for (int i = 0, j = 0; i < 10; j++) {
			System.out.println(i + "," + j);
			if (j==1000) {
				break;
			}
		}
		
		System.out.println("무한루프 발생");
		
		for (int i = 10; i < 100; i+=10) {
			System.out.println(i);
			
		}
		
		int i, j;
		
//		for (int i = 0; i < 10; i++) {		지역변수 중복선언
//			
//		}
		
		for (i = 0; i < 10; i++) {
			
		}
		
		
		
		
	}

}
