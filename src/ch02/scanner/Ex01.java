package ch02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 1. Scanner 등록
		// 2. 아버지 이름, 어머니 이름, 동생이름, 자신이름
			//아버지 나이, 어머니 나이, 동생 나이, 자신 나이
		// 3. 스캐너로 받은 변수 출력
		// 4. 전체나이의 합계, 평균을 구해  소수점 2자리까지 출력
		
		try (Scanner sc = new Scanner(System.in)) {
			String Fname;
			String Mname;
			String Bname;
			String name;
			
			int Fage;
			int Mage;
			int Bage;
			int age;
			
			System.out.print("아버지의 이름을 입력하세요 : ");
			Fname = sc.next();
			System.out.print("어머니의 이름을 입력하세요 : ");
			Mname = sc.next();
			System.out.print("동생의 이름을 입력하세요 : ");
			Bname = sc.next();
			System.out.print("본인의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("아버지의 나이를 입력하세요 : ");
			Fage = sc.nextInt();
			System.out.print("어머니의 나이를 입력하세요 : ");
			Mage = sc.nextInt();
			System.out.print("동생의 나이를 입력하세요 : ");
			Bage = sc.nextInt();
			System.out.print("본인의 나이를 입력하세요 : ");
			age = sc.nextInt();
			
			int tot = Fage + Mage + Bage + age;
			double avg = tot / 4.0;
			
			System.out.printf("아버지 이름 : %s, 나이 : %d\n어머니 이름 : %s, 나이 : %d\n동생 이름 : %s, 나이 : %d\n본인 이름 : %s, 나이 : %d\n",
					Fname, Fage, Mname, Mage , Bname, Bage, name, age);
			System.out.printf("가족의 나이 총합은 %d이고 평균나이는 %4.2f입니다.",tot, avg);
		}
		
	}
}
