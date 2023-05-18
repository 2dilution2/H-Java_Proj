package ch08.ex02;

public class A {
	
	// 생성자
	public A () {}
	
	// 필드에 부여된 접근제어자
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	// 메소드에 부여된 접근 제어자
	public void abc () {
		System.out.println("public");
	}
	protected void bcd () {
		System.out.println("protected");
	}
	void cde () {
		System.out.println("default");
	}
	private void def () {
		System.out.println("private");
	}
	
	
	
	public static void main(String[] args) {
		
		
	}
}
