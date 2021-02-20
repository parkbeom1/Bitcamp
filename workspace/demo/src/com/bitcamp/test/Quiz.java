package com.bitcamp.test;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		// 20개의 임의 정수들을 출력
		// 그 중 최소 , 최대 값 찾아 출력
		// 변수가 무엇이 필요하고 무슨 함수 기능을 써야할지 생각해보기
		
		int min = 0;
		int max = 0;
		
		Random random = new Random();

		for(int i = 0; i <= 20; i++) {
			 int ran = random.nextInt();
			 if(i == 0) {
				max = min = ran;
			 }
			 System.out.println(ran);
			 
			 if(ran < min) {
				 min = ran;
			 }
			 if(ran > max) {
				 max = ran;
			 }
		}
		System.out.println("최소값은 > " + min);
		System.out.println("최대값은 > " + max);
		
		// 개수가 정해진 상황 , 개수가 정해지지 않는 상황(종료)
		int number;
		int count = 0;
		while(true) {
			number = (int)(Math.random()*1000);
			if(number < 10) {
				break;
			} 
			System.out.println(number + " ");
			++count;
			if(count == 5) {
				System.out.println();
				count = 0; // 뛰어쓰고 0으로 초기화
				
			}
		}
	}
}
