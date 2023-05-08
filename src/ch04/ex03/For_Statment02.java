package ch04.ex03;

public class For_Statment02 {

	public static void main(String[] args) {
/*
			반복문 : for, while, do while 
				조건이 true일 동안 반복, 조건이 false이면 구문을 빠져나온다.
				조건이 비어있으면 무한루프레 빠짐
				메모리 소모가 커 서버가 다운될 수 있다.
 */
		// for문의 조건이 없는 경우
//		for (int i = 0; ; i++) {
//			System.out.println(i);
//		}
		
		// for문에서 초기값, 조건, 증가값도 생략된 경우
//		for (;;) {
//			System.out.println("무한루프");
//		}
		
		// for문에서 조건을 잘못 처리하는 경우
			// if 조건문내에서 무한루프를 빠져나올 수 있다.
		for (int i = 1000; i <= 1000; i--) {
			System.out.println(i);
			
			if (i == 500) {break;}
		}
		
		
	}

}
