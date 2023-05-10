package ch05.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 배열에 저장 후 출력 : 
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1. 인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의배수 저장 후 출력");
		System.out.println("2. 인풋값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
		System.out.println("3. 인풋값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1~4번까지 번호를 입력하시오");
		
		a = sc.nextInt();
		
			
		if (a == 1) {
			int c = 8;
			int b = 7;

			System.out.println("방의 크기를 입력하시오");
			int[] arr1 = new int[sc.nextInt()];
			
			for (int i = 0; i < arr1.length; i++) {
				if(i%2 == 0) {
					arr1[i] = b;
					System.out.println(arr1[i]);
					b+=7;				
				} else {
					arr1[i] = c;
					System.out.println(arr1[i]);
					c+=8;								
				}
				
			}			
		} else if (a == 2) {
			int b = 1;
			System.out.println("방의 크기를 입력하시오");
			int[] arr1 = new int[sc.nextInt()];
			
			for (int i = 0; i < arr1.length; i++) {
				if(b%4 != 0) {
					arr1[i] = b;
					System.out.println(arr1[i]);
					b++;
				} else {
					b++;
				}
			}
		} else if (a == 3) {
			int b = 3;
			System.out.println("방의 크기를 입력하시오");
			int[] arr1 = new int[sc.nextInt()];
			for (int i = 0; i < arr1.length; i++) {
				if(b%6 != 0) {
					arr1[i] = b;
					System.out.println(arr1[i]);
					b+=3;
				} else {
					b+=3;
				}
			
			}
		} else if (a > 4) {
			System.out.println("잘못 눌렀습니다.");
		}
		
		} while (a != 4);
		System.out.println("종료되었습니다.");
	}

}
