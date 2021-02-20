package com.bitcamp.test;

public class ExStatement01 {
	
	public static void main01(String[] args) {
		
		// �б⹮ : if	
		if(true) {
			// ���϶�
		} else {
			// �����϶�
		}	
		int score = 40;
		if(score >= 90) {
			// ���϶�
		}
	}
	public static void main02(String[] args) {
		boolean isopen = false; // ��
		boolean locked = true;  // ��� ��ġ
		
		if(locked) {
			if(!isopen) {
				System.out.println("���� ���ȴ�.");
			} else if(isopen) {
				System.out.println("���� ������.");
			} if(!locked) {
				System.out.println("����� ������.");
			}
 		}		
	}
	public static void main(String[] args) {
		// ���� �Ǵ�
		int week = 1;
		if(week == 0) {
			// 0 �̸� ����
		} else if(week == 1) {
			// 1 �̸� ����
		}
		char cweek = ' ';
	
		switch(week % 7 ) {
		
		case 0:
			cweek = '가';
			break;
		case 1:
			cweek = '나';
			break;
		case 2:
			cweek = '다';
			break;
		case 3:
			cweek = '라';
			break;
		case 4:
			cweek = '마';
			break;
		case 5:
			cweek = '바';
			break;
		case 6:
			cweek = '사';
			break;
		}
		System.out.println(cweek + "����");
	}
}
