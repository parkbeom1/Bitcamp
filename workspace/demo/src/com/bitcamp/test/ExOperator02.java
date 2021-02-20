package com.bitcamp.test;

import java.util.Random;

public class ExOperator02 {

	public static void main04(String[] args) {
		
		int totalContent = 1213;   // 전체문단
		int contentsPerPage = 25;  // 페이지당 문단
		
		int pages = totalContent / contentsPerPage; // 전체 페이지
		int mod = totalContent % contentsPerPage;
		
		if(mod > 0) { // 나눈게 남으면
			pages++; // 한페이지 증가
		}
		System.out.println(pages);
	}

	public static void main02(String[] args) {
		Random random = new Random();
		int a = random.nextInt() % 1001; // 1001 이하만 출력
		int b = random.nextInt() % 1001;
		int c = random.nextInt() % 1001;
		
		int sum = a + b + c;
		System.out.printf(" a : %d , b : %d , c : %d\n",a,b,c);
		System.out.println("종합 : " + sum);
		int avg = sum / 3;
		System.out.println("평균 : " + avg);
	}
	
	public static void main03(String[] args) {
		 double ran = Math.random();
		 int number = (int)(ran * 1000);
		 System.out.println(number);
		 double lf = 10.789;
		 // 자동 형변환  작은거-> 큰거로
		 System.out.println(lf);
		 // 강제 형변환  큰거 -> 작은거
		 int n = (int)lf;
		 System.out.println(n);
		 System.out.println((double)n); // 명시적 형변환 
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int min = random.nextInt(10); // 0 ~ 9 
		int max = random.nextInt(100)+min;  // 최소 ~ 최대값 
		
		System.out.println(min); // 최소값
		System.out.println(max); // 최대값 
		
		System.out.println(min + " ~ " + max);
		// 최대 최소 사이에 있는 세자리수 뽑기 
		int a = random.nextInt(max-min+1)+min; // min 부터 최대 표현
		int b = random.nextInt(max-min+1)+min; 
		int c = random.nextInt(max-min+1)+min;
		System.out.println("a "+a+ "b "+b+"c "+c); 
	}
	
	public static void main05(String[] args) {
		double ran = Math.random();
		int number = (int)(ran * 1000); // ran 의 값을 반올림 하고 int로 자른다. 
		System.out.println(number);
		
	}
}
