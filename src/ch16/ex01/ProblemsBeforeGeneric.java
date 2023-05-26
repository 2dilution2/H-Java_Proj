package ch16.ex01;

// 상품을 저장하는 클래스 : Object와 Generic을 사용하지 않는 경우, 하나의 상품클래스에 하나의 타입에 하나의 상품을 저장

class Apple {
	Apple() {}
	Apple (String name){
		this.name = name;
	}
	String name;
}
class Goods1 {		// 상품을 저장하는 클래스 <-- 한종류의 상품만 저장
	private Apple apple = new Apple();
	
	// getter
	public Apple getApple () {
		return apple;
	}
	
	// setter
	public void setApple (Apple apple) {
		this.apple = apple;
	}
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		// 상품객체 생성 <- 사과만 저장가능
		Goods1 g1 = new Goods1();
		
		g1.setApple(new Apple("홍옥"));
		System.out.println((g1.getApple()).name);
		
		g1.setApple(new Apple("국광"));
		System.out.println((g1.getApple()).name);
		
		g1.setApple(new Apple("부사"));
		System.out.println((g1.getApple()).name);
	}
}
