package ch04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 스캐너로 월을 인풋 (1~12월)까지 정수 인풋
		// "해당월은 *월이고 *일까지 존재합니다." 
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		int day = 30;
		
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("해당월은 %d월이고 %d일까지 존재합니다.", month, day);
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("해당월은 %d월이고 %d일까지 존재합니다.", month, day);
			break;
		case 2:
			day = 28;
			System.out.printf("해당월은 %d월이고 %d일까지 존재합니다.", month, day);
			break;
		default:
			System.out.printf("월을 잘못 입력하셨습니다.");
			break;
		}
	
	}

}
