package basic;

public class Variable {
	public static void main(String[] args) {
//		메모리 - 호텔
//		메모리 변수 생성 - 호텔 방 생성
		
//		25>36 - 거짓(false) 가 들어갈수있도록 방을 만들어준다.
		
		boolean a;
		a = 26 > 32; // =은 대입연산자 오른쪽 값을 왼쪽에 대입한다.
					 // a에는 false 0이 들어간다.
		System.out.println("a = " + a); // false 
		
		char b = 'A';
		System.out.println("b = " + b); 
		
		char c = 65; // 문자는 컴퓨터는 숫자로 생각하고 있다.
		System.out.println("c = " + c); // 캐릭터 A 끌고온다.
		
		int d = 65;  // int 4바이트 32비트
		System.out.println("d = " + d);
		
		int e = 'A';
		System.out.println("e = " + e); // 65
		
//		byte f = 128; // byte 범위는 -128 ~ 127 , 정수의 기본 범위는 int로 본다.
		// - error ( 128 상수는 int형으로 인식)
//		System.out.println("f = " + f);
		
//	    float f = 45.8; // - error  45.8은 실수의 기본형 double형 으로 생각한다. 
//		float f = (float)45.8;  // double형 상수 
		float f = 45.8f; // float형 상수	
		System.out.println("f = " + f); // 45.8
		
		
	}	
}
