package basic;

public class CalcTest {
/*
	320 , 258의 합 , 차 , 곱 ,몫을 구하시오
		[실행결과]
		320 + 258 = sum 
		320 - 258 = sub
		320 * 258 = mul
		320 / 258 = div 	
*/
	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		int sum = a + b;                      
		int sub = a - b;
		int mul = a * b;
		float div = (float)a / b; // 실수/정수 = 실수 
		short sum2 = (short)(a + b); // 계산된  + 결과는 int형
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.printf("%d / %d = %.2f",a,b,div); // 1.24	
	}
}