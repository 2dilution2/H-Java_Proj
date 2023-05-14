package ch05.ex06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Non_Ractangle_Array {
	public static void main(String[] args) {

//		 1. 비정방형 선언 : 
//		행의 방번호만 지정 : 0,1,2
		
		int[][] arr1 = new int[3][];
		arr1[0] = new int[5];			// 0蹂��뻾�쓽 �뿴�쓽 媛��닔 5
		arr1[1] = new int[2];			// 1踰덊뻾�쓽 �뿴�쓽 媛��닔 2
		arr1[2] = new int[4];			// 2踰덊뻾�쓽 �뿴�쓽 媛��닔 4
		
		
//		직접 값을 할당
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		arr1[0][4] = 50;
		
		arr1[1][0] = 11;
		arr1[1][1] = 12;
		
		arr1[2][0] = 21;
		arr1[2][1] = 22;
		arr1[2][2] = 23;
		arr1[2][3] = 24;
		
		System.out.println("------------------------------");
		int[][] arr2 = new int[3][];		// 鍮꾩젙諛⑺삎 諛곗뿴 �꽑�뼵
			arr2[0] = new int[100];		// 10�쓽 諛곗닔 �엯�젰
			arr2[1] = new int[200];		// 20�쓽 諛곗닔 �엯�젰
			arr2[2] = new int[150];		// 30�쓽 諛곗닔 �엯�젰
			
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
//		이중 for문을 사용해 값을 저장
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				
				for (int j = 0, a = 10; j < arr2[i].length; j++, a+=10) {
					arr2[i][j] = a;
				} 
				
			} else if(i == 1){
				
				for (int j = 0, a = 20; j < arr2[i].length; j++, a+=20) {
					arr2[i][j] = a;
				} 

			} else if (i == 2) {
				
				for (int j = 0, a = 30; j < arr2[i].length; j++, a+=30) {
					arr2[i][j] = a;
				} 
				
			}
		}
		
		System.out.println("-----for문을 사용 해 출력---------");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----enhanced for문을 사용 해 출력---------");
		for (int[] k : arr2) {
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----arr2 / Array.toString()---------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		
		System.out.println("-----arr1 / Array.toString()---------");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		
	}
}
