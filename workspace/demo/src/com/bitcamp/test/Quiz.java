package com.bitcamp.test;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		// 20���� ���� �������� ���
		// �� �� �ּ� , �ִ� �� ã�� ���
		// ������ ������ �ʿ��ϰ� ���� �Լ� ����� ������� �����غ���
		
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
		System.out.println("�ּҰ��� > " + min);
		System.out.println("�ִ밪�� > " + max);
		
		// ������ ������ ��Ȳ , ������ �������� �ʴ� ��Ȳ(����)
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
				count = 0; // �پ�� 0���� �ʱ�ȭ
				
			}
		}
	}
}
