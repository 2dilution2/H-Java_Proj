package ch04.ex02;

public class Switch_Statement {

	public static void main(String[] args) {
/*
 		switch : 
 			- if문은 실행블럭 실행 후 break가 자동으로 작동
 			- switch문은 실행 후 강제로 실행블럭을 break문으로 빠져나와야 함
 			
 */
		
		// switch문에서 break를 사용하지 않는 경우 
		int val1 = 2;
		
		switch (val1) {
		case 1 :
			System.out.println("A");
			
		case 2 : 
			System.out.println("B");
			
		case 3 : 
			System.out.println("C");
			
		case 4 : 
			System.out.println("D");

		default:
			System.out.println("F");
		}
		
		// 2. switch문에서 break를 사용하는 경우 
		int val2 = 4;
		
		switch (val2) {
		case 1:
			System.out.println("A");
			
			break;
		case 2 : 
			System.out.println("B");
			
			break;
		case 3 : 
			System.out.println("C");
			
			break;
		case 4 : 
			System.out.println("D");

			break;
		default:
			System.out.println("F");
			break;
		}
		
		// switch문 if else 문으로 변환됨
		System.out.println("switch문을 if else 문으로 변환");
		if (val2 == 1) {
			System.out.println("A");
		} else if (val2 == 2) {
			System.out.println("B");			
		} else if (val2 == 3) {
			System.out.println("C");			
		} else if (val2 == 4) {
			System.out.println("D");			
		} else {
			System.out.println("F");			
		}
		
		
	}

}
