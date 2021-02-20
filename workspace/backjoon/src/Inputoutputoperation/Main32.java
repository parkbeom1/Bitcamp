package Inputoutputoperation;

import java.util.Scanner;

public class Main32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int max = 0;
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
				arr[i]= sc.nextInt();
				if(min > arr[i]) {
					min = arr[i];
				}
				if(max < arr[i]) {
					max = arr[i];
				}
				System.out.print("배열의 요소  " + arr[i]);
				System.out.println();
			}
		System.out.println(min + " " + max);
		}
	}
