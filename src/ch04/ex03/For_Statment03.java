package ch04.ex03;

public class For_Statment03 {

	public static void main(String[] args) {
/*
			이중 for문을 사용해 구구단 출력
			
 */
		int i, j;		// i : 단을 출력하는 변수, j : 1~9번까지 출력되는 변수
		
		for ( i = 1; i < 10; i++) {
			System.out.println(i + "단 시작");
			for ( j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		
	}

}
