package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 10~99난수를 2개(a,b) 발생하여 합을 맞추는 게임
		문제수는 총 5문제를 제공한다
		1문제당 점수 20점씩 계산
		[실행결과]
		[1] 26 + 35 = 10
		틀렸다	
		[2] 12 + 10 = 22
		딩동뎅
		당신의 총 x문제를 맞추어서 xx점 입니다
 */
public class PlusGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a  = 0; 
		int b  = 0;
		int answer = 0; // 내 대답 
		int right = 0;  // 정답   
		int score = 0;  // 점수 
		int rightcount = 0; // 맞춘 개수 
			for (int i = 1; i <= 5; i++) { // i 총 5문제 제공 
				a = (int)(Math.random()*90)+10; 
				b = (int)(Math.random()*90)+10;
				System.out.print("[" + i + "]" + a + " + " + b + " = ");
			answer = Integer.parseInt(br.readLine());
			right = a + b;
			if(answer == right) {
				System.out.println("딩동댕");
				score += 20;
				rightcount++;
			}
		}
			System.out.println("당신은  총 " + rightcount + "개 맞추어서 " + score + "점 입니다. ");
	}
}
