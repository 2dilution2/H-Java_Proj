package ch07.ex03;

class Product {
	// 생성자 오버로딩 필드의 갯수에 따라서 생성자 생성 : 5개 생성자
	// 객체 자체를 출력 시 그 객체의 필드의 내용을 출력
	
	String proName;		// 제품 이름
	int proNo;			// 제품 번호 
	int proPrice;		// 제품 가격
	int procount;		// 제품 수량
	
	public Product() {
	}

	public Product(String proName) {
		this.proName = proName;
	}

	public Product(String proName, int proNo) {
		this.proName = proName;
		this.proNo = proNo;
	}

	public Product(String proName, int proNo, int proPrice) {
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}

	public Product(String proName, int proNo, int proPrice, int procount) {
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.procount = procount;
	}

	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proNo=" + proNo + ", proPrice=" + proPrice + ", procount=" + procount
				+ "]";
	}
	
	
	
	
}
public class Ex01 {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		Product p2 = new Product("모니터");
		Product p3 = new Product("본체", 1);
		Product p4 = new Product("키보드" , 2 , 70000);
		Product p5 = new Product("마우스" , 3 , 50000 , 30);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}
}
