package ch07.ex02;

public class Method04 {
	
	// 인스턴스 메소드 : 객체화해야 호출이됨
	
	String sum (int a, int b) {
		int c = a+b;
		String d = String.valueOf(c);
		return d;
	}
	
	// 스태틱 메소드 : 객체 생성 없이 호출가능
	public static int sum2 (int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(sum2(10, 20));
		
		
		// sum : 인스턴스 메소드, 객체화해야 호출이 됨
		Method04 m1 = new Method04();
		
		String s1 = m1.sum(10, 30);
		String s2 = m1.sum(70, 70);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		
		// 같은 클래스 내부에서 메소드 호출 (static 메소드는 static 메소드를 호출가능)
		// sum2 : static( 정적메소드)
		int m = Method04.sum2(10, 20);		// 클래스 명으로 호출
		System.out.println(m);
		
		Method04 m3 = new Method04();		// 객체 생성 후 호출
		int n = m3.sum2(10, 20);
		System.out.println(n);
		
		int k = sum2(10, 20);				// main메소드에서 메소드 명으로 바로 호출
		System.out.println(k);				// 	동일한 클래스 내부, static
		
		
	}
}
