package method;

public class Variable2 {
	int a; // 클래스는 변수선언이 가능하다 . 필드 , 인스턴스 변수 , 자동으로  초기화  , a를 쓰려면 클래스를 생성해서 메모리에 잡아놔야한다. 
	// 지역 변수와 전역변수 이름이 같아도 에러가 안걸린다.
	static int b; // 필드 , 클래스변수 , 자동으로 초기화  , static 은 무조건 메모리에 잡혀서 static끼리는 잡힌다.
	String c;
	public static void main(String[] args) { 			
		
		int a = 10; // local variable(로컬 변수, 지역 변수), grabage (쓰레기)
	
		System.out.println("local a = " + a);
		System.out.println("필드 a = " + new Variable2().a); // 클래스를 생성하고 a를 찍어준다.
		System.out.println("필드 b = " + b); // 자기구역의 b가 없어서 클래스쪽의 b를 출력한다. 	
		
		System.out.println("필드 c = " +  new Variable2().c); // String은 초기값  Null로 생성
		//---------------------------------------------------------------------------
		// Variable2 v; 객체형변수
		Variable2 v; // 객체를 만들고 
		v = new Variable2(); // 집어넣는것이다. 
		System.out.println("객체  v = " + v); // 패키지명.클래스이름@16진수   16진수로 나에게 메모리 주소값을 준다.(실제 메모리주소가아니다)
		System.out.println("필드 a = " + v.a);
		System.out.println("필드 c = " +  v.c);
	}
}
// 상대주소 
//모든 변수는 반드시 메모리에 생성해야 한다. 
// 서울 특별시 서초구 강남대로 459 백암빌딩 
// 신논현역 9번출구 교보문고 뒤 
