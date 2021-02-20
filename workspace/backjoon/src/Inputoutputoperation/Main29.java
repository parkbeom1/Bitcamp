// while문은 조건문이 참이어야 실행이 된다. 그러므로 true 를 줘서 무조건 실행하게 한다.
package Inputoutputoperation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main29 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) { 
				break;
			} 
				System.out.println(a+b);
			}
		}
	}

