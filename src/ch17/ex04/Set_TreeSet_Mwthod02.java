package ch17.ex04;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.NavigableSet;

public class Set_TreeSet_Mwthod02 {
	public static void main(String[] args) {
		
		// 중요 : TreeSet을 객체화 해서 TreeSet타입으로 지정
		TreeSet<Integer> treeSet = new TreeSet();

		// treeSet에 값을 입력 : 50에서 2ㅆ기 감소하면서 저장
		for (int i = 50; i > 0; i-=2) {
			treeSet.add(i);
		}
		
		// 출력 : Iterator
		Iterator<Integer> ir = treeSet.iterator();
		
		while (ir.hasNext()) {
			System.out.println(ir.next() + " ");
		}
		System.out.println();
		
		System.out.println(treeSet);
		
		System.out.println("-----검색기능사용(가져오기)---------------");
		// 1. first() : 제일 처음값 가져오기
		System.out.println(treeSet.first());
		// 2. last() : 제일 마지막값 가져오기
		System.out.println(treeSet.last());
		// 3. lower(E element) : element보다 작은 값을 출력
		System.out.println(treeSet.last());
		// 4. higher(E element) : element보다 큰 값을 출력
		System.out.println(treeSet.higher(10));
		// 5. floor(E element) : element를 포함해서 작은값 출력
		System.out.println(treeSet.floor(25));
		// 6. ceiling(E element) : element를 포함해서 큰 값을 출력
		System.out.println(treeSet.floor(25));
		
		System.out.println("---데이터 꺼내기-------");
		// 7. pollFirst(); : 제일 첫번째 값 꺼내기
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		
		System.out.println("-------------------");
		System.out.println(treeSet);
		System.out.println("-------------------");
		for (int i = 0; i < treeSet.size(); i++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println(treeSet);
		
		// 8. pollLast(); : 제일 마지막 값 꺼내기
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		
		System.out.println("-------------------");
		System.out.println(treeSet);
		System.out.println("-------------------");
		for (int i = 0; i < treeSet.size(); i++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println(treeSet);
		
		System.out.println("------정렬---------------");
		
		// 9. SortedSet<E> headSet(E element) : element 값을 Head쪽으로 정렬해서 저장 (element 는 미포함)
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		// SortedSet<Integer> sSet = treeSet.headSet(20)
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		System.out.println("---------------------------");
		// 10. NevigableSet<E> headSet(E element, true) : element 값을 Head쪽으로 정렬해서 저장 (element 는 포함)
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet);
		
		System.out.println("---------------------------");
		// 11. SortedSet<E> tailSet(E element) : element 값을 Tail쪽으로 정렬해서 저장 (element 는 포함)
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		System.out.println("---------------------------");
		
		// 12. NevigableSet<E> headSet(E element, true) : element 값을 Head쪽으로 정렬해서 저장 (element 는 미포함)
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, true);
		System.out.println(nSet2);
		
		System.out.println("---------------------------");
		
		// 13. SortedSet<E>
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet<Integer> sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3);
		
		System.out.println("---------------------------");

		// 14. NavigableSet<E>
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet3 = treeSet.subSet(10,true, 20,true);
		System.out.println(nSet3);
		
		System.out.println("--------반대로 정렬하기-------------------");
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> desc = treeSet.descendingSet();
		System.out.println(desc);
		
		NavigableSet<Integer> asc = desc.descendingSet();
		System.out.println(asc);
		
		
		
	}
}
