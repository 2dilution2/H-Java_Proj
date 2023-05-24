package ch12.ex04;

public class Cat implements Animal {

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("고양이가 살금살금 걷습니다.");
	}

}
