package hi.org;

public class ConsoleOutput {

	public static void main(String[] args) {
		// main 메소드 블록에서 프로그램 작성
		
		// 1. System.out.println();
		
		// 문자열 출력 "" <- 처리
		System.out.println("안녕하세요");
		
		// + : 문자열일때는 연결을 의미 
		// + : 정수, 실수일때는 더하기 연산
		System.out.println("2" + "4");
		
		// 정수출력 "" <- 처리X
		System.out.println(2+4);
		
		// 실수출력 "" <- 처리X
		System.out.println(11.5 + 11.5);
		
		// 문자열 + 실수 -> 문자열
		System.out.println("11.5" + 11.5);
		
		System.out.println("---------------------------------");
		
		// 문자열 + 숫자 -> 연결
		System.out.println("문자열" + 3 + 4 + 5);
		
		// 정수 + 정수 + 정수 + 문자역
		System.out.println(3 + 4 + 5 + "문자열");
		
		// 변수 선언 : 
		// 자료형 변수명 : 초기값;
		String str = "안녕하세요";
		System.out.println(str);
		
	}

}
