package ch02.ex01;

public class RangeOfVariable {

	public static void main(String[] args) {
		
		// 변수의 사용 범위 : 블럭에서 선언되면 그 블럭내에서만 사용 (지역변수)
		
		int val1 = 3;
		
		{		// if, for, while, do while
			int val2 = 5;
			
			System.out.println(val1);
			System.out.println(val2);
			
		}
		
		System.out.println(val1);
//		System.out.println(val2);		// 		
		
		
	}

}
