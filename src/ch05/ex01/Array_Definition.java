package ch05.ex01;

public class Array_Definition {
	public static void main(String[] args) {
		//1. 변수 선언  : 하나의 값만 저장됨. 변수에 다를 값을 저장 할 수 있다. 
		int a = 10 ;       
		
		int b; 
		b = 20; 
		b = 50; 
	
	//2. 배열 선언 동시에 방의 크기를 지정  
	   int[] arr1 = new int[3];      
	   		// int[] : 배열변수에 저장할 자료형, arr1 : 배열 변수명 ,    
	   		// new  : 변수의 값을 Heap 영역에 저장하겠다. 
	   		// int[3] : 배열의 방의 갯수 : 3   , index ( 0, 1, 2 )   
	   
	//3. 배열의 기본 값을 출력 : 선언만 해도 강제로 초기값이 Heap 에 들어감 
	   System.out.println(arr1[0]);	        // arr1 배열변수의 0번방의 값을 출력 
	   System.out.println(arr1[1]);	        // arr1 배열변수의 1번방의 값을 출력 
	   System.out.println(arr1[2]);	        // arr1 배열변수의 2번방의 값을 출력 
//	   System.out.println(arr1[3]);	        // arr1 배열변수의 3번방의 값을 출력   <== 오류 발생 
	   
	   System.out.println("==============");
	//4. 배열 방의 값을 저장  
	   arr1[0] = 10; 
	   arr1[1] = 20; 
	   arr1[2] = 30; 

	   		//배열 방의 값을 출력 
	   System.out.println(arr1[0]);
	   System.out.println(arr1[1]);
	   System.out.println(arr1[2]);
	   
	   
	   System.out.println("=========================");
	   
	   double[] arr2 ;			// 배열 변수 선언 
	   arr2 = new double[6];    // 선언후 나중에 방 크기 지정  ,  index (방번호) : 0,1,2,3,4,5 
	   
	   System.out.println(arr2[0]);	    //0.0
	   
	   //배열 변수 arr2 의 각 방에 실수를 저장  
	   arr2[0] = 10.0; 
	   arr2[1] = 20.0; 
	   arr2[2] = 30.0; 
	   arr2[3] = 40.0; 
	   arr2[4] = 50.0; 
	   arr2[5] = 60.0; 
//	   arr2[6] = 60.0; 			// ArrayIndexOutOfBound Exception ( 배열의 방번호를 알수 없아) 
	   								 // 컴파일 오류 : 이클립스에서 자동으로 감지 
	   								 // 실행 오류 : 실행시 오류 발생 
	   
	   // 값을 출력 
	   System.out.println("arr2의 0 번째 방의 값 : " + arr2[0]  );
	   System.out.println("arr2의 1 번째 방의 값 : " + arr2[1]  );
	   System.out.println("arr2의 2 번째 방의 값 : " + arr2[2]  );
	   System.out.println("arr2의 3 번째 방의 값 : " + arr2[3]  );
	   System.out.println("arr2의 4 번째 방의 값 : " + arr2[4]  );
	   System.out.println("arr2의 5 번째 방의 값 : " + arr2[5]  );
//	   System.out.println("arr2의 6 번째 방의 값 : " + arr2[6]  );
	   
	   
	   System.out.println("=======For 문을 사용해서 배열에 값을 할당후 출력 하기 ====================");
	   
	   // 1부터 100 까지 배열 변수에 저장후  합게 출력 
	   
	   int[] arr3 = new int[100]; 
	   
	   		System.out.println(arr3.length);    // 배열 방의 갯수를 출력 
	   
	   // for 문을 사용해서 배열 변수의 값을 할당. 
	   		for (int i = 0 ; i < 100 ; i++) {
	   			arr3[i] = i + 1 ;					// 배열의 각방에 1[0],2[1],3,4, 5,..... 100 [99]  
	   		}
	   
	   // for 문을 사용해서 배열의 각 방에 저장된 값을 출력 
	   		for ( int i = 0 ; i < 100 ; i++) {
	   			System.out.println("arr3 변수의 [" + i + "] 번째 방의 값을 출력 : " + arr3[i] );
	   		}
	}
}
