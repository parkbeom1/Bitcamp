package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		double b;
		System.out.print("정수 입력 하세요 ");
//		br.read(); // 한글들어옴
//		a = br.readLine(); // 한줄 단위(엔터를칠때까지) 로  들어옴 , 문자열로 가져온다.
		// 문자를 이제 정수로 바꿔서 들어와야한다.
		a = Integer.parseInt(br.readLine());
		System.out.print("실수 입력 하세요");
		b = Double.parseDouble(br.readLine());
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}
/*
* IO Stream (입출력)
*  
* - Console (System)
입력 : System.in
출력 : System.out
	
	입력 : Reader 
	- BufferedReader 버퍼로 부터 읽어오다
	- FileReader 파일로부터 읽어오다
	- InputStreamReader 키보드로부터 읽어도다
	
	출력 : writer
	- BufferedWriter
	- FileWriter
* */