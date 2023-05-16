package ch07.ex02;

class C {
	
	void print (int[] a, double[] b) {
		// a배열을 값을 for문으로 출력
		// b배열의 값을 for문으로 출력
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		C c1 = new C();
		
		int[] arr1 = new int[] {10,20,30,40,50,60,};
		
		double[] arr2 = new double[] {10.1,20.2,30.3,40.4,50.5};
		
		c1.print(arr1, arr2);
	}
}
