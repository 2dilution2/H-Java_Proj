package ch16.ex02;

class Banana {
	Banana() {}
	Banana (String name) {
		this.name = name;
	}
	String name;
}

class Orange {
	Orange() {	}
	Orange (String name) {
		this.name = name;
	}
	String name;
}


class Goods2 {
	
	/// 필드
	private Object obj = new Object();
	
	// getter : 필드의 값을 리턴
	public Object getObj () {
		return obj;
	}
	
	// setter : 필드의 값을 할당
	public void setObj (Object obj) {		// obj변수에 자바의 모든 클래스를 담을 수 있다.
		this.obj = obj;
	}
}

public class Using_Object {
	public static void main(String[] args) {
		
	}
}
