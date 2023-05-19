package ch10.ex01;
// 부모 클래스 (Human) <= 필드와 메소드 : 자식클래스에서 공통된 특징을 갖는 필드와 메소드를 정의함)
class Human {
	String name;	// 모든 사람은 이름을 갖는다.
	int age;		// 모든 사람은 나이를 갖고있다.
	void eat() {	// 모든 사람은 먹는다.
		System.out.println("모든 사람은 먹는다.");
	}
	
	void sleep () {	// 모든 사람은 잠을 잔다.
		System.out.println("모든 사람은 잠을 잔다.");
	}
}


// 자식 클래스 (Student, Worker, Professor)
	// 부모클래스의 필드와 메소드를 상속받게된다.
	// 추가적으로 그 클래스만이 가지는 필드와 메소드를 정의해서 사용.

class Student extends Human {
	
	// 추가적으로 학생클래스에 필요한 필드와 메소드를 정의
	int studentID;
	void goToSchool() {
		System.out.println("학생은 학교를 갑니다.");
	}
}

class Worker extends Human {
	int workerID;
	void goToWork() {
		System.out.println("근로자는 일터로 갑니다.");
	}
}
 
class professor extends Human {
	int professorID;
	void goToTeach() {
		System.out.println("교수는 가르치러 갑니다.");
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		// 필드
		s1.age = 10;
		s1.name = "홍길동";
		s1.studentID = 1111;
		
		// 메소드
		s1.eat();
		s1.sleep();
		s1.goToSchool();

		Worker w1 = new Worker();
		
		// 필드
		w1.age = 30;
		w1.name = "홍길동";
		w1.workerID = 2222;
		
		// 메소드
		w1.eat();
		w1.sleep();
		w1.goToWork();

		professor p1 = new professor();
		
		// 필드
		p1.age = 50;
		p1.name = "홍길동";
		p1.professorID = 3333;
		
		// 메소드
		p1.eat();
		p1.sleep();
		p1.goToTeach();
	}
}
