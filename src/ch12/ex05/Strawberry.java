package ch12.ex05;

public class Strawberry implements fruit {

	@Override
	public void name() {
		System.out.println("딸기");
	}

	@Override
	public void eat() {
		System.out.println("딸기를 먹습니다");
	}

	@Override
	public void color() {
		System.out.println("빨간색");
	}

}
