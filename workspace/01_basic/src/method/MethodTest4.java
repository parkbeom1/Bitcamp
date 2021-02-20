package method;

class Test {
	public static int a , b; // 두개의 필드
	public static void sum() {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	public void sub() {
		System.out.println(a + " - " + b + " = " + (a - b));
	}
}
public class MethodTest4 { // main이 없으면 public 이되는것이 주가 된다.
	public static void main(String[] args) {
//			Test.sum();   static이면 바로 불러올수있다.
			Test t = new Test();
			t.a = 10;
			t.b = 20;
			Test.sum();		
		}
	}




