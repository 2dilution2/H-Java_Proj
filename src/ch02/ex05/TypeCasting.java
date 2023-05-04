package ch02.ex05;

public class TypeCasting {
	public static void main(String[] args) {
		/* 
		 타입 캐스팅 (Type Casting) : 정수 -> 실수 , 실수 -> 정수
		 
		 	- 업케스팅 : 자동으로 변환
		 		- 낮은 자료형 --> 높은 자료형 
		 			byte -> short -> int -> long -> float -> double 
		 
		 	- 다운캐스팅 : 수동 변환 필요
		  		- 높은 자료형 --> 낮은 자료형 
		 */
		
		// 1. 캐스팅 방법
		
//		int val1 = 4.3;			오류 발생
		int val2 = (int)4.3;	// 다운 캐스팅 : 실수 4.3을 정수형으로 다운캐스팅
		
		double val3 = 3;		// 업캐스팅 
		
		
		// 다운캐스팅이 필요함
		
		int val4 = (int) 5.8;
		long val5 = (long) 10.0000344;
		
		// 업캐스팅이 자동으로 됨
		
		float val6 = (float) 5;
		double val7 = 6;
		
		
		
	}
}
