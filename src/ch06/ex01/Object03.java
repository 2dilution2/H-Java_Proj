package ch06.ex01;

class Student{
//	기본 생성자 : 생략가능
	public Student() {}
	// 변수 선언
	String name;
	int kor;
	int eng;
	int math;
	
	// 메소드 선언 
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println();
	}
}

public class Object03 {
	public static void main(String[] args) {
			// s1 객체 생성 : 홍길동, 80, 90, 100
			// s2 객체 생성 : 이순신, 60, 88, 70
			// s3 객체 생성 : 세종대왕, 90, 99, 88
			// s4 객체 생성 : 신사임당, 77, 88, 90
		
			// 각 객체를 print
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.name = "홍길동";
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 100;
		
		s2.name = "이순신";
		s2.kor = 60;
		s2.eng = 88;
		s2.math = 70;
		
		s3.name = "세종대왕";
		s3.kor = 90;
		s3.eng = 99;
		s3.math = 88;
		
		s4.name = "신사임당";
		s4.kor = 77;
		s4.eng = 88;
		s4.math = 99;
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		
	}
}
