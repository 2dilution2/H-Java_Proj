package ch12.ex06;

interface A{}
interface B{}

// 단일 인터페이스 상속
class C implements A{}
class D implements B{}

// 다중 인터페이스 상속
class E implements A, B{}

// 클래스와 인터페이스를 한번에 상속 
class F extends C implements A, B{}

public class Inharitance {
	public static void main(String[] args) {
		
	}
}
