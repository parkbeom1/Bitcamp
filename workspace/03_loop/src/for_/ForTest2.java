package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("단을 입력 하세요  : ");
		int dan = br.read() - 48; // 1개 문자 우리는 문자로 받아버렸다....그래서 원래의 숫자로 가려면  -48를 하면 된다.
		// int dan = br.read() - '0';// 1개문자  rand는 문자로 받아버려서 
			for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + "=" + dan * j );
			}
		}
	}
// 원하는 단을 입력 : 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 9 = 18