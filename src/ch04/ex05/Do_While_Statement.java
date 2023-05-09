package ch04.ex05;

public class Do_While_Statement {

	public static void main(String[] args) {
/*
		do while문
		
			while문 : 조건에 맞을때 실행블럭 실행
			while (조건) {
				실행블럭
				증감식
			}
			
			do while문 : 조건에 맞지않아도 일단 한번은 실행블럭 실행
			do {
				실행블럭
				증감식
			} while (조건);
			
 */
		
		// 1. while문
		System.out.println("---while문---");
		int a = 0;
		while (a<0) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// 2. do while문
		System.out.println("---do while문---");
		do {
			System.out.print(a + " ");
		} while (a<0);
		System.out.println();
		
		//3. 반복횟수가 10번인 경우 : while문과 do while문 비교		
		System.out.println("---while문---");
		a = 0;
		while (a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		System.out.println("---do while문---");
		a = 0;
		do {
			System.out.print(a + " ");	
			a++;
		} while (a<10);
		
		
		
		
	}

}
