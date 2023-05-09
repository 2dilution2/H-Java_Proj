package ch04.ex03;

public class Ex04 {

	public static void main(String[] args) {
		// 이중for문을 이용 1단에서 19단까지 출력
		
		for (int i = 1; i < 20; i++) {
			System.out.println(i+"단 출력");
			for (int j = 1; j < 20; j++) {
				if (j == 10) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);										
				} else {
					System.out.printf("%d * %d = %d\t", i, j, i*j);										
				}
				
			}
			System.out.println();
		}
		
		System.out.println("==========================1~19단 출력============================");
		
		for (int i = 1; i < 20; i++) {
			System.out.println(i+"단 출력");
			for (int j = 1; j < 20; j++) {
				if (i*j%3 == 0 ) {
					System.out.printf("%d * %d = %d\t", i, j, i*j);										
				}
				
			}
			System.out.println();
		}

	}

}
