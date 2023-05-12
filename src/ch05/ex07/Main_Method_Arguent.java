package ch05.ex07;

public class Main_Method_Arguent {

	public static void main(String[] args) {
//		main 메소드 Input으로 값을 넘겨서 변수에 할당하고 출력
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		System.out.println(a + b + c + d);		// + 는 연결 연산자로 사용됨
		
		System.out.println("----------------------------------");
		
//		String을 정수로 변환 : Integer.ParsetInt();
		
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		int cc = Integer.parseInt(args[2]);
		int dd = Integer.parseInt(args[3]);
		
		System.out.println(aa + bb + cc + dd);		// + 는 더하기 연산자로 사용됨
		
		System.out.println("----------------------------------");

//		메인 메소드의 매개변수 args로 들어오는 값을 for문을 사용해 출력
		
		System.out.println(args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
