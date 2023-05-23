package ch10.ex06;

class Student {
	String name;
	
	// 합계와 평균을 출력하는 메소드 : 부모클래스의 메소드 : 실행코드가 없음, 자식클래스에서 오버라이딩 후 구현코드 생성
	void sum_avg() {
	}
	void sum_avg(String name, int kor, int eng, int math) {
		
	}
}

class Student_sub extends Student {
	int kor;
	int eng;
	int math;
	
	// 생성자로 매개변수값을 받아서 각 필드의 값을 할당
	public Student_sub(String name, int kor, int eng, int math) {
		sum_avg(name, kor, eng, math);
	}
	
	// 필드의 값을 모두 더하고 평균을 출력, 각 객체의 정수의 합계와 평균을 구하는 메소드
	@Override
	void sum_avg() {
	}
	
	void sum_avg(String name, int kor, int eng, int math) {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.printf("%s의 점수 총합은 %d이고 평균은 %.2f입니다.\n", name, sum, avg);
	}
}

public class Ex01 {
	public static void main(String[] args) {
	// 각 객체의 필드값 할당은 생성자 호출 시 매개변수로 값을 넣도록 하세요
		
/*
		"홍길동", 70, 88, 77
		"이순신", 80, 68, 87
		"김똘똘", 60, 86, 87
		"홍길순", 77, 56, 80
		"강감찬", 55, 66, 77
 */
	
	// Student 타입의 sum_avg로 출력
	Student s1 = new Student_sub("홍길동", 70, 88, 77);
	Student s2 = new Student_sub("이순신", 80, 68, 87);
	Student s3 = new Student_sub("김똘똘", 60, 86, 87);
	Student s4 = new Student_sub("홍길순", 77, 56, 80);
	Student s5 = new Student_sub("강감찬", 55, 66, 77);
		
		
	}
}
