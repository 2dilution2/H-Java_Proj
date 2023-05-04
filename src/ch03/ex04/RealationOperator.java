package ch03.ex04;

public class RealationOperator {

	public static void main(String[] args) {
		// 크기비교 연산자 vs 등가비교 연산자
		
		// 1. 크기비교 연산자
		
		System.out.println(5>2);
		System.out.println(5<2);
		System.out.println(5>=2);
		System.out.println(5<=2);
		System.out.println(5<=5);
		
		// 2. 등가비교 연산자
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println(a == c);
		System.out.println(a != c);
		
		// 3. 참조 자료형일때 등가연산자의 비교
			// 참조자료형일때 heap 에 저장된 값을 비교할때는 equals()를 사용 한다.
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
	}

}
