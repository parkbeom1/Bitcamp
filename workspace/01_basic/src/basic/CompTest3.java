package basic;

public class CompTest3 {
	public static void main(String[] args) {
		int score = 24;
		String result = score >= 80 && score <= 100 ? "합격" : "불합격";
		System.out.println("결과 = " + result);
		System.out.println();
		// 2와 3의 공배수 (공통인 배수)
		String result2 = (score % 2 == 0) && (score % 3 == 0) ? "공배수" : "공배수가 아니다";
		System.out.println("결과 = " + result2);
	}
}
