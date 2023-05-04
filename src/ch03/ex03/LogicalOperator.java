package ch03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println("-----------------------------");
		
		// ! (not) 
		System.out.println(!true);
		System.out.println(!false);
		
		// 쇼트 서킷이 발생 될 수 있다.
			//-- 논리연산에서 앞의 값으로 결과값을 유추할 수 있는 경우 뒤의 내용을 무시해서 처리하지 않는다
		
		// && 연산에서 false 가 오면 뒤에는 어떤값이 와도 false
		
		// 예제 AND연산에서 쇼트 서킷이 발생되는 예제
		System.out.println(true && true);
		System.out.println(false && true);
		int val1 = 3;
		System.out.println(false && ++val1 > 6);
		
		System.out.println(val1);
		
		// || : (OR)연산에서 앞의 값이 true면 쇼트서킷이 발생됨
		System.out.println(true || false);
		System.out.println(false || true);
		
		// 쇼트서킷을 방지하기 위한 방안 : 비트연산자를 사용한다. &, | <- 쇼트서킷을 발생시키지 않는 연산자
		// 예제 AND연산에서 쇼트서킷이 발생되는 예제 
		int val2 = 3;
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
