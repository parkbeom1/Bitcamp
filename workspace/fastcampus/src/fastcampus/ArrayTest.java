package fastcampus;

public class ArrayTest {

	public static void main(String[] args) {	
		// 배열에 1~10까지 수를 넣고  합을 출력해보기
		int[] arr = new int[10];
		int total = 0;
		int sum = 0;
		// 일단 각 배열에 숫자를 차례대로 넣는다.
		for (int i = 0, num = 1; i < arr.length; i++,num++) {
					arr[i] = num; // num 이 증가되면서 arr[i] 에 순서대로 들어간다.				
		}
		// 잘들어갔는지 확인해 본다.
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mtotal = 1;  // 5가 있는데 나머지 3개가있으면 다 곱하면 나머지 0 2개 때문에 다 곱셈의 결과는 0이된다. 
//		for (int i = 0; i < dArr.length; i++) {
//			mtotal *= dArr[i];
//		}
		
		// 그래서 방법은
		for (int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(mtotal);
	}
}

