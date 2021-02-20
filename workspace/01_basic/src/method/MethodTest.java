package method;
public class MethodTest {
	// 메소드() { 안에 메소드    X 	
	//	public  : 전체 공개한사람만 접근 
	//	private : 내가 허용한 사람만 접근
	public static void main(String[] args) { // 구현  , JVM이 main밖에 모르니까 여기서 disp()를 호출하고나서 main 제자리로 돌아온다.  
		MethodTest m; // 객체 선언 
		m =	new MethodTest(); // 객체생성 , m으로 메모리 주소가 넘어간다 
		// 호출
		disp(); // 호출  , 호출되서 처리하고 돌아온다.
		m.output(); // 호출 , 	
		System.out.println("최대값 = " + max(25,36));  // 함수가 입력이 되서 호출되고 제자리로 돌아온다.
		System.out.println("최소값 = " + m.min(25,36));
	}
	public static int max(int a, int b) {
		return  a >= b ? a : b;
	}
	public int min(int a , int b) {
		return a < b ? a : b;	
	}
	public static void disp() {  // static은메모리에 자동생성됨 JVM 에게 메모리를 만들라고 시킴 , 근데 하지만 JVM은 main밖에 모른다.							 // 구현 
		System.out.println("안녕하세요.");	
	}
	public void output() { // static이 아니면  메모리를 생성해서 객체변수로 접근해야 한다. 
		System.out.println("반갑습니다.");
	}
}
