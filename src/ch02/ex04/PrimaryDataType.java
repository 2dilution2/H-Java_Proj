package ch02.ex04;

public class PrimaryDataType {

	public static void main(String[] args) {
		
		/* 
			자료형 : 
				- 기본자료형 : RAM STACK공간에 변수명, 변수의 값이 저장
					- 8가지 : 참/거짓(boolean), 정수(byte, short, int, long), 실수(float, double), 문자(char)
						- 정수형의 기본 : int
						- 실수형의 기본 : double
				- 참조자료형 : RAM HEAP공간에 값이 저장되고, STACK공간에서 그의 참조주소를 가진다. 
					- 무한대 (객체 (String), 배열, ...)
					
			리터럴 : 변수에 할당된 값을 통칭
		
		*/
		
		// 1. boolean : true, false 값만 저장 할 수 있는 자료형
		boolean bool1 = true;
		
		boolean bool2;
		bool2 = false;
		
//		boolean bool3 = 1234;		오류 발생

		System.out.println(bool2);
		
		bool2 = true;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		// 상수 : 변수의 이름앞에 final
		final boolean bool4 = false;
		System.out.println(bool4);
		
//		bool4 = true;		상수의 값을 수정할 수 없다.
		
		// 2. 정수형 자료헝 (byte (1byte), short (2byte), int (4byte), long (8byte))
		// byte : 1byte = 8bit ( -2^7(-128) ~ 2^7-1(127) )
		
		byte val1 = -128;
		byte val2 = 127;
		
		// short : 2byte = 16bit ( -2^15(-32,768) ~ 2^15-1(32,767) )
		
		short val3 = -32768;
		short val4 = 32767;
		
		// int : 4byte = 32bit ( -2^31(-2,147,483,648) ~ 2^31-1(2,147,483,647) )
		
		int val5 = -2147483648 ;
		int val6 = 2147483647 ;
		
		// long : 8byte = 64bit ( -2^63(-9,223,372,036,854,775,808) ~ 2^63-1(9,223,372,036,854,775,807) )
		
		long val7 = -9223372036854775808L ;
		long val8 = 9223372036854775807L ;
		
		// 3. 실수형 자료형 (float (4byte), double(8byte))
		// float : 소숫점 7자리까지 정밀도 유지
		
		float val9 = 0.123456789f;
		System.out.println(val9);
		
		// double : 소숫점 15자리까지 정밀도 유지
	
		double val10 = 0.123456789101112131415;
		System.out.println(val10);
		
		// 4. 문자형 자료형 (char (4byte))
		
		char val11 = 'A';
		char val12 = 'B';
		char val13 = 'a';
		char val14 = '가';
		char val15 = '#';
		char val16 = '1';
		
		// 자신의 이름을 유니코드로 char 변수에 할당
		
		char val01 = '\uC774';
		char val02 = '\uD76C';
		char val03 = '\uC11D';
		
		System.out.printf("제 이름은 %c%c%c 입니다", val01, val02, val03);
		
		// 참조 자료형 : String
		
		
		
	}

}
