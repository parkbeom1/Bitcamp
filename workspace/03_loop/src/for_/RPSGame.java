package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가위바위보 게임
// com = 1~3 사이의 난수 발생
public class RPSGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com;
		int user;		
		System.out.print("insert coin ? ");
		int coin = Integer.parseInt(br.readLine());	
		for (int i = 0; i <= coin/100; i++) {		
			int comrand = (int)(Math.random()*3)+0; // 0 ~ 3 난수 발생 
			System.out.print("가위(1), 바위(2) , 보(3) 중 번호 입력 : ");	
			int userrand = Integer.parseInt(br.readLine());		
			coin -= 100;
			if(userrand == 1) {
				if((userrand < (comrand = 2))) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You LOSE");
				}else if((userrand < (comrand = 3))) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You LOSE");
				}
			}	
			if(userrand == 2) {
				if((userrand > (comrand = 1)) ) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You WIN");
				}else if(userrand < (comrand = 3)) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You LOSE");
				}
			}	
			if(userrand == 3) {
				if((userrand > (comrand = 2))) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You WIN");
				}else if((userrand > (comrand = 1))) {
					System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
					System.out.println("You WIN");
					}
				}
			if(userrand == comrand) {
				System.out.println("컴퓨터 : " + comrand + " 나 :" + userrand);
				System.out.println("You Draw");
				}
			}
		}
	}
/*
 * 가위(1), 바위(2) , 보(3) 게임 
 * 게임 판당 100원이다.
 * 
 * [실행 결과]
 * insert coin ? 1000   넣으면 10판  100원 미만으로 넣으면 안돌아간다. 150원 넣으면  게임은 한번 돌아간다. 
 * 가위(1), 바위(2) , 보(3) 중 번호 입력 : 1
 * 컴퓨터 : 바위  나 : 보자기
 * You Win!! 
 * 
 *  * 컴퓨터 : 바위  나 : 보자기
 * You Draw!! 
 * 
 *  * 컴퓨터 : 바위  나 : 보자기
 * You Lose!! 
*/
