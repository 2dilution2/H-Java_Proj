package ch07.ex04;

public class Ex01 {
	
	public static void arrSum (int[] a, int[] b) {
		
		for (int i = 0;; i++) {
			System.out.print(a[i] + b[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int [500/7];		// 0~500까지 7의배수를 저장
		int[] b = new int [500/9];		// 0~500까지 9의 배수를 저장
		
		for (int i = 0, n = 7; n <= 500; i++) {
			a[i] = n;
			n+=7;
		}
		
		for (int i = 0, n = 9; n <= 500; i++) {
			b[i] = n;
			n+=9;
		}
		arrSum(a,b);
	}
}
