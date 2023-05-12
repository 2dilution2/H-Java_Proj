package ch05.ex07;

public class Ex01 {
	public static void main(String[] args) {
/*
		main메소드 args로 다음의 값을 넘깁니다
		
		국어 60 영어 70 수학 80 음악 90 과학 70
		
		각 과목의 합계 : 
				평균 : 
		
 */
		
		String kor = args[0];
		String eng = args[1];
		String math = args[2];
		String mus = args[3];
		String sci = args[4];
		
		int ik = Integer.parseInt(kor);
		int ie = Integer.parseInt(eng);
		int im = Integer.parseInt(math);
		int ims = Integer.parseInt(mus);
		int is = Integer.parseInt(sci);
		System.out.println(ik + ie);
		
		double dk = Double.parseDouble(kor);
		double de = Double.parseDouble(eng);
		double dm = Double.parseDouble(math);
		double dms = Double.parseDouble(mus);
		double ds = Double.parseDouble(sci);
		
		System.out.print("각과목의\t총합 : ");
		System.out.println(ik + ie + im + ims + is);
		System.out.print("\t평균 : ");
		System.out.println((dk + de + dm + dms + ds)/args.length);
		
	}
}
