package com.bitcamp.test;

public class ExOperator01 {
	public static void main(String[] args) {
		
		// 1. ��� ����
		int num;
		num = 10 + 5;
		num = 10 - 5;
		num = 10 * 5;
		num = 10 / 5;
		num = 10 % 5;
		++num;
		num--;
		
		num = 1;
		num = num * 10 + 2;
		num = num * 10 + 3;
		
		num = 10;
		if(num % 2 ==0) {
			System.out.println("2�� ��� �Դϴ�.");
		}
	}
}
