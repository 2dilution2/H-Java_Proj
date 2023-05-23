package ch10.ex05;

class Aa {
	static int m = 3;
	
}

class Bb extends Aa {
	static int m = 4;
}

public class Overriding_Static_Field {
	public static void main(String[] args) {
		// 정적필드 : 클래스영역에 필드의 값이 저장되어 있음. 부모의 필드, 자식의 필드는 별개
			// - 객체 생성 후 사용
			// - 객체 생성없이 클래스이름으로 호출
		
		// 객체생성 후 사용.
		Aa aa1 = new Bb();	// 자식객체를 생성하면서 부모타입으로 지정
		System.out.println(aa1.m);
		
		// 다운캐스팅 후 m을 출력
		Bb bb1 = (Bb) aa1;
		System.out.println(bb1.m);
		
		// 객체생성없이 클래스이름으로 호출된다
		System.out.println(Aa.m);
		System.out.println(Bb.m);
	}
}
