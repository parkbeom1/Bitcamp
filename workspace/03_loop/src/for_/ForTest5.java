package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
										// IOException 자바머신에 해결해달라고 던져준다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작값 입력 : ");
		int start = Integer.parseInt(br.readLine()); // readLine의 한줄은 엔터를 칠떄까지로 본다. 	
		System.out.print("끝값 입력 : ");
		int end = Integer.parseInt(br.readLine());
		int sum = 0;	
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("누적 합  : " +  sum);
	}
}


/*
시작값 입력 : 15 
끝값을 입력하시오 : 20
*/