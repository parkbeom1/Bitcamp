package Inputoutputoperation;

import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
