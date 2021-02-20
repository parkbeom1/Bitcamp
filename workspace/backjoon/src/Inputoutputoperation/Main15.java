package Inputoutputoperation;

import java.util.Scanner;
public class Main15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		if(n >= 1 && n <= 9) {
			for(int j = 1; j<=9; j++) {
				System.out.println(n+" * "+j+" = "+n*j);
				}
			}
		}
	}
