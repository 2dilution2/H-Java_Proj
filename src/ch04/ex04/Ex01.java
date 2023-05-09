package ch04.ex04;

public class Ex01 {

	public static void main(String[] args) {
		// 1000~1 5까지 5씩 감소하면서 출력
		
		for (int i = 1000; i > 0 ; i -= 5) {
			System.out.println(i);
		}
		
		int i = 1000;
		while (i > 0) {
			System.out.println(i);
			i-=5;
		}
	}

}
