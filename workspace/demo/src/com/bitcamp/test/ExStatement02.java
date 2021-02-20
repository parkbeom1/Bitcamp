package com.bitcamp.test;

public class ExStatement02 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if(i % 2 == 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(String.format("%d * %d = %d", i , j , i * j));
				}
			}
		}
	}
}
