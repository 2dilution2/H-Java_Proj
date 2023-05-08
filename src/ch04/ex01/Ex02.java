package ch04.ex01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 스캐너 등록
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 선택 변수
		int select;		// 1. 학점의 합계/평균	2. 홀수, 짝수 확인	3. 같은 이름을 식별 
		
		// 국어 / 영어 / 수학 점수를 인풋받는 변수 선언
		
		int kor;
		int eng;
		int math;
		
		// 정수값을 인풋받아 홀,짝 확인
		int a;
		
		// 변수 두개 인풋받아 같은 이름인지 확인하는 프로그램
		String aName;
		String bName;
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. 학점의 합계/평균\t\t2. 홀수, 짝수 확인\t\t3. 같은 이름을 식별");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("위 프로그램 번호를 입력하시오");
		select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("국어점수를 입력하시오 : ");
			kor = sc.nextInt();
			System.out.println("영어점수를 입력하시오 : ");
			eng = sc.nextInt();			
			System.out.println("수학점수를 입력하시오 : ");
			math = sc.nextInt();
			int tot = kor + eng + math;
			double avg = tot/3.0;
			
			System.out.printf("세과목의 총합은 %d점이며 평균점수는 %4.1f점입니다\n", tot, avg);
		} else if (select == 2) {
			System.out.println("정수를 입력하시오.");
			a = sc.nextInt();
			if (a %2 == 0) {
				System.out.println("입력하신 정수는 짝수 입니다.");
			} else {
				System.out.println("입력하신 정수는 홀수 입니다.");
			}
		} else if (select == 3) {
			System.out.println("첫번째 이름을 입력하세요.");
			aName = sc.next();
			System.out.println("두번째 이름을 입력하세요.");
			bName = sc.next();
			if (aName.equals(bName)) {
				System.out.println("두 이름이 일치합니다.");
			} else {
				System.out.println("이름이 일치하지 않습니다.");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		// 스캐너 종료 : 사용 후 메모리에서 제거
		sc.close();
		
	}
}