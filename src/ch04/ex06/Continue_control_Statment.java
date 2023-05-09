package ch04.ex06;

import java.util.Iterator;

public class Continue_control_Statment {

	public static void main(String[] args) {
/*
		continue : 제어문 내에서 break와 비슷하게 사용되는 키워드
			- break (실행문을 탈출), continue (아래 구문을 작동시키지 않고 증감식을 실행)
 */
		
		// 1. 단일 Loop에서 continue
		System.out.println("1. 단일 Loop에서 continue");
		for (int i = 0; i < 5; i++) {
			
			continue;
//			System.out.println(i);		// 오류 발생
		}
		
		System.out.println("if 조건과  continue를 같이 사용");
		for (int i = 0; i < 5; i++) {
			System.out.println("continue 작동 전 : " + i);
			if(i ==3)continue;
			System.out.println("continue 작동 후 : " + i);
		}
		
		// 2. 다중 Loop 에서 continue
		System.out.println("2. 다중 Loop 에서 continue");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3) continue;
				System.out.println(i + "," + j);
			}
		}
		
		// 3. 다중 Loop 에서 continue : LABLE을 사용해서 점프가 작동
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (j ==2) continue;
				System.out.println(i + "," + j);
			}
		}
		
		
		
		
		
	}
}
