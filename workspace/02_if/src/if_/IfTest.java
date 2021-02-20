package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IfTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			System.out.print("데이터 입력 : ");
			int a = Integer.parseInt(br.readLine());
			if(a >= 50) {
				System.out.println(a+"는 50보다 크거나 같다");
			} else {
				System.out.println(a+"는 50보다 작다" );
			}
		System.out.println();
	if(false) {
		if(false) System.out.println("A"); // A , C 실행 
		else System.out.println("B");
	System.out.println("C");
	System.out.println();
	
		if(a % 2 == 1) { // a % 2 != 0 
			System.out.println( a + " 는 홀수 입니다.");
			} else {
				System.out.println(a  + " 는 짝수 입니다.");
			}
		}
		
		System.out.println();
		if(a >= 'A' && a <= 'Z') 
			System.out.println((char)a + "는 대문자 입니다.");
		 else if(a >= 'a' && a <= 'z') 
			 System.out.println((char)a + "는 소문자 입니다. ");
		 else {
			 System.out.println("특수문자 입니다.");
		 	}
		}
	}
