class NumberTest2  
{
	public static void main(String[] args) 
	{
		int a = 320;
		int b = 258;
		System.out.printf("320 + 258 = %d\n"  ,(a + b));
		System.out.printf("320 - 258 = %d\n" , (a - b));
		System.out.printf("320 * 258 = %d\n" , (a * b));
		System.out.printf("320 * 258 = %d\n" , (a / b)); // 1
		System.out.printf("320 / 258 = %.2f\n" , ((float)a / b )); // 1.24 , 실수 / 정수 = 실수 
		System.out.println("320 / 258 = " + String.format("%.2f",(float)a / b)); // 1.24
	
	}
}
