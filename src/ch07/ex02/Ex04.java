package ch07.ex02;


class F {
	// 1. 메소드 : 두배열의 각방의 내용을 더해서 출력
	// 2. 메소드 : 두배열의 각방의 내용을 뺴서 출력
	// 3. 메소드 : 두배열의 각방의 내용을 곱해서 출력
	// 4. 메소드 : 두배열의 각방의 내용을 나눠서 출력
	
	int plus (int a, int b) {
		return a + b;
	}
	
	int minus (int a, int b) {
		return a - b;
	}
	
	int multi (int a, int b) {
		return a * b;
	}
	
	double devide (double a, double b) {
		return a / b;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		F f1 = new F();
		
		// 1. 정수를 담는 배열 arr1방 100개를 생성 : 7의 배수만 저장
		int arr1[] = new int [100];
		for (int i = 0, a = 7; i < arr1.length; i++) {
			if (a%7 == 0) {
				arr1[i] = a;
				a+=7;
			}
		}
//		for (int j = 0; j < arr1.length; j++) {
//			System.out.print(arr1[j] + " ");
//		}
		
		// 2. 정수를 담는 배역 arr2방 100개 생성 : 4의 배수만 저장하는데 8의배수는 저장하지않도록 
		int arr2[] = new int [100];
		for (int i = 0, a = 4; i < arr2.length; i++) {
			if (a%4 == 0) {
				arr2[i] = a;
				a+=4;
			} 
			if (a%8 == 0) {
				a+=4;				
			}
		}
		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}

		
		// 3. 각 메소드 호출 후 출력
		
		for (int i = 0; i < 100; i++) {
			System.out.print(f1.plus(arr1[i], arr2[i]) + " ");
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.print(f1.minus(arr1[i], arr2[i]) + " ");
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.print(f1.multi(arr1[i], arr2[i]) + " ");
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.printf("%.3f ",f1.devide(arr1[i], arr2[i]) );
		}
		System.out.println();
	}
}
