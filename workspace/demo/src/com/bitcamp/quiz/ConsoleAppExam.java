package com.bitcamp.quiz;

import java.io.IOException;

public class ConsoleAppExam {

	public static void main(String[] args) throws IOException {
		quiz01();
		quiz02();
	}

	private static void quiz02() throws IOException {
		int key;
		int numOfAlpha = 0; // ���ĺ�
		int numOfDigit = 0; // ����
		int numOfEtc = 0; // ��ȣ
		
		while((key = System.in.read()) != '\n') {
			if(('a' <= key && key <= 'z') || ('A' <= key && key <= 'Z')) {
				
			}
		}
	}

	private static void quiz01() {
		// ����ϱ�(���)
		int a = -1; //-1�� 90��
		int b = 5; // �����̵�
		
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
			// ���� a x x��ǥ + �����̵�
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
