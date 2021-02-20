package if_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExam {
	public static void main(String[] args) throws NumberFormatException, IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one =0 , two = 0 , three = 0 ;	
		System.out.print("a : ");
		int a = Integer.parseInt(br.readLine());	
		System.out.print("b : ");
		int b = Integer.parseInt(br.readLine());	
		System.out.print("c : ");
		int c = Integer.parseInt(br.readLine());	
		
		if(a > b && a > c) {
			if(b > c) {
				one = a;
				two = b;
				three = c;
			} else if( c > b ) {
				one = a;
				two = c;
				three = b;
			}
		} else if( b > a && b > c) {
			if(c > a) {
				one = b;
				two = c;
				three = a;	
			} else if(a > c) {
				one = b;
				two = a;
				three = c;
			}
		} else if( c > a && c > b) {
			if(b > a) {
				one = c;
				two = b;
				three = a;
			} else if(a > b) {
				one = c;
				two = a;
				three = b;
			}
		}
		System.out.println(three + " " + two + " " + one );
	}
}
