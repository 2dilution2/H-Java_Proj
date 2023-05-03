package ch02.scanner;
import java.util.Scanner;

public class Useing_Scanner {

	public static void main(String[] args) {

		// Scanner : 자바 라이브러리, import 를 사용 외부 라이브러리를 사용할 수 있다.
		// 콘솔로 인풋 값을 받아 변수에 할당.
		
		try (//1. 사용할 스캐너 선언
		Scanner sc = new Scanner(System.in)) {
			// 2. 변수 선언, 같은 콘솔에서 인풋값을 각 변수에 할당
			String name;	// 이름
			int kor;		// 국어 점수
			int eng;		// 영어 점수
			int math;		// 수학 점수
			int tot;
			double avr;
			
			
			// 3. 스캐너를 사용해 콘솔에서 인풋받은 값을 변수에 할당
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("국어점수를 입력하세요 : ");
			kor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			math = sc.nextInt();
			
			tot = kor + eng + math;
			avr = tot / 3.0;
			
			// 입력받은 값을 출력하고 합계와 평균내기
			System.out.printf("입력하신 이름은 %s, 국어점수는 %d, 영어점수는 %d, 수학점수는 %d 입니다.\n총점은 %d 이고 평균점수는 %4.1f 입니다. \n수고하셨습니다.", name, kor, eng, math, tot, avr);
		}
		
		
	}

}
