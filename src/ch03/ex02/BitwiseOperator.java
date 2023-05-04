package ch03.ex02;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		// 다양한 진법 표현과 비트 연산자
		
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println(Integer.toOctalString(data));
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("d",16));
		
		System.out.println("---------------------------------");
		
		System.out.println("3" + "5");
		System.out.println(3 + "5");
		
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5"));
		
		// 문자열로된 실수를 실수형으로 변환
		String a = "13.3";
		String b = "13.4";
		
		System.out.println(a+b);
		System.out.println(Double.parseDouble(a) + Double.parseDouble(b));
		
		
		// 2. 비트연산 
		
		
		
		
		
		
		
	}

}
