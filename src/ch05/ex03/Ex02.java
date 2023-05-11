package ch05.ex03;

public class Ex02 {
	public static void main(String[] args) {
/*
		배열방 1000개 생성, 정수배열
		4의배수를 답는데 8의 배수 생략하여 저장
		
		출력은 10개씩 끊어서 출력
		
 */
		int a = 4;
		int arr1[] = new int[1000];
		
		
		for (int i = 1; i-1 < arr1.length; i++) {
			
			if (a%4 ==0) {
				arr1[i-1] = a;
				a +=4;
				if (a%8 == 0) {
				a +=4;
				}
			}
			if (i%10 != 0) {
				System.out.print(arr1[i-1] + "\t");
				
			} else {
				System.out.print(arr1[i-1] + "\n");
				
			}
		}
		
	}
}
