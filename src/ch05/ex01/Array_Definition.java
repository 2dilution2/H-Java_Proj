package ch05.ex01;

public class Array_Definition {
	public static void main(String[] args) {
		// 1. 변수 선언 : 하나의 값만 저장됨, 변수에 다른 값을 저장 할 수 있다.
			int a = 10;
		
			int b;
			b = 20;
			b = 50;
		
		// 2. 변수 선언
			int[] arr1 = new int[3];		
				// int[] : 배열변수에 저장할 자료형,	
				//arr1: 배연 변수명,	
				//new : 변수의 값을 heap영역에 저장,	
				//int[3] 배열의 방의 갯수

			
		// 3. 배열의 기본값을 출력 : 선언만 해도 강제로 초기값이 heap에 들어감
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
//			System.out.println(arr1[3]);
			System.out.println("---------------------------------");
		
		// 4. 배열 방의 값을 저장
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);

			System.out.println("---------------------------------");
			
			double[] arr2;
			arr2 = new double[6];
			
			arr2[0] = 10.0;
			arr2[1] = 20.0;
			arr2[2] = 30.0;
			arr2[3] = 40.0;
			arr2[4] = 50.0;
			arr2[5] = 60.0;						
//			arr2[6] = 70.0;									//ArrayIndexOutOfBound 오류
			
			System.out.println(arr2[0]);
			System.out.println(arr2[1]);
			System.out.println(arr2[2]);
			System.out.println(arr2[3]);
			System.out.println(arr2[4]);
			System.out.println(arr2[5]);
			
			System.out.println("-------------for문을 사용해서 --------------------");
			
			
			
			
	}
}
