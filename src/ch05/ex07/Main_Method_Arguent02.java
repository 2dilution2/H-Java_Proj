package ch05.ex07;

public class Main_Method_Arguent02 {

	public static void main(String[] args) {
//		main 메소드의 Input매개변수로 실수값을 넘겨받아 계산
		
//		1. 직접 넘어오는 변수를 받아서 할당
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a + b + c);
		
		double aa = Double.parseDouble(a);
		double bb = Double.parseDouble(b);
		double cc = Double.parseDouble(c);
		
		System.out.println(aa + bb + cc);
		
		System.out.println("----------main메소드 배열에 들어오는 값 for문을 사용해 출력----------");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);		// String 타입
		}
	}

}
