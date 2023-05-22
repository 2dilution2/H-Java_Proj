package ch10.ex04;

class Human {
	String name;
	int age;
}

class Student extends Human {
	int kor;
	int eng;
	int math;

}

public class Ex01 {
	// Student객체를 매개변수로 인풋받아 배열에 저장하는 메소드
	Human[] arr = null;

	void arrMethod(Human h1, Human h2, Human h3) {
		// h1, h2, h3를 arr배열에 넣는다.
		// sumKor(arr) : "국어점수의 합은 입니다"
		// sumEng(arr) : "영어점수의 합은 입니다"
		// sumMath(arr) : "수학점수의 합은 입니다"
		
		Human[] arr = new Human[] {h1, h2, h3};
		sumKor(arr);
		sumEng(arr);
		System.out.println("수학점수의 합은 " + sumMath(arr) + "입니다.");

	}

	void sumKor(Human[] h1) { // 각 객체의 국어점수합 출력, student로 다운캐스팅 한 후
		Student[] s1 = new Student[h1.length];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = (Student) h1[i];
		}
		int a = 0;
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].kor;
		}
		System.out.println("국어점수의 합은 " + a + "입니다.");
	}

	void sumEng(Human[] h1) { // 각 객체의 영어점수를 출력
		Student[] s1 = new Student[h1.length];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = (Student) h1[i];
		}
		int a = 0;
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].eng;
		}
		System.out.println("영어점수의 합은 " + a + "입니다.");

	}

	int sumMath(Human[] h1) {
		int a = 0;
		Student[] s1 = new Student[h1.length];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = (Student) h1[i];
		}
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].math;
		}
		return a; // 배열에 들어온 수학점수를 모두 더해 리턴
	}

	public static void main(String[] args) {

		Student s1 = new Student(); // 홍길동 / 30 / 60 / 70 / 80
		Student s2 = new Student(); // 이순신 / 40 / 66 / 77 / 88
		Student s3 = new Student(); // 강감찬 / 50 / 77 / 88 / 99

		s1.name = "홍길동";
		s1.age = 30;
		s1.kor = 60;
		s1.eng = 70;
		s1.math = 80;

		s2.name = "이순신";
		s2.age = 40;
		s2.kor = 66;
		s2.eng = 77;
		s2.math = 88;

		s3.name = "강감찬";
		s3.age = 50;
		s3.kor = 77;
		s3.eng = 88;
		s3.math = 99;
		
		
		// 메소드 호출
		Ex01 e1 = new Ex01();
		
		e1.arrMethod(s1, s2, s3);
	}
}
