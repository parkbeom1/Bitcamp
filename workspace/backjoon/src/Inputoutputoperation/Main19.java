package Inputoutputoperation;

import java.util.Scanner;
public class Main19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
			for(int i = 0; i < t; i++) {	
				int a = sc.nextInt();
				int b = sc.nextInt();
				sum = a + b;
				System.out.println(sum);
			}
		}
	}
