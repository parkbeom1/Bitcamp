package method;

import java.io.IOException;
public class InputTest {
	public static void main(String[] args) throws IOException {
		System.out.print("데이터   :  ");
		int a  = System.in.read(); // 입력을 받으라는것  , exception 예외처리 사고가날것을 대비하는것  
								   // 한글자 밖에 못받는다  
		System.out.println("결과  = " + a);
	}
}
/*
 * 
 * IO Stream (입출력)
 *  
 * - Console (System)
입력 : System.in
출력 : System.out
	
	입력 : Reader 
	- BufferedReader 버퍼로 부터 입력
	- FileReader 파일로부터 입력
	- InputStreamReader 키보드로부터 입력
	
	출력 : writer
	- BufferedWriter
	- FileWriter
	
 * 
*/