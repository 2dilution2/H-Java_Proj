package ch14.ex04;

import java.io.InputStreamReader;

public class TryCatchWithResourse02 {
	public static void main(String[] args) {
		
		System.out.println("콘솔에서 한글자만 입력하세요");
		
		try (InputStreamReader ir1 = new InputStreamReader(System.in)){
			char input = (char) ir1.read();
			System.out.println("입력하신 문자는 : " + input);
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
		}
		
		// finally 블럭에서 객체를 제거하지않아도 자동으로 객체가 제거됨
		
	}
}
