package ch10.ex04;

import java.util.Iterator;

class Car {
	String companyName = "현대자동차";
	int carYear;
}

class Hcar extends Car {
	
	String carName;	// 모델명
	int maxSpeed;	// 최대 속력
	int oilLiter;	// 리터
	
}

class BMW extends Car {
	
}

public class Ex02 {

	Car[] arr = null;
	void carInfo (Car c1, Car c2, Car c3, Car c4) {
		// 현대자동차 객체를 인풋받아 arr변수에 저장
		// 현대자동차의 배열에 저장된 최대스피드의 평균을 출력
		// 현대자동차의 배열에 저장된 오일의 합을 출력
		arr = new Car[] {c1, c2, c3, c4};
		
		avgMaxSpeed(arr);
		System.out.printf("오일의 총 합은 %d입니다\n", sumOil(arr));
	}
	
	void avgMaxSpeed (Car[] arr ) {
		Hcar[] h1 = new Hcar[arr.length];
		for (int i = 0; i < arr.length; i++) {
			h1[i] = (Hcar) arr[i];
		}
		int a= 0;
		for (int i = 0; i < h1.length; i++) {
			 a += h1[i].maxSpeed;
		}
		double avg = (double) (a / h1.length);
		
		System.out.printf("최대 스피드의 평균은 %4.2f입니다.\n", avg);
	}
	
	int  sumOil (Car[] arr) {
		int sum = 0;
		Hcar[] h1 = new Hcar[arr.length];
		for (int i = 0; i < arr.length; i++) {
			h1[i] = (Hcar) arr[i];
		}
		for (int i = 0; i < h1.length; i++) {
			 sum += h1[i].oilLiter;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Hcar c1 = new Hcar();
		Hcar c2 = new Hcar();
		Hcar c3 = new Hcar();
		Hcar c4 = new Hcar();
		
		c1.carYear = 2000;
		c1.carName = "에쿠스";
		c1.maxSpeed = 330;
		c1.oilLiter = 60;
		
		c2.carYear = 2010;
		c2.carName = "제네시스";
		c2.maxSpeed = 300;
		c2.oilLiter = 50;
		
		c3.carYear = 2022;
		c3.carName = "그랜저";
		c3.maxSpeed = 2500;
		c3.oilLiter = 55;
		
		c4.carYear = 2023;
		c4.carName = "아반떼";
		c4.maxSpeed = 200;
		c4.oilLiter = 40;
		
		Ex02 e1 = new Ex02();
		e1.carInfo(c1, c2, c3, c4);
		
		
	}
}
