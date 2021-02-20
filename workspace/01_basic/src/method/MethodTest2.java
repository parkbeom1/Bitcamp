package method;
public class MethodTest2 {
	public static void main(String[] args) {
		MethodTest2 m = new MethodTest2();
		int a = 320;
		int b = 258;
		System.out.println("합 = " + m.sum(a, b));
		System.out.println("차 = " + m.min(a, b));
		System.out.println("곱 = " + m.mul(a, b));
		System.out.println("몫 = " + m.div(a, b));	
	}
	public int sum(int a,int b) {
		return a + b;
	}
	public int min(int a,int b) {
		return a - b;
	}
	public int mul(int a,int b) {
		return a * b;
	}
	public String div(int a,int b) { // 실수형으로 출력하고 싶으면 데이터타입을 double로 바꾸면 된다. 
			double result = (double)a / b;
			return String.format("%.2f", result);
			// String.format("%.2f", result); 를 주면 return은 String으로 줘야한다. 
		}
	}
