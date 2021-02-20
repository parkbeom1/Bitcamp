package basic;

public class CompTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0 , num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+ num1 + " num2 = " + num2);
		System.out.println();
		
		result = ((num1 += 10) > 0 || (num2 += 10) > 0); // |가 하나면 둘다 무조건 실행 
		System.out.println("result = " + result);
		System.out.println("num1 = "+ num1 + " num2 = " + num2);
		System.out.println();	
	}
}
