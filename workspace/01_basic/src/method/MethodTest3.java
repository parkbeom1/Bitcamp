package method;

import java.text.DecimalFormat;
import java.util.Random;

public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("최대값 = " + Math.max(25,36)); // max를 누구꺼인지 명시해줘야한다.
														// static 에 있는 Math를 명시해야한다.
		int a = (int)(Math.random()*100); // 0 ~ 99 ,
		System.out.println(a);
		int b = (int)(Math.random()*100) + 1; // 1 ~ 100 ,
		int c = (int)(Math.random()*26) + 65; // 65 ~ 90
		System.out.println( " 65 ~ 90 : " + c);
		System.out.println((char)c);
		
		System.out.println(" 문자열을 정수로 변환 ");
		
		Random r = new Random(); // Random클래스의 메소드는 static이 아니어서 클래스를 생성해서 써야한다. 
			
		System.out.println("import 해서 가져온  Random 으로  : " + r.nextDouble());
		
		
		System.out.println("문자열을 정수로 변환 = " + Integer.parseInt("25")); // 문자열을 숫자로 바꿔라
		System.out.println("문자열을 실수로 변환 = " + Double.parseDouble("25.6"));
			
		DecimalFormat df = new DecimalFormat("#,###"); // 현재 숫자의 3자리씩 끊음
		System.out.println("3자리 마다  , 를 출력 = " + df.format(1234567));
	}
}

/*
random(난수) - 
- 컴퓨터가 불규칙하게 발생하는 수 
- 0.0 <= 난수 < 1.0  double 소수점나옴   x 10 할수록 점이 앞으로   정수만 출력하려면 (int)로 형변환 한다.
- x 에서 y사이의 난수 발생 
	(int)(Math.random()* y-x+1)) + x;

*/