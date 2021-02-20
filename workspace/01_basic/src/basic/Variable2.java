package basic;

public class Variable2 {
	int a; // 클래스는 변수선언이 가능하다 . 필드 , 인스턴스 변수 , 자동으로  초기화  , a를 쓰려면 클래스를 생성해서 메모리에 잡아놔야한다. 
	// 지역 변수와 전역변수 이름이 같아도 에러가 안걸린다.
	static int b; // 필드 , 클래스변수 , 자동으로 초기화  , static 은 무조건 메모리에 잡혀서 static끼리는 잡힌다.
	
	public static void main(String[] args) { 			
		
		Variable2 v = new Variable2();
		
		int a = 10; // local variable(로컬 변수, 지역 변수), grabage (쓰레기)
	
		System.out.println("local a = " + a);
		System.out.println("필드 a = " + new Variable2().a); // 클래스를 생성하고 a를 찍어준다.
		System.out.println("필드 b = " + b); // 자기구역의 b가 없어서 클래스쪽의 b를 출력한다. 	
	}
}
// 모든 변수는 반드시 메모리에 생성해야 한다. 
