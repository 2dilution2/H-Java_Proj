package ch08.ex03;

class Student {			// default : 외부패키지에서 접근이 불가함
	
	// 외부에서 접근이 불가한 필드, 외부클래스에서 필드에 직접 값을 접근 할 수 있도록 설정
	private String stName;
	private String stAddr;
	private int age;
	private double weight;
	
	// getter, setter 를 사용해서 
		// private 필드에 값을 넣을 때 setter 
		// private 필드에 값을 불러올 때 getter
}

public class Private {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		
	}
}
