package ch11.ex01;

class A {
	int a = 3;			// 필드 : Heap에 변수와 값이 저장됨, 값을 수정할 수 없다.
	final int b = 5;	// 상수 : 값을 수정 불가함
	
	A () {
		a = 7;
//		b = 10;		// 오류발생 수정이 불가
	}
	
	void print () {
		int c = 10;			// 지역변수 : stack에 변수와 값이 저장
		final int d = 20;	// 지역상수 : 값을 수정할 수 없다.
		
		c = 100;
//		d = 200;	// 오류 발생 수정이 불가
	}
	
}
public class Final_Field {
	public static void main(String[] args) {
		
	}
}
