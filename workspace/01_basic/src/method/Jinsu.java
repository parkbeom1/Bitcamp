package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Jinsu {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10진수 입력  : ");
		int dec = Integer.parseInt(bf.readLine());
		String binary = Integer.toBinaryString(dec); // 진수
		String octal = Integer.toOctalString(dec); // 8진수
		String hexa = Integer.toHexString(dec); // 16진수 
		System.out.println("2진수  = " + binary);
		System.out.println("8진수  = " + octal);
		System.out.println("16진수  = " + hexa);
	}
}
