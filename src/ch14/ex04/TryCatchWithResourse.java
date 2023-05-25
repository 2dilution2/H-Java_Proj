package ch14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchWithResourse {
	public static void main(String[] args) {
		// 객체를 사용 후 RAM에서 그 객체를 제거해야한다.
		// finally 블럭에서 사용한 객체를 close()

		System.out.println("문자를 콘솔에서 한자 입력하세요");

		// 1. 수동 시소스 해제 : finally블럭에서 해제
		InputStreamReader ir1 = null; // 콜솔에서 한 문자를 읽어드리는 객체

		ir1 = new InputStreamReader(System.in); // 콘솔에서 한 문자를 읽어들일 수 있는 객체를 활성화

		try {
			char input = (char) ir1.read(); // byte -> char타입으로 변환해서 input변수에 담는다.
			System.out.println("입력한 문자는 : " + input);
		} catch (IOException e) {
			System.out.println("IOException이 발생하였습니다. 문자 하나만 넣어주세요.");
			e.printStackTrace(); // 예외에 대한 자세한 정보를 출력하도록 한다.
		} finally { // 객체를 사용 후 메모리에서 제거해야한다.
			if (ir1 != null) {
				try {
					ir1.close();
				} catch (IOException e) {
					System.out.println("객체 제거 시 예외가 발생하였습니다.");
					e.printStackTrace();
				}
			}
		}

	}
}
