package ch17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_List {

	public static void main(String[] args) {
		// 1. 배열
		String[] arr = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println("배열 방의 갯수 : " + arr.length);
		
		arr[2] = null;
		arr[5] = null;
		
		System.out.println(Arrays.toString(arr));	// 배열의 중간값을 제거시 자동으로 축소되지않는다.
		System.out.println("배열 방의 갯수 : " + arr.length);
		
		// 2. 컬랙션 : List <E> <-- ArrayList<E>
		List<String> aList = new ArrayList<String>();
		
		System.out.println("List 방의 갯수 : " + aList.size());
		aList.add("가");
		System.out.println("List 방의 갯수 : " + aList.size());
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");
		System.out.println("List 방의 갯수 : " + aList.size());
		
		aList.remove("다");
		aList.remove("바");
		System.out.println("List 방의 갯수 : " + aList.size());
	}
}
