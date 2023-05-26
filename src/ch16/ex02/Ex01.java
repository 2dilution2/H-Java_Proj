package ch16.ex02;

class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Egle {
	String name = "독수리";
}


class Animal {
	private Object obj;
	
	// getter : 객체정보 출력
	public Object getObj() {
		return obj;
	}

	// setter : obj필드의 값을 저장
	public void setObj (Object obj) {
		this.obj = obj;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Tiger tiger = new Tiger();
		
		animal.setObj(tiger.name);
		
		System.out.println(animal.getObj());
		
		
	}
}
