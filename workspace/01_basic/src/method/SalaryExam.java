package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class SalaryExam {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("직책 입력 : ");
		String position = br.readLine();
		System.out.print("기본급 입력 : ");
		int basePay = Integer.parseInt(br.readLine());
		System.out.print("수당 입력 : ");
		int extraPay = Integer.parseInt(br.readLine());	
		int totalPay = basePay + extraPay;
		// 조건 ? 참 : 거짓;
		double taxRate = ((totalPay >= 4000000) ? 0.03 : 0.02); // 세율 계산
//		int tax = (int)(totalPay * taxRate);
//		int pay =totalPay - tax;	
		SalaryExam s = new SalaryExam();
		int tax = s.calcTax(totalPay,taxRate); 
		int pay = s.calcSalary(totalPay,tax);	
		System.out.println("\t ***" + name + " 월급 명세서 ***");
		System.out.println("직급 : " + position);
		System.out.println("기본급\t수당\t급여\t세율\t세금\t월급");
		System.out.println(basePay+"\t"
				+extraPay+"\t"
				+totalPay+"\t"
				+(int)(taxRate*100)+"% \t"
				+tax+"\t"
				+pay);
	}
	public int calcSalary(int totalPay,int tax) { // 구현 
		return totalPay - tax;
	}
	public int calcTax(int totalPay,double taxRate){ // 구현 
		return (int)(totalPay * taxRate);
	}
}
		
			