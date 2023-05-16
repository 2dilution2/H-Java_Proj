package ch07.ex02;

class E {
	// a는 배열 , b배열 각각의 값을 곱하는 인자
	// 배열 각각의 값을 b인자로 받은 변수로 곱하여 출력
	
	void print (int[] a, int b) {
		for (int i = 0; i < a.length; i++) { 
			System.out.print(a[i] * b + " ");
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		E e1 = new E();
		
		int[] arr1 = new int[] {1,2,3,4,5,6};
		
		e1.print(arr1, 5);
		
	}
}
