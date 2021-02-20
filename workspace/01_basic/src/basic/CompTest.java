package basic;

public class CompTest {
	public static void main(String[] args) {
		int a = 25 , b = 36;		
		int max = a >= b ? a : b; 
		int min = a < b ? a : b;
		System.out.println("큰 값 = " + max);
		System.out.println("작은 값 = " + min);
	}
}
