package ch04.ex04;

public class While_Statement {

	public static void main(String[] args) {
/*
		While문 : 반복문, 조건이 true인 동안 반복, 조건 false가 되면 while문을 빠져나옴
			- for문으로 적용, for문은 while문으로 적용
			
		for(초기값;조건;증감식){
			실행블럭
		}
		
		while(조건){
			실행블럭
			증감식
		}
 */
		System.out.println("-------------------for문으로 출력---------------------");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("-------------------while문으로 출력---------------------");
		
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
	}

}
