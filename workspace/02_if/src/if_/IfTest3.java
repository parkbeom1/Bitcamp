package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 /*
		 3개 의순서를 작은순서대로 입력된다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 예외처리 - 자동차 보험 - try ~~ catch		
		System.out.print("첫번째 과목 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int c = Integer.parseInt(br.readLine());
		
	}
}

