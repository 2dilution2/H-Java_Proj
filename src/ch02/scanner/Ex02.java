package ch02.scanner;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1. Scanner 등록
		// 2. 아버지 이름, 어머니 이름, 동생이름, 자신이름
		//아버지 몸무게, 어머니 몸무게, 동생 몸무게, 자신 몸무게
		// 3. 스캐너로 받은 변수 출력
		// 4. 몸무게의 합계, 평균을 구해  소수점 2자리까지 출력
		
		try (Scanner sc = new Scanner(System.in)) {
			String Fname;
			String Mname;
			String Bname;
			String name;
			
			double Fwei;
			double Mwei;
			double Bwei;
			double wei;
			
			System.out.print("아버지의 이름을 입력하세요 : ");
			Fname = sc.next();
			System.out.print("어머니의 이름을 입력하세요 : ");
			Mname = sc.next();
			System.out.print("동생의 이름을 입력하세요 : ");
			Bname = sc.next();
			System.out.print("본인의 이름을 입력하세요 : ");
			name = sc.next();
			
			System.out.print("아버지의 몸무게를 입력하세요 : ");
			Fwei = sc.nextDouble();
			System.out.print("어머니의 몸무게를 입력하세요 : ");
			Mwei = sc.nextDouble();
			System.out.print("동생의 몸무게를 입력하세요 : ");
			Bwei = sc.nextDouble();
			System.out.print("본인의 몸무게를 입력하세요 : ");
			wei = sc.nextDouble();
		
			double tot = Fwei + Mwei + Bwei +wei ;
			double avg = tot / 4.0;
		
			System.out.printf("아버지 이름 : %s, 몸무게 : %4.2f\n어머니 이름 : %s, 몸무게 : %4.2f\n동생 이름 : %s, 몸무게 : %4.2f\n본인 이름 : %s, 몸무게 : %4.2f\n",
					Fname, Fwei, Mname, Mwei , Bname, Bwei, name, wei);
			System.out.printf("가족의 나이 총합은 %4.2f이고 평균몸무게는 %4.2f입니다.",tot, avg);
		}
			
	}
}
