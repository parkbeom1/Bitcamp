package switch_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class SwitchTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("a값 입력 :");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 :");
		int b = Integer.parseInt(br.readLine());
		System.out.println("연산자 (+,-,*,/)를 입력해주세요.");
		String op = br.readLine(); // int로 받으면
		
		// * read() 와 readLine() 의 차이점 
		/* int op = Integer.parseInt(br.readLine());  br.readLine은 String 문자열로 들어와서
		 *    숫자의 문자 형태로 바꿀수가없다.(문자 char만)
		 *    한글자씩 들어오는 br.read() 를 써야한다.   
		 *  int op 가 들어오면 case 에는 '+' , '-','*','/' 로 한다. 
		 */
		
		switch(op) {
		case "+" :  // 43
			System.out.println("a + b " + (a + b)); break;
		case "-" : 
			System.out.println("a - b " + (a - b)); break;
		case "*" :
			System.out.println("a x b " + (a * b)); break;
		case "/" :
			System.out.println(String.format("a / b %.2f", (float)a / b)); break;
		default :
			System.out.println("error");
		}
	}
}
/*
2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : +
25 + 36 = xx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : /
25 / 36 = 0.xxx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/) 입력 : #
연산자 error
*/