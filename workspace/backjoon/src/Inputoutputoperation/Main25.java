package Inputoutputoperation;

import java.util.Scanner;

public class Main25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			for (int j = n; j >= 0; j--) { // 공백
				System.out.print(" "); 
			}for(int k = i; k <= n; k++) { // 별 
				System.out.print("*");
			}
			System.out.println(""); // 한줄 한줄 
		}
	}
}