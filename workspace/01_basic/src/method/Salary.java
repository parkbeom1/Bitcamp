package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다 (조건연산자 - 조건 ? 참 : 거짓)
급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금
세금은 calcTax() 메소드 작성
월급은 calcSalary()  메소드 작성
[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000
   *** 홍길동 월급 명세서 ***
직급 : 부장
기본급      수당      급여      세율      세금      월급
4500000      200000  4700000   3%      xxxxx   xxxxxxx
*/
public class Salary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Salary sa = new Salary();
		System.out.print("이름 입력  : ");
		String name  = br.readLine();
		System.out.print("직급 입력  : ");
		String position = br.readLine(); 
		System.out.print("기본급 입력  : ");
		String Basicsalary = br.readLine(); // 기본급
		System.out.print("수당 입력  : ");
		String Allowance = br.readLine(); // 수당
		int Taxrate;//세율
		int salary = Integer.parseInt(Basicsalary) + Integer.parseInt(Allowance); 	//급여 = 기본급 + 수당
		
		// 급여, 세금, 월급
		// 세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다 (조건연산자 - 조건 ? 참 : 거짓)		
		
		if(salary >= 4000000) {
			Taxrate = 3;
		} else {
			Taxrate = 2;
		}
		int calc = sa.calcTax(salary,Taxrate);	// 세금
		int cals = sa.calcSalary(salary, calc); // 월급 
		
		sa.info(name,position,Basicsalary,Allowance,salary,Taxrate,calc,cals); // 이름,직급,기본급,급여,세율,세금,월급
	}
	
	public int calcTax(int salary , int Taxrate) { // 세금 = 급여 * 세율
		return salary * Taxrate;		
	}
	public int calcSalary(int salary,int calc) { // 월급  = 급여 - 세금
		return salary - calc;
	}
	public void info(String name,String position,String basicsalary,String allowance,int salary ,int Taxrate,int calc,int cals) {
		System.out.println("***"+ name +"월급 명세서 ***");
		System.out.println("직급  : " + position);
		System.out.println("기본급\t수당\t급여\t세율\t세금\t월급");
		System.out.println(
				basicsalary+"\t" // 기본급
				+allowance+"\t" // 수당
				+salary+"\t" // 급여
				+Taxrate+"\t" // 세율
			    +calc+"\t" //세금			 					
				+cals);  // 월금 
		}
	}
