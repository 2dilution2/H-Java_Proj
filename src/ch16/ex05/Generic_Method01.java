package ch16.ex05;

class GenericMethod {	// 일반 클래스
	
	
	// 제너릭 메소드는 반드시 일반 클래스에 생성가능하다.
	public <T> T method (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);	// 스택의 값을 비교, String은 epuals() 메소드가 Heap의 값을 저장하도록 재정의 되어있다.
	}
	
	public <K, V> void method3 (K k, V v){
		System.out.println(k + " : " + v);
	}
	
	public <K, V> void method4 () {
		System.out.println("반드시 타입을 지정해서 호출 되어야 함");
	}

}

public class Generic_Method01 {
	
	public static void main(String[] args) {
		// 제너릭 메소드 호출
		GenericMethod gm = new GenericMethod();	// 일반 클래스를 객체화
		String str1 = gm.<String> method("안녕");	// 제너릭 메소드 : 메소드를 호출 시 타입을 지정해서 호출
		String str2 = gm.method("오늘");			// 매개변수로 들어오는 값이 타입을 유추할 수 있을 때 메소드 호출 시 타입을 생략할 수 있다.
		
		System.out.println(str1);
		System.out.println(str2);
		
		Integer i1 = gm.<Integer> method(10);
		Integer i2 = gm.method(20);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("-------------------------------");
		
		boolean bool1 = gm.<String> method2("오늘", "오늘");
		boolean bool2 = gm.method2("오늘", "안녕");
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("-------------------------------");
		
		gm.<String, Integer> method3 ("국어", 80);
		gm.method3 ("영어", 90);
		
		gm.method3(404, "요청하신 문서를 찾을 수 없습니다.");
		gm.method3("학점의 평균은 : ", 88.8);
		
		System.out.println("-------------------------------");
		
		gm.method4();
	}
}
