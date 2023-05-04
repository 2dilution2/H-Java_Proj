package ch03.ex01;

public class ArismaticOperator {
	public static void main(String[] args) {
		/* 
			산술 연산자 : +, -, *, /, % 
			증감 연산자 : ++, --
		 */
		
		// 1. 산술 연산자
		int a = 5;
		int b = 10;
			
		System.out.println(2+3);
		System.out.println(a+b);
		
		System.out.println(2+(double)3);
		
		System.out.println(8%5);
		System.out.println(8/5);
		System.out.println(8/5.0);
		System.out.println((int)8/5.0);
		
		// 2. 증감 연산자 
		int val1 = 3;
		val1++;
		System.out.println(val1);
		
		val1--;
		System.out.println(val1);
		
		int val2 = 3;
		++val2;
		System.out.println(val2);
		
		--val2;
		System.out.println(val2);
		
		System.out.println("----------------------------------");
		
		int val3 = 3;
		int val4 = val3++;

		System.out.println(val4);
		
		int val5 = 3;
		int val6 = ++val5;
		
		System.out.println(val6);
		
		System.out.println("----------------------------------");
		
		int val7 = 3;
		int val8 = 4;
		int val9 = 2 + val7-- + ++val8;
		
		System.out.println(val7);
		System.out.println(val9);
		System.out.println("----------------------------------");
		
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		
		int val13 = 7 + --val10 + ++val11 + val12--;
		
		
		System.out.println(val13);
		
		
		
		
		
		
		
		
		
	}
}
