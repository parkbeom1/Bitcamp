class NumberTest2  
{
	public static void main(String[] args) 
	{
		System.out.printf("320 + 258 = %d\n"  ,(320 + 258));
		System.out.printf("320 - 258 = %d\n" , (320 - 258));
		System.out.printf("320 * 258 = %d\n" , (320 * 258));
		System.out.printf("320 * 258 = %d\n" , (320 / 258)); // 1
		System.out.printf("320 / 258 = %.2f\n" , (320.0 / 258)); // 1.24 , 실수 / 정수 = 실수 
		System.out.println("320 / 258 = " + String.format("%.2f",320.0/258)); // 1.24
	}
}
