package ch06.ex01;

class Student2 {
	public Student2() {}
	
	String sName;
	int sAge;
	String sAddr;
	String sEmail;
	
	public void print() {
		System.out.println("이름 : " + sName);
		System.out.println("나이 : " + sAge);
		System.out.println("주소 : " + sAddr);
		System.out.println("이메일 : " + sEmail);
		System.out.println();
	}
	
}

public class Object06 {
	public static void main(String[] args) {
		Student2 kim = new Student2();
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";

		
		Student2 lee = new Student2();
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddr = "부산";
		lee.sEmail = "bbb@bbb.com";
		
		Student2 hong = new Student2();
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		Student2[] arr = new Student2 [] {kim,lee,hong};
		
//		arr[0] = kim;
//		arr[1] = lee;
//		arr[2] = hong;
		
		Student2 out1 = arr[0];
		Student2 out2 = arr[1];
		Student2 out3 = arr[2];
		
//		System.out.println(out1);
//		System.out.println(out2);
//		System.out.println(out3);
		
		kim.print();
		lee.print();
		hong.print();
	}
}
