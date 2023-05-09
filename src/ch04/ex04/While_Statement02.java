package ch04.ex04;

public class While_Statement02 {

	public static void main(String[] args) {
/*
		반복문 : 무한루프에 빠지지 않도록 해야한다
 */
		
		System.out.println("---무한루프 탈출---");
		
		boolean abc = true;
		
		int i = 1;
		
		while (abc) {
			
			System.out.println("무한루프" + i);
			
			if (i == 100) {break;}		// i가 100일때 탈출
			
			i++;
		}
		
	}

}
