package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	
     3과목(a,b,c) 3과목의 점수를 입력 받아서  합격인지 불합격인지 출력
     합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다. 
 	[실행결과]
 	첫번째 과목 점수 : 85
 	두번째 과목 점수 : 80
 	세번째 과목 점수 : 65
	합격
	
	첫번째 과목 점수 : 100
 	두번째 과목 점수 : 90
 	세번째 과목 점수 : 35
 	과락으로 불합격
 	
 	첫번째 과목 점수 : 62
 	두번째 과목 점수 : 60
 	세번째 과목 점수 : 45
 	불합격 
 */
public class IfTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 예외처리 - 자동차 보험 - try ~~ catch
		
		System.out.print("첫번째 과목 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int c = Integer.parseInt(br.readLine());
		int sum = a + b + c;
		int avg = sum / 3;
		if(a >= 40 && b >= 40 && c >= 40) {					
			if(avg >= 60) {
				System.out.println("합격 입니다. ");
			} else if(avg < 60 ) {
				System.out.println("불합격 입니다.");
			}
		} else {
			System.out.println("과락으로 불합격");
		}
	}
}

