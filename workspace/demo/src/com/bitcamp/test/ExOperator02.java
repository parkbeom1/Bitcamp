package com.bitcamp.test;

import java.util.Random;

public class ExOperator02 {

	public static void main04(String[] args) {
		
		int totalContent = 1213;   // ��ü����
		int contentsPerPage = 25;  // �������� ����
		
		int pages = totalContent / contentsPerPage; // ��ü ������
		int mod = totalContent % contentsPerPage;
		
		if(mod > 0) { // ������ ������
			pages++; // �������� ����
		}
		System.out.println(pages);
	}

	public static void main02(String[] args) {
		Random random = new Random();
		int a = random.nextInt() % 1001; // 1001 ���ϸ� ���
		int b = random.nextInt() % 1001;
		int c = random.nextInt() % 1001;
		
		int sum = a + b + c;
		System.out.printf(" a : %d , b : %d , c : %d\n",a,b,c);
		System.out.println("���� : " + sum);
		int avg = sum / 3;
		System.out.println("��� : " + avg);
	}
	
	public static void main03(String[] args) {
		 double ran = Math.random();
		 int number = (int)(ran * 1000);
		 System.out.println(number);
		 double lf = 10.789;
		 // �ڵ� ����ȯ  ������-> ū�ŷ�
		 System.out.println(lf);
		 // ���� ����ȯ  ū�� -> ������
		 int n = (int)lf;
		 System.out.println(n);
		 System.out.println((double)n); // ����� ����ȯ 
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int min = random.nextInt(10); // 0 ~ 9 
		int max = random.nextInt(100)+min;  // �ּ� ~ �ִ밪 
		
		System.out.println(min); // �ּҰ�
		System.out.println(max); // �ִ밪 
		
		System.out.println(min + " ~ " + max);
		// �ִ� �ּ� ���̿� �ִ� ���ڸ��� �̱� 
		int a = random.nextInt(max-min+1)+min; // min ���� �ִ� ǥ��
		int b = random.nextInt(max-min+1)+min; 
		int c = random.nextInt(max-min+1)+min;
		System.out.println("a "+a+ "b "+b+"c "+c); 
	}
	
	public static void main05(String[] args) {
		double ran = Math.random();
		int number = (int)(ran * 1000); // ran �� ���� �ݿø� �ϰ� int�� �ڸ���. 
		System.out.println(number);
		
	}
}
