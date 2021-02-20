package pyramid;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {	
		for(int i=0; i<4; i++){ //4줄 생성 
            for(int j=0; j<3-i; j++){ //삼각형 별을 출력하기 위해 공백 생성  
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력 
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
