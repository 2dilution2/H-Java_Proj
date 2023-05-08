package ch04.ex03;

public class Ex02 {

	public static void main(String[] args) {
/* 
		2중 for문을 사용해 구구단 출력
		
		
 */
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
	}

}
