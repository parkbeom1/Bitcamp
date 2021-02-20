package basic;

public class CompTest2 {
	public static void main(String[] args) {
		int num = 25;
//		System.out.println(num % 2 == 0 ? "짝수이다" : "짝수가아니다");
		String result = ((num % 2 == 0 ) ? "짝수이다." : "홀수이다.");
		// "" 문자열은 String으로 받는다. 
		System.out.println(result);
	}
}
