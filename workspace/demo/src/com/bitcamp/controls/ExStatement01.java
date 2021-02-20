package com.bitcamp.controls;

/**
 * 
 * ���
 * ���ù�(~ �̸� , �϶�)
 * - ���� ���� ��,����
 * - ���� ���� �����Ѵ�...
 * �ݺ���( ~ ����,�����Ѵ�.);
 * - �����ؼ� ���� �� ���� �Ǵ� ��
 * - �� (�� ��) ���࿡ ���� ���� ��
 * - ������ ���� ���ϴ� �� , ������ �ʴ� ��
 * - ������ �� , �������� �ʴ� ��
 * 
 * @author user
 *
 */
public class ExStatement01 {
	
	public static void main01(String[] args) {
		// ���� �Ǵ�
		int week = 1;
		if(week == 0) {
			
		} else if(week == 1) {
			
		} 
		// ����� : ���� 1���� ���� �ִ�. ���� , ���� ǥ���Ҽ� ����.
		// �������� ã�� ���� ���� ��� �����Ѵ�. 
		char cweek = ' ';
		switch(week) {
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
	
	public static void main(String[] args) {
		//
	}
	
}
