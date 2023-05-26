package ch16.ex03;

class Apple {
	String apple = "사과";
}

class Banana {
	String banana = "바나나";
}

class Pencil {
	String pencil = "연필";
}

class Goods <T> {
	private T t;
	
	//getter
	public T getT () {
		return t;
	}
	
	// setter
	public void setT (T t) {
		this.t = t;
	}
}

public class Single_Generic {

	public static void main(String[] args) {
		Goods <Apple> apple = new Goods<Apple>();
		
		// setter를 통해서 Apple객체를 주입
		apple.setT(new Apple());
		
		// getter 를 통해 Apple 객체를 가져옴
		System.out.println(apple.getT().apple);
		
		Goods <Banana> banana = new Goods<Banana>();
		
		banana.setT(new Banana());
		
		System.out.println(banana.getT().banana);
		
		Goods <Pencil> pencil = new Goods<Pencil>();
		
		pencil.setT(new Pencil());
		
		System.out.println(pencil.getT().pencil);
		
	}
}
