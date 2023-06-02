package ch17.ex04;

import java.util.Set;
import java.util.TreeSet;

class MyClass {			// 일반클래스 : TreeSet에 넣을경우 정렬되어 저장되지않는다.
	int data1;
	int data2;
	
	// 생성자로부터 필드의 값 할당
	MyClass(int data1, int data2) {
		this.data1 = data1;		
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "MyClass [data1=" + data1 + "]";
	}
}

// MyClass2는 TreeSet에 저장할 때 특정 필드가 정렬해서 저장되도록 함
class MyClass2 implements Comparable<MyClass2>{
	int data1;
	int data2;

	MyClass2(int data1, int data2) {
		this.data1 = data1;		
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyClass2 o) {
		// 오름차순으로 정렬하여 저장
//		if (this.data1 < o.data1) {
//			return -1;
//		} else if (this.data1 == o.data1) {
//			return 0;
//		} else {
//			return 1;
//		}
		// 내림차순으로 정렬하여 저장
		if (this.data1 < o.data1) {
			return 1;
		} else if (this.data1 == o.data1) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "MyClass2 [data1=" + data1 + "]";
	}
	
}


public class Set_TreeSet_Class {
	public static void main(String[] args) {
		// Wrapper 클래스를 TreeSet에 저장하면 자동으로 오름차순으로 정렬되어 들어감
		Set<String> set1 = new TreeSet();
		set1.add("하");
		set1.add("가");
		set1.add("다");
		set1.add("아");
		
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet();
		set2.add(50);
		set2.add(50);
		set2.add(20);
		set2.add(40);
		set2.add(50);
		
		System.out.println(set2);
		
		// 특정 객체를 TreeSet에 넣으면 정렬되어 저장되지 않습니다.
		// 		- Comparable<E> 인터페이스를 구현해서 compareTo() 메소드를 오버라이딩 해서 특정 컬람이 정렬
		//		- 중복되지 않도록 하려면 : Object클래스의 equals(), hashcode()를 재정의
		
		// 1. MyClass 객체를 TreeSet에 저장 <-- 일반 클래스 : 정렬되어 들어가지 않는다.
		Set<MyClass> myset = new TreeSet();
		
		
		// 2. MyClass2 객체를 TreeSet에 저장 <-- Comparable 인터페이스의 compareTo() 메소드를 대덩의 함 : data1 : data1 필드를 정의
		
		Set<MyClass2> mySet2 = new TreeSet();
		mySet2.add(new MyClass2(1,1));
		
		System.out.println(mySet2);
		
		
	}
}
