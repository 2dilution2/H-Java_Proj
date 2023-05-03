package ch02.ex01;

public class NamingVariable {

	public static void main(String[] args) {
		
		// 변수 이름 지정 규칙(변수명)
			// 소문자로 시작
			// 한글 사용가능하나 권장하지않음
			// 특수문자는 2개만 사용 가능 " _ , $ "
			// 변수명에 숫자를 사용할 수 있으나, 첫자에 숫자 불가
			// 자바에서 사용하는 예약어는 불가( package, public, class, int, ...)
		
		@SuppressWarnings("unused")
		boolean aBcD;
		@SuppressWarnings("unused")
		byte 가나다라;
//		byte 3bbb;
		@SuppressWarnings("unused")
		boolean _abcd;
		@SuppressWarnings("unused")
		int $sde;
		@SuppressWarnings("unused")
		int ABCDE;
		@SuppressWarnings("unused")
		int myWORK;
		

	}

}
