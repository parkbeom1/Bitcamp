package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExam풀이해줌 {
	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int a, b, c;
	      
	      System.out.print("첫번째 입력 : ");
	      a = Integer.parseInt(br.readLine());
	      System.out.print("두번째 입력 : ");
	      b = Integer.parseInt(br.readLine());
	      System.out.print("세번째 입력 : ");
	      c = Integer.parseInt(br.readLine());

	      if(a<b && a<c) { //a가 제일 작을 때
	         if(b<c) System.out.println(a +", "+b+", "+c);
	         else System.out.println(a +", "+c+", "+b);
	         
	      }else if(b<c) { // b가 제일 작을 때
	         if(a<c) System.out.println(b +", "+a+", "+c);
	         else System.out.println(b +", "+c+", "+a);
	         
	      }else { //c가 제일 작을 때
	         if(a<b) System.out.println(c +", "+a+", "+b);
	         else System.out.println(c +", "+b+", "+a);         
	      }
	   }
	}
