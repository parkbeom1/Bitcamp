package switch_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("월 입력  : ");
		int month = Integer.parseInt(br.readLine());	
		/*
		 * int days = 0; if(month == 1) days = 31; else if(month == 2) days = 28;
		 */
		int days = 0;
		switch(month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
		case 2 : days = 28; break;
		case 4 : case 6: case 9: case 11: days = 30; // 마지막 break는 스스로 나간다. 
		}
		System.out.println(month +"월은"+days+"입니다.");
	}
}
/*월 입력 : 3
3월은 31일 입니다.
월 입력 : 2
2월은 28일 입니다.*/