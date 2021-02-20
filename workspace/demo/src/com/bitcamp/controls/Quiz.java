package com.bitcamp.controls;

import java.util.Random;

public class Quiz {
	public static void main01(String[] args) {
		// 1 ~ 27까지 연속으로 정수들을 출력
		// 매 행 마다 최대 5개 까지만 출력 할수 있다.
		// 가능한 방법 2가지 이상
		// 또한 13 부터 27까지 이면
		
		int num;
		int cnt=0;
		
		for (num = 0; num <= 27; num++) {
			cnt++;
			if(cnt % 5 == 0) { // 숫자가 아닌 카운트 개수에 따라 나눈다.
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("----------");
		int cnt2 = 0;
		while(cnt < 27) {
			cnt++; // 행단위로 카운트를 몇개 했냐
			System.out.print(cnt + " ");
			if(cnt % 5 == 0) {
				System.out.print("\n");
			}
		}
		
		// 개수가 정해진 상황 , 개수가 정해지지 않는 상황 (종료), 항상 기준이 필요한 끝을
		// 정해진 반복을 종료 시켜야 한다. 
		// 길이가 늘었다 줄었다 하는 가변길이에 끝이 정해져 있어야 한다. 
		int number;
		int count = 0;
		while(true) {
				// 반복을 멈춰야 한다.
			 number = (int)(Math.random()*1000);
			 if(number < 10) { // 10보다 작으면
				 break;
			 }
			 System.out.print(number + " ");
			 ++count;
			 if(count == 5) {
				 System.out.println();
				 count = 0;
			 }
		}
	}
	public static void main(String[] args) {
		// 20개의 임의 정수들을 출력
		// 그중 최소 , 최대 값 찾아 출력하세요 
		// 변수가 무엇이 필요하고 무한 함수 기능을 써야할지 생각해 본다.
		int max = 0;
		int min = 0;
		Random random = new Random();
		for(int i=0; i < 19; i++) {
			int ran = random.nextInt();
			if(i==0) { // 첫번째 값으로 가정을 한다.
				min = max = ran;
			}
			System.out.println(ran);
		// 출력한 값 ran
		// 출력한 값이 ran 작은 값 , 큰 값 남긴다.
			if(ran < min) {
				min = ran;
			} 
			
			if(ran > max) {
				max = ran;
			}
		}
		// 20개 출력을 완료함
		System.out.println("최소값은 > " + min);
		System.out.println("최대값은 > " + max);
	}
}
