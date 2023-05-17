package ch07.ex04;

class A {
	// 필드 : heap공간에 값이 저장됨, 객체를 생성(new) 후 heap에 저장
	int m;
	int n;
	
	// 메소드
	void init (int a, int b) {	// 지역변수 (a,b,c) : 메소드 내부에서 선언된 변수
		int c;
		c = 3;
		this.m = a;		// this. 생략 가능, 생략 후 컴파일 시 자동으로 등록
		this.n = b;
		System.out.println("필드의 값 출력 : " + this.m + "," + this.n);
	}
	void work () {
		this.init(2, 3);
	}
	
	
}

public class This_ThisMethod {
	public static void main(String[] args) {
/*
		this 키워드 : 필드이름 앞, 메소드이름 앞
					자기 자신의 객체를 의미,
					기본적으로 모두 생략되어있다.
					명시가 필요한 경우 : 생성자에서 인풋이름, 받는 이르ㅁ, 필드명이 동일할때 필드명에 this. 키워드 사용
		this() 메소드 : 
					생성자 내부에서만 사용됨.
					반드시 생성자 내부에서 첫번째 라인에 와야함.
					생성자 호출 시 다른 생성자를 먼저 실행하도록 한다.
 */
		// 
	}
}
