package basic;

public class Operator {

	public static void main(String[] args) {
		int a = 5;
		a += 2; // a = a + 2
		a *= 3; // a = a x 3
		System.out.println("a = " + a);		
		++a;
		System.out.println("a = " + a);	
		
		
		
//		int b = a++; // 22
//		1. int b = a;   1. a++;
//		2. a++;			2. int b = a;
//						int b = ++a;					
//		System.out.println("a = " + a + " b = " + b);
		
		int b = a++;
		System.out.println("a = " + a + " b = " + b); // a=23 b=22
		
		int c = ++a;
		System.out.println("a = " + a + " c = " + c); // a=24 c=24
		
		int d = ++a - b--;
		System.out.println("a = " + a + " b = " + b + " d = " + d);
		// 1. ++a;
		// 2. int d = a - b;
		// 3. b--;
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
		int f = 0xa + a + 3;   // 13+ a(26) = 39
		System.out.println(f); // 
	}
}
/*
 * 돼지저금통 -> a a = 5; a에 5에다가 3을 더해서 a에 더한다. a = a + 3; ---> a += 3; a = a * 2;
 * ---> a *= 2; a = a / 3; ---> a /= 3;
 * 					  선행(연산자가앞에)             후행(연산자가뒤에)
 * a = a + 1; a += 1; ++a  또는   					a++
 * a = a - 1  a -= 1; --a  또는   					a--
 * 			이항연산자    , 단항연산자
 * 
 * 연산자 우선순위
 * ()
 * ++,--
 * 2+3*5
 * (2+3)*5
 * 
 * 
 */














