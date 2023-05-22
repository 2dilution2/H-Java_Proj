package ch10.ex03;
// 상속, 메소드 오버라이딩 (인스턴스 메소드), 업캐스팅, 다운캐스팅, 배열에 객체를 넣고 빼기 

// 부모클래스 : 자식클래스의 공통적으로 적용되는 필드, 메소드 정의, 
class Human {		// (부모)사람 <==> (자식)학생, 교수, 근로자
	
	// 필드 : 상속받을 자식클래스의 공통으로 사용하는 속성을 정의
	String name;
	int age;
	
	// 메소드 : 인스턴스 메소드 
	void eat () {
		System.out.println("모든 사람은 밥을 먹습니다.");
	}
}

// 자식클래스 
class Student extends Human {
	// Human 의 필드와 메소드
	// 필드
	int StuID;				// 학생에게만 적용되는 필드
	
	// 메소드
	void goToSchool () {	// 학생에게만 적용되는 메소드
		System.out.println("학생을 학교에 간다.");
		
	}
	
	// 메소드 오버라이딩
	@Override
	void eat() {
		System.out.println("학생을 학식을 먹습니다.");
	}
}

class Professor extends Human {
	int proID;
	
	void goToTeach () {
		System.out.println("교수는 학생들을 가르치러 학교에 갑니다.");
	}
	
	@Override
	void eat() {
		System.out.println("교수는 식사를 합니다.");		
	}
}

class Worker extends Human {
	int WorkID;
	
	void goToWork () {
		System.out.println("근로자는 일터로 출근을 합니다.");
	}
	
	@Override
	void eat() {		
		System.out.println("근로자는 식사를 합니다.");		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. 상속에서 부모클래스의 필드와 메소드 상속확인
		
		// Human 클래스h1 객체 생성 
		Human h1 = new Human();
		
		// Student 클래스 s1 객체를 생성 
		Student s1 = new Student();		// s1 : Human
		
		
		
		
		
		
		
		
	}
}
