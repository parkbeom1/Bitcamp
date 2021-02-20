package com.bitcamp.arrays;

import java.util.Random;

public class ExArray01 {
	
	static int[] score = new int[5]; // 전역필드
	static int last = 0;

	public static void main(String[] args) {
		Random random = new Random();
		Math.random(); // static 바로 쓸수있다.
		
		int score[] = new int[5];
		// R : list 보기
		
		list();
		add(score,10);
		add(score,20);
		add(score,30);
		add(score,40);
		add(score,50);
		
		update(1,100);
		
		delete(2);
		
	}
	
	private static void delete(int del) {
		for (int i = 0; i < score.length-1; i++) {
			 score[i] = score[i+1];
		}
		--last;
	}

	private static void update(int i , int j) {
		if(i < last) {
			score[i] = j;
		} else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}

	private static boolean add(int[] score,int i) {    // 배열에 추가하기
		int index = 0;
		if(last < score.length) {
			// ++Last
			score[last] = i;
			++last;
			return true;
		}
		return false;
	}

	
	private static void list() {   // 배열 리스트 보기
		// TODO R : 목록 보기
		String output = "";
		// 출력할문자열을 만든다.
		for (int i = 0; i < score.length; i++) {
			output += String.format("[%d] %d\n", i , score[i]);
		}
		if(last == 0) {
			System.out.println("등록된 정보 없습니다.");
		} else {
			// 출력은 한번에 끝낸다.
			System.out.println(output);
		}
	}
	
	
	
}
