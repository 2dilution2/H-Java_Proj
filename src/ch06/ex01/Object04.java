package ch06.ex01;

class Car{
	// 기본 생성자
	public Car() {}
	
	// 필드 : 속성
	String company;		// 제조사
	String carName;		// 이름
	String carColor;	// 색
	int carSpeed;		// 최대속력
	double carWeight;	// 무게
	
	// 메소드 : 기능
	public void stop() {
		System.out.println(carName + "이(가) 멈춥니다.");
		System.out.println();
	}
	
	public void start() {
		System.out.println(carName + "이(가) 달립니다.");
		System.out.println();
	}
	
	public void print() {
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + carName);
		System.out.println("차색 : " + carColor);
		System.out.println("최대속력 : " + carSpeed);
		System.out.println("무게 : " + carWeight + "톤");
		System.out.println();
	} 
	
	
}
public class Object04 {
	public static void main(String[] args) {
		// c1객체 : 현대자동차 / 그랜저 / 검은색 / 250 / 1.0
		// c2객체 : 쌍용 / 투싼 / 노란은색 / 300 / 2.0
		// c3객체 : 기아 / K9 / 흰색 / 350 / 2.5
		
		// 각 객체의 메소드 출력
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "현대자동차";
		c1.carName = "그랜저";
		c1.carColor = "검은색";
		c1.carSpeed = 250;
		c1.carWeight = 1.0;
		
		c2.company = "쌍용자동차";
		c2.carName = "투싼";
		c2.carColor = "노란은색";
		c2.carSpeed = 300;
		c2.carWeight = 2.0;
		
		c3.company = "기아자동차";
		c3.carName = "K9";
		c3.carColor = "흰색";
		c3.carSpeed = 350;
		c3.carWeight = 2.5;
		
		c1.start();
		c1.stop();
		c1.print();
		
		c2.start();
		c2.stop();
		c2.print();
		
		c3.stop();
		c3.start();
		c3.print();
		
		System.out.println("---객체를 배열에 저장----");
		
		Car[] arr1 = new Car[3];
		arr1[0] = c1;
		arr1[1] = c2;
		arr1[2] = c3;
		
		// 배열의 저장된 각 방에 객체를 다시 끄집어 낸다.
		Car out1 = arr1[0];
		Car out2 = arr1[1];
		Car out3 = arr1[2];
		
		System.out.println(c1);
		System.out.println(out1);
		
		out1.print();
		
	}
}
