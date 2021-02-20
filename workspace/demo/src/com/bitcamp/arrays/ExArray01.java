package com.bitcamp.arrays;

import java.util.Random;

public class ExArray01 {
	
	static int[] score = new int[5]; // �����ʵ�
	static int last = 0;

	public static void main(String[] args) {
		Random random = new Random();
		Math.random(); // static �ٷ� �����ִ�.
		
		int score[] = new int[5];
		// R : list ����
		
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
			System.out.println("��ϵ� ������ �����ϴ�.");
		}
	}

	private static boolean add(int[] score,int i) {    // �迭�� �߰��ϱ�
		int index = 0;
		if(last < score.length) {
			// ++Last
			score[last] = i;
			++last;
			return true;
		}
		return false;
	}

	
	private static void list() {   // �迭 ����Ʈ ����
		// TODO R : ��� ����
		String output = "";
		// ����ҹ��ڿ��� �����.
		for (int i = 0; i < score.length; i++) {
			output += String.format("[%d] %d\n", i , score[i]);
		}
		if(last == 0) {
			System.out.println("��ϵ� ���� �����ϴ�.");
		} else {
			// ����� �ѹ��� ������.
			System.out.println(output);
		}
	}
	
	
	
}
