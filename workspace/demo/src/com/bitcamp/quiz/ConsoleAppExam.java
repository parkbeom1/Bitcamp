package com.bitcamp.quiz;

import java.io.IOException;

public class ConsoleAppExam {

	public static void main(String[] args) throws IOException {
		quiz01();
		quiz02();
	}

	private static void quiz02() throws IOException {
		int key;
		int numOfAlpha = 0; // 알파벳
		int numOfDigit = 0; // 숫자
		int numOfEtc = 0; // 기호
		
		while((key = System.in.read()) != '\n') {
			if(('a' <= key && key <= 'z') || ('A' <= key && key <= 'Z')) {
				
			}
		}
	}

	private static void quiz01() {
		// 출력하기(모양)
		int a = -1; //-1이 90도
		int b = 5; // 평행이동
		
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
			// 기울기 a x x좌표 + 평행이동
			// y = (a * x) + b
			if(y == (a * x) + b) {
				System.out.println("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}
	
	
	

}
