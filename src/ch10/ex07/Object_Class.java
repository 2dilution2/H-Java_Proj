package ch10.ex07;

class A {
// class A Extends Object
	Integer a;
	String b;
	Double c;
	Boolean d;
	
	Object e;
}

class B extends A {
	int a;
	int b;
	int c;
}
public class Object_Class {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a);
		System.out.println(a.toString());
	}
}
