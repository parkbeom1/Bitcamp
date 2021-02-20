package for_;
public class ForTest {
	public static void main(String[] args) {
		int i = 0 ;
		for(i = 1; i <= 10; i++) {
			System.out.println("Hello Java " + i ); // 반복을 통해 한번문장 을 10번찍힌다. 
		}
		System.out.println("탈출 i = " + i);
		System.out.println();	
		// 10 9 8 7 6 5 4 3 2 1
		for(i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}		
		System.out.println();	
		// A B C D E F G .... X  Y Z	
		for(i = 'A'; i <= 'Z'; i++ ) { // for(i = 'A'; i <= 'Z'; i++ ); 하면 다돌고 [ 하나만 찍힌다. 
			System.out.print((char)i + " "); 
		}
			System.out.println("");
		for(i = 'a'; i <= 'z'; i++ ) {
			System.out.print((char)i + " ");
		}
	}
}
