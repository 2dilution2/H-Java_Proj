package ch07.ex03;

class Student {
	
	// 생성자 오버로딩 : 생성자 이름은 동일하고, args로 받는 매개변수의 갯수, 타입이 다름
	
	// 기본생성자 : 객체에 다른생성자가 존재할 때 기본생성자를 명시적으로 생성
	public Student() {}
	
	// 생성자 : 매개변수로 1개 인풋 받는 생성자
	// 		this : 자기 자신의 객체를 뜻함
	// 		매개변수로 들어오는 변수명, 그것을 받는 변수 명, 필드명, 3가지 이름이 동일할 경우
	//			필드명에 this. 키워드 사용
	public Student(String stName) {
		this.stName = stName;
	}
	
	// 생성자 : 매개변수 2개받는 생성자
	
	public Student(String stName, String stAddr) {
		this.stName = stName;
		this.stAddr = stAddr;
	}
	
	// 생성자 : 매개변수 3개받는 생성자
	
	public Student(String stName, String stAddr, String stEmail) {
		this.stName = stName;
		this.stAddr = stAddr;
		this.stEmail = stEmail;
	}
	
	// 생성자 : 매개변수 4개받는 생성자
	
	public Student(String stName, String stAddr, String stEmail, int stAge) {
		this.stName = stName;
		this.stAddr = stAddr;
		this.stEmail = stEmail;
		this.stAge = stAge;
	}
	
	// 생성자 
	public Student(String a, String b, String c, int d, double e) {
		stName = a;
		stAddr = b;
		stEmail = c;
		stAge = d;
		stWeight = e;
	}
	
	// 필드 : 속성
	String stName;
	String stAddr;
	String stEmail;
	int stAge;
	double stWeight;
	
	// 메소드 : 기능
	
	// 객체의 필드값을 출력 : Object 클래스의 toString() 을 재정의 
	
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stAddr=" + stAddr + ", stEmail=" + stEmail + ", stAge=" + stAge
				+ ", stWeight=" + stWeight + "]";
	}
	
}

public class Constructor01 {
	public static void main(String[] args) {
/*
		생성자 (Constructor) 
			- 객체를 생성 시 필드의 초기값을 설정
			- 리턴이 없고 객체와 이름이 동일한 메소드
			- 기본생성자 : 생략되어있음
			- 사용자 정의 생성자를 생성 
 */
		
		// 객체 생성 : 기본생성자로 객체생성
		Student s1 = new Student();
		System.out.println(s1);				// 객체자체를 출력시 오버라이딩 된 toString()이 출력
		
		// 객체 생성 : 
		Student s2 = new Student("홍길동");
		Student s3 = new Student("이순신", "서울");
		Student s4 = new Student("세종대왕", "서울 종로", "aaa@aaa.com");
		Student s5 = new Student("신사임당", "강릉", "bbb@bbb.com", 30);
		Student s6 = new Student("을지문덕", "함경북도", "ccc@ccc.com", 40, 70.7);
		
		//각 객체의 필드에 저장된 값 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		
		
	}
}
