package hi.org;

public class ConsoleOutput3 {

	public static void main(String[] args) {
		// 코드는 main 메소드 내에서 작성
		
		//변수 선언 " Java 와 Javascript 는 완전히 별개의 언어 
			// <자료형> <변수명> = <값>;
		// 문자열 자료형 : String
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName = "홍당무";
		
		// 정수 자료형 : int
		int age = 25;
		
//		double age2=77.7;
		
		// 실수 자료형 : double
		double weith = 70.5;
		
		
//		int age = 50		<- 오류발생 age변수 중복 초기화
		System.out.println(age);
		
		age = 60;
		System.out.println(age);
		
		//아빠의 이름은 홍길동, 엄마이름은 홍길순
		//내이름은 홍당무, 나이는 25, 몸무게는 70.5
		
		// 1. println으로 출력
		System.out.println();
		System.out.println("---------println으로 출력--------------------------");
		System.out.println("아빠의 이름은 " + fatherName + "이고, 엄마이름은 " + motherName + "입니다.\n내이름은 " + myName + "이고, 나이는 " + age + "이고, 몸무게는 " + weith + "입니다.");
		
		// 2. print();
		System.out.println();
		System.out.println("---------print으로 출력--------------------------");
		System.out.print("아빠의 이름은 " + fatherName + "이고, 엄마이름은 " + motherName + "입니다.\n내이름은 " + myName + "이고, 나이는 " + age + "이고, 몸무게는 " + weith + "입니다.\n");
		

		// 3. printf();
		System.out.println();
		System.out.println("---------printf으로 출력--------------------------");
		System.out.printf("아빠의 이름은 %s이고, 엄마이름은 %s입니다.\n내이름은 %s이고, 나이는 %d이고, 몸무게는 %2.1f입니다.\n",fatherName, motherName, myName, age, weith);
		
		
		
		
		
	}

}
