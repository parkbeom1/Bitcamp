package if_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IfTest2Exam {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 예외처리 - 자동차 보험 - try ~~ catch		
		System.out.print("첫번째 과목 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("첫번째 과목 점수 : ");
		int c = Integer.parseInt(br.readLine());
		int sum = a + b + c;
		int avg = sum / 3;
		if(avg>=60) {
			if(a<40 || b<40 || c<40) 
				System.out.println("과락으로 불합격");
			else 
				System.out.println("합격 ");
			} else {
				System.out.println("불합격");
			}
		}
	
	
	
	
	}
