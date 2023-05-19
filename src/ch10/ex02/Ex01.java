package ch10.ex02;

class Customer {		// 부모 클래스 : 고객의 정보를 담은 클래스
	String name;		// 고객 이름
	long customerID;	// 고객 ID
	int customerPoint;		// 고객 포인트

	void customerInfo () {
		System.out.printf("고객이름 : %s\n고객ID : %d\n고객 포인트 : %d\n\n", name, customerID, customerPoint);
	}
	
}

// 자식 클래스 <= int goldPoint : 10점 / silver : 5점 / bronze : 3점, 메소드 : goldInfo() : 골드 회원입니다 출력 ...

class goldMember extends Customer {
	int goldPoint = 10;
	void goldInfo() {
		System.out.printf("고객이름 : %s\n고객ID : %d\n고객 포인트 : %d\n\n", name, customerID, goldPoint);
	}
}

class silverMember extends Customer {
	int silverPoint = 5;
	void silverInfo() {
		System.out.printf("고객이름 : %s\n고객ID : %d\n고객 포인트 : %d\n\n", name, customerID, silverPoint);

	}
}

class bronzeMember extends Customer {
	int bronzePoint = 3;
	void bronzeInfo() {
		System.out.printf("고객이름 : %s\n고객ID : %d\n고객 포인트 : %d\n\n", name, customerID, bronzePoint);

	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 각 객체를 생성해서 부모클래스의 필드와 메소드 접근 가능한지 확인 후 업캐스팅 <--> 다운캐스팅
		
		Customer c1 = new Customer();
		
		
		goldMember g1 = new goldMember();
		
		g1.name = "골드맴버";
		g1.customerID = 1111;
		g1.goldPoint = 10;
		
		silverMember s1 = new silverMember();
		
		s1.name = "실버멤버";
		s1.customerID = 2222;
		s1.silverPoint = 5;
		
		bronzeMember b1 = new bronzeMember();
		
		b1.name = "브론즈멤버";
		b1.customerID = 3333;
		b1.bronzePoint = 3;
		
		System.out.println("-----------------------------");
		
		// 객체를 배열에 넣음 : upCasting 됨
		// 배열 arr에 저장된 모든 객체는 Customer타입을 내포하고있고 Customew타입으로 upCasting 되어 들어가있음
		
		// arr에 들어가있는 객체는 Customer 타입
		Customer[] arr = new Customer[] {c1, g1, s1, b1};
		
		// 배열에 저장된 객체를 가지고 온다.
		Customer cc1 = arr[0];	// customer
		Customer cc2 = arr[1];	// customer / goldMember
		Customer cc3 = arr[2];	// customer / silverMember
		Customer cc4 = arr[3];	// customer / bronzeMember
		
		// 
		cc1.customerInfo();
		cc2.customerInfo();
		cc3.customerInfo();
		cc4.customerInfo();
		
		// 다운캐스팅
		goldMember gg1 = (goldMember) cc2;
		gg1.goldInfo();
		
		silverMember ss1 = (silverMember)cc3;
		ss1.silverInfo();

		bronzeMember bb1 = (bronzeMember)cc4;
		bb1.bronzeInfo();
		
		System.out.println("------------------------------");
		
		// 객체 생성 시 타입을 지정
		
		// 1. Customer 객체 생성 시 타입 지정
		Customer cus1 = new Customer();
		
		// 2. goldMember 객체 생성 시 타입 지정 : Customer / goldMember
		Customer cus2 = new goldMember();
			// cus2 : Customer / goldMember 타입  둘다 내포하고 있고 Customer로 지정
			cus2.name = "고객이름";
			
			goldMember gm1 = (goldMember) cus2;
			gm1.goldPoint = 10;
			gm1.goldInfo();
		
		// goldMember 객체 생성 시 타입을 goldMember로 지정 : Customer / goldMember 모두 접근가능
		goldMember gm2 = new goldMember();
		
		// 3. silverMember 객체화 하면서 customer 타입으로 지정
		Customer cus3 = new silverMember();
			// cus3 : Customer / silverMember 타입  둘다 내포하고 있고 Customer로 지정
		
		System.out.println("------------------------------");
		
		Customer ccc1 = new goldMember();
		Customer ccc2 = new silverMember();
		Customer ccc3 = new bronzeMember();
		
		// 자식클래스를 부모타입으로 객체화 해서 배욜에 저장
		Customer[] arr2 = new Customer[] {ccc1,ccc2,ccc3};
		
		// 각 배열 방의 값을 끄집어 내면서 다운캐스팅
		goldMember gm11 = (goldMember) arr[0];
		silverMember sm11 = (silverMember) arr[1];
		bronzeMember bm11 = (bronzeMember) arr[2];
		
		
		
		
		
		
	}
}
