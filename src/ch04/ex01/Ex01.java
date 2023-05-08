package ch04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 money를 인풋 받아 
		// 0~3000 : 걸어서 다닙니다.
		// 3001 ~ 30000 : 지하철을 타고 다닙니다.
		// 30001 ~ 100000 : 택시를 타고 다닙니다.
		// 100001 ~ : 비행기를 타고 다닙니다.

		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오.");
		money = sc.nextInt();
		if (money > 100000) {
			System.out.println("비행기를 타고 다닙니다.");
		} else if (money > 30000) {
			System.out.println("택시를 타고 다닙니다.");			
		} else if (money > 3000) {
			System.out.println("지하철을 타고 다닙니다.");	
		} else {
			System.out.println("걸어서 다닙니다.");			
		}
		
	}

}
