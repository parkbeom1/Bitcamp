package for_;
public class ForTest3 {
	public static void main(String[] args) {
		int num;
		int count=0;
		for(int i = 1; i < 101; i++) {
			num = (int)(Math.random()*26)+65; // 65 ~ 90 , 90 - 65 = 25인데 +1를 해준다. 	
								// 0.9999999 X 25 + 1
			System.out.print((char)num + " ");
				if(i % 10 == 0 ) { // 10줄씩 
					System.out.println(" ");
				}
				if(num == 'A') {
					count++;
				}
			}
		System.out.println();
		System.out.println("총  A 개수는 = " + count);
		}
	}
/*
 65~90 사이의 난수 ( A ~ Z ) 를 100개 발생하여 출력 하시오 
 [실행결과]
 D A K J O I K A  100개가 나온다. 
 + 한줄에 10개씩 나오게 하기 
*/