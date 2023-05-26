package ch16.ex03;
class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Egle {
	String name = "독수리";
}

class Animal <T> {
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT (T t) {
		this.t = t;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Animal <Tiger> tiger = new Animal<Tiger>();
		
		tiger.setT(new Tiger());
		
		System.out.println(tiger.getT().name);
		
		Animal <Lion> lion = new Animal<Lion>();
		
		lion.setT(new Lion());
		
		System.out.println(lion.getT().name);
		
		Animal <Egle> egle = new Animal<Egle>();
		
		egle.setT(new Egle());
		
		System.out.println(egle.getT().name);
		
	}
}
