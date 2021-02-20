package Inputoutputoperation;

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if(H >= 0 && H <= 23) {
			if(M >= 0 && M <= 59) {	
				System.out.println(H + " " + M);
			}
		}
	}
}
