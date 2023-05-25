package ch14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Checked_Exception {
	public static void main(String[] args) {
		// 1. InterruptedException : interrupted가 발생되었을 떄 예외
//		Thread.sleep(1000);		// 스레드를 1초동안 잠시 멈춰라
		
		// 2. ClassNotFoundException : 특정경로에 해당클래스가 존재하지않는 경우 발생
//		Class als = Class.forName("java.lang.Object");	// DB의 드라이버를 로드할 때 
		
		// 3. IOException : Input, Output에 대한 예외
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		// 4. FileNotFoundException : 파일을 찾을 수 없을때 발생
//		FileInputStream fis = new FileInputStream("text.txt");
		
		
	}
}
