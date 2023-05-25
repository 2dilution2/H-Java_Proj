package ch14.ex05;

class Aaa {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		// DB연결시 사용 : 일반예외 : 반드시 예외처리
		Class cls = Class.forName("java.lang.Object");
	}
}
public class Throws_Exception03 {
	public static void main(String[] args) {
		Aaa a1 = new Aaa();
		try {
			a1.abc();
		} catch (ClassNotFoundException e) {
			System.out.println("예외가 발생됨");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료됨");
	}
}
