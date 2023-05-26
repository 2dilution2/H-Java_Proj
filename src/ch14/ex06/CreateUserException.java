package ch14.ex06;

// 1. 일반 예외 (사용자 정의 예외)
class MyException extends Exception {
	// 1. 기본 생성자
	public MyException() {
		// super();
	}

	// 2. 오류메세지를 인풋받아서 처리해주는 생성자
	MyException(String message) {
		super(message);
	}
}

// 2. 실행 예외 (사용자 정의 예외)
class MyRTException extends RuntimeException {
	MyRTException() {
	}

	MyRTException(String message) {
		super(message);
	}
}

class A {
	// 사용자 정의 예외의 객체 생성 (필드)
	MyException me1 = new MyException();
	MyRTException me2 = new MyRTException();

	MyException mre1 = new MyException("예외 메세지 : MyException");
	MyRTException mre2 = new MyRTException("예외메세지 : MyRTException");

	// 예외 던지기 (throw : 예외를 강제로 발생시킴)

	// 정수를 인풋받아서 70이하면 예외를 강제로 발생시킴
	void abc_1(int num) {

		try {
			if (num > 70) {
				// 정상처리
				System.out.println("당신이 넣은 값은 " + num + "이고, 정상작동됨");
			} else {
				// 예외를 강제로 발생시킴
				throw mre2; // RunTimeException
			}
		} catch (MyRTException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	// abc_1() 메소드를 호출하는 메소드
	void bcd_1 () {
		abc_1(80);
	}
	
	
	void abc_2(int num) throws MyException {
		void 
	}
	
	
	void bcd_2 () {
		
	}

}

public class CreateUserException {
	public static void main(String[] args) {

	}
}
