package numberTest;

public class Quiz {
	public static void main(String[] args) {
		int a = 320;
		int b = 258;
		
		System.out.printf("320 + 258 = %d\n" , a + b);
		System.out.printf("320 - 258 = %d\n" , a - b);
		System.out.printf("320 * 258 = %d\n" , a * b);
		System.out.printf("320 / 258 = %d\n" , a / b);
		System.out.printf("320 / 258 = %.2f\n" , (float)a / b); // 소수점 2째자리 까지
												// 정수 a를 소수점으로 형변환 	
	}
}
