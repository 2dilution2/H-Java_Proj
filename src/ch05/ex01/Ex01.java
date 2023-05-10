package ch05.ex01;

public class Ex01 {
	public static void main(String[] args) {
/*
		배열 방 100개를 생성 한 후 3의 배수만 저장 후 출력
 */
		
		int[] arr1 = new int[100];
		int a = 3;
		
		
		for (int i = 0; i < arr1.length; i++) {
				arr1[i] = a;				
				System.out.println(arr1[i]);
				a += 3;
			
		}
		
	}
}
