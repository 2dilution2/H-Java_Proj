package ch17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_VS_List {

	public static void main(String[] args) {
		
		//1. 배열
		 String [] arr = new String[] { "가", "나", "다", "라", "마", "바", "사"};   // 방의 크기 : arr.length() //7
		 System.out.println("배열의 방의 갯수 : " + arr.length);
		 
		 	// 배열의 방의 중간의 값을 제거시 자동으로 축소되거나 늘어나지 않는다. 
		 arr[2] = null; 
		 arr[5] = null; 
		 
		 //출력 
		 System.out.println(Arrays.toString(arr));    //배열의 중간의 값을 제거시 자동으로 축소 되지 않는다. 
		 System.out.println("배열의 방의 갯수 : " + arr.length);
	
		 		
		//2. 컬렉션  : List <E>  <== ArrayList<E> 
		List<String> aList = new ArrayList<String> (); 
		 //인터페이스              //List의 메소드를 구현한 구현체 
		
		//
		System.out.println("List 의 방의 크기 : " + aList.size());    //방의 크기를 출력 
		
		aList.add("가"); aList.add("나");aList.add("다");aList.add("라");
		aList.add("마");aList.add("바");aList.add("사");
		
		System.out.println(aList.toString());  //[가, 나, 다, 라, 마, 바, 사]
		System.out.println("List 의 방의 크기 : " + aList.size());    //방의 크기를 출력 

		aList.remove("다"); 
		aList.remove("바");
		
		System.out.println("List 의 방의 크기 : " + aList.size());    //방의 크기를 출력 
		System.out.println(aList); //[가, 나, 라, 마, 사]
		
		
		
		
	}

}
