package ch04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
/*	
 * 		스위치문으로 작성
		1. 스캐너로 정수 1,2,3을 인풋받아서 
			1번이 들어왔을때 "금메달 입니다."
			2번이 들어왔을때 "은메달 입니다."
			3번이 들어왔을때 "동메달 입니다."
			그외 모든 정수를 받으면 "메달이 없습니다."
	--------------------------------------------
		2. 스캐너로 문자열 "gold", "silver", "bronze"
			gold가 들어왔을때 "금메달 입니다."
			silver가 들어왔을때 "은메달 입니다."
			bronze가 들어왔을때 "동메달 입니다."
			그외 받으면 "메달이 없습니다."
 */	
		Scanner sc = new Scanner(System.in);
		
		int md;
		
		System.out.println("등수를 입력해주세요.");
		md = sc.nextInt();
		
		switch (md) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		System.out.println("받은 메달을 입력해주세요");
		String md2;
		md2 = sc.next();
		
		switch (md2) {
		case "gold":
			System.out.println("금메달 입니다.");
			break;
		case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		sc.close();

	}

}
