package basic;

import java.text.DecimalFormat;

/*
이름이 L(name)인 사람의 기본급(basePay)이 2500000일때 3.3% 세금(tax)과 월급(salary)을 계산하시오
세금 = 기본급 * 3.3%(0.033)
월급 = 기본급-세금
		
[실행결과]
*** L의 월급 ***
기본급 : 2500000원
세금   :   82500원
월급   : 2417500원
*/
public class PayTest {
	public static void main(String[] args) {
		// 변수잡고 계산하고 찍어낸다.
		DecimalFormat df = new DecimalFormat("#,###");
		String name = "L";  // 사람
		int basePay = 2500000; // 기본급
		int tax = (int)(basePay * 0.033); // 강제형변환  float을 int형으로 ,단 클래스형 에도 있다.
		int salary = basePay - tax;// 월급
		System.out.println("***" + name + "의 월급***" );
		System.out.println("기본급 : " + df.format(basePay) + "원");
		System.out.println("세금 : " + df.format(tax) + "원");
		System.out.println("월급 : " + df.format(salary) + "원");
	}
}
