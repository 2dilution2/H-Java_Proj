package ch07.ex02;

class G {
	// 메소드도 2가지 타입
	//		- 인스턴스 메소드 : 객체화 시켜야 호출이 가능, 
	//		- static메소드 : 객체 생성없이 클래스 명으로 호출이 가능, 객체만들어서도 호출이 가능
	
	// 인스턴스 메소드
	void sum (int a, int b) {
		
		System.out.println(a + b + "<- 두 매개변수의 합");
		System.out.println("두 매개변수의 합 ->" + a + b);
	}
	
	// 정적메소드
	static int diff (int a, int b) {
		return a-b;
	}
}

public class Method03 {
	public static void main(String[] args) {
		// 1. 인스턴스메소드 호출 : 객체화해야 호출이 가능한 메소드
		G g1 = new G();
		g1.sum(30, 40);
		int a = G.diff(50, 60);
		
		System.out.println(a);
		System.out.println(G.diff(90, 80));
		
		// 2. 정적메소드 호출 : 객체생성없이 클래스 이름으로 호출가능
		int b;
		b =	G.diff(100, 50);
		System.out.println(b);
		
	}
}
