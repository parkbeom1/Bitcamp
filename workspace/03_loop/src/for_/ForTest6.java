package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(br.readLine());
		String sum = " ";
		String str = " ";	
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i + " ";
				str = num + "는 소수가 아니다.";
			}else if(num % 2 != 0) {
				str = num + "소수이다.";
			}
		}
		System.out.println(sum);
		System.out.println(str);
	}
}
/*
 약수와 소수를 구하기
[실행결과]
숫자 입력 : 12    약수 조건  나눌때 나누어떨어지면 약수이다.  12의 약수는 1  2  3  4  6  12
1 2 3 4 6 12
12는 소수가 아니다.
숫자 입력 : 37
약수는 없어서 소수이다. 1과 자기자신만 떨어진다.
37는 소수이다.
*/