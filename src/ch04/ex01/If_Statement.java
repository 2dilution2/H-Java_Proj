package ch04.ex01;

public class If_Statement {

	public static void main(String[] args) {
/*		제어문 - if( 실행문 마지막에 break 생략), switch (실행문 마지막에 break 삽입)
		
		If문 사용하기 
		1. 조건이 1개일떄 > 실행블럭의 중괄호 생략 가능 
			if(조건){
				조건이 참일때 실행 블럭;
			}
			
			if(조건) 조건이 참일때 실행 블럭;
		
		2. 조건이 2개일떄
			if(조건){
				조건이 참일때 실행 블럭;
			} else {
				조건이 거짓일때 실행 블럭;
			}
		
		3. 조건이 여러개일떄
			if(조건1){
				조건1이 참일때 실행 블럭;
			} else if(조건2) {
				조건2가 참일때 실행 블럭;
			} else if(조건3) {
				조건3이 참일때 실행 블럭;
			}  else {
				모든 조건이 거짓일때 실행 블럭;
			}
*/
		
		// Type1 예제 : 조건이 1개일때
		int val1 = 5;
		
		if ( val1>3 ) {
			System.out.println("실행 1");	// 조건이 True이므로 실행1 출력
		} 
		
		if ( val1>3 ) System.out.println("실행 1");
		
		System.out.println("------------------------------------------");
		
		// Type2 예제 : 조건이 2개일때 > 삼항연산자로 처리 가능
		if ( val1 < 3 ) {
			System.out.println("실행 2");	// 조건이 True일때 실행1 출력
		} else {
			System.out.println("실행 3");	// 조건이 False일때 실행2 출력
		}
		
		System.out.println("------------------------------------------");
		
		// Type3 예제 : 조건이 여러개일때
		int val2 = 95;
		
		if ( val1 < 90 ) {
			System.out.println("당신은 A학점입니다.");	// 조건1이 True일때 출력
		} else if(val1 < 80) {
			System.out.println("당신은 B학점입니다.");	// 조건2가 True일때 출력
		} else if (val2 < 70) {
			System.out.println("당신은 C학점입니다.");	// 조건3이 True일때 출력			
		} else if (val2 < 60) {
			System.out.println("당신은 D학점입니다.");	// 조건4이 True일때 출력			
		} else {
			System.out.println("당신은 F학점입니다.");	// 모든 조건이 False일때 출력				
		}
		
		System.out.println("------------------------------------------");
		
		int val3 = 95;
		
		if (val3 > 60) {
			System.out.println("당신은 D학점입니다.");	// 모든 조건이 False일때 출력				
		} else if (val3 > 70 ) {
			System.out.println("당신은 C학점입니다.");	// 조건4이 True일때 출력						
		} else if(val3 > 80) {
			System.out.println("당신은 B학점입니다.");	// 조건2가 True일때 출력
		} else if(val3 > 90) {
			System.out.println("당신은 A학점입니다.");	// 조건2가 True일때 출력
		} else {
			System.out.println("당신은 F학점입니다.");	// 모든 조건이 False일때 출력				
		}
		
		System.out.println("------------------------------------------");
		
		int val4 = 95;
		
		if (val4 >= 60 && val4 < 70) {
			System.out.println("당신은 D학점입니다.");	// 모든 조건이 False일때 출력				
		} else if (val4 > 70 && val4 < 80) {
			System.out.println("당신은 C학점입니다.");	// 조건4이 True일때 출력						
		} else if(val4 > 80 && val4 < 90) {
			System.out.println("당신은 B학점입니다.");	// 조건2가 True일때 출력
		} else if(val4 > 90 && val4 < 100) {
			System.out.println("당신은 A학점입니다.");	// 조건2가 True일때 출력
		} else {
			System.out.println("당신은 F학점입니다.");	// 모든 조건이 False일때 출력				
		}
		
		
		
		
		
		
		
		
	}

}
