package for_;

public class ForTest4 {
//	int sum; // 필드는 자동으로 0으로 초기화 되지만 
	public static void main(String[] args) {
		int sum = 0; // 메소드에서는 0을 초기화하지않으면 쓰레기값을 갖는다.
		int mul = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i; // sum = sum + i ;
			mul *= i; 
		}
		System.out.println("총 합계  : " + sum);
		System.out.println("총 곱  : " + mul);
	}
}
