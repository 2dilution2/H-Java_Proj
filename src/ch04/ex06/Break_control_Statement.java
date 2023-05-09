package ch04.ex06;

public class Break_control_Statement {

	public static void main(String[] args) {

//		break; 키워드 : 제어문 (if, switch), 반복문 (for, while, do while) 실행블럭을 탈출할때 사용

		// 1. 단일 Loop문에서 break사용
		
		for (int i = 0; i < 10; i++) {
			System.out.println("break 사용전 출력" + i);
			break;
//			System.out.println("break 사용후 출력" + i);		// 오류발생
		}
		System.out.println("--------------------------------");
			// 일반적으로 if 조건을 사용해서 break문 사용
		for (int i = 0; i < 10; i++) {
			System.out.println("break 사용전 출력" + i);
			if(i ==5)break;
			System.out.println("break 사용후 출력" + i);
		}
		
		// 2. 다중 Loop문에서 break사용 : 한단계만 탈출
		System.out.println("다중 Loop문에서 break사용 : 한단계만 탈출");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + "," + j);
				
				if (j ==2) {
					break;
				}
			}
		}
		
		// 3. 다중 Loop문에서 점프로 한번에 탈출 : LABLE을 사용해서 점프
		System.out.println("3. 다중 Loop문에서 점프로 한번에 탈출 : LABLE을 사용해서 점프");
		pos1 : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + "," + j);
				
				if (j ==2) {
					break pos1;
				}
			}
		}
		
		// 4. 변수값을 조정해서 점프하여 탈출
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + "," + j);
				
				if (j ==2) {
					
				i = 50;			//바깥쪽의 탈출 할 조건을 false로 만들어 두단계 탈출
					break;
				}
			}
		}
		
	}

}
