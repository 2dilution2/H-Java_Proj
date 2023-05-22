package ch10.ex03;

import java.util.Iterator;

class Customer {
	void memberInfo () {
		System.out.println("회원님은 기본회원입니다.");
	}
}

class gold extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 골드회원입니다");
	}
}

class silver extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 실버회원입니다");
	}
}

class bronze extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 브론즈회원입니다");
	}
	
}


public class Ex03 {
	public static void main(String[] args) {
		
		Customer c1 = new gold();
		Customer c2 = new silver();
		Customer c3 = new bronze();
		
		c1.memberInfo();
		c2.memberInfo();
		c3.memberInfo();
		
		System.out.println("-----배열에 저장 후 한번에 출력------");
		Customer[] arr1 = new Customer[] {c1, c2, c3};
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i].memberInfo();
		}

		System.out.println("----Enhanced for문을 이용해 출력----");
		for (Customer k : arr1) {
			k.memberInfo();
		}
		
		
	}
}
