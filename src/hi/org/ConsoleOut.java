package hi.org;

public class ConsoleOut {

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
		
		// 변수 선언
		// 자료형 변수명 = 초기값;
		String str = "안녕하세요";
		System.out.println(str);
		
		// 정수에 담는 자료형 : int
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		
		System.out.println("---------------------------------");
		
		// 2. System.out.print(); <- 출력 후 줄바꿈을 하지않는다.
		System.out.print("안녕");
		System.out.print("하세요.\n");
		
		System.out.println("---------------------------------");

		//  3. System.out.printf(); <- 자료형 포멧에 따라 출력
		System.out.printf("%d\n",30);							// %d : 10진수로 출력
		System.out.printf("%o\n",30);							// %o : 8진수로 출력
		System.out.printf("%x\n",30);							// %x : 16진수로 출력

		System.out.printf("%s\n","문자열");						// %s : 문자열 출력
		System.out.printf("%f\n",5.8);							// %f : 실수를 출력
		System.out.printf("%4.2f\n",5.8);						// %4.2f : 전체 4자리, 소수점 이하 2자리 출력
		System.out.printf("%d 와 %4.2f 를 출력합니다.\n", 4, 5.8);	// 순서대로 변수가 출력
		
		
		
		
		
	}

}
