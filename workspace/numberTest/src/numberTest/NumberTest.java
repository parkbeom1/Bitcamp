package numberTest;

public class NumberTest {
	public static void main(String[] args) {
		
		System.out.println('A' + 3); // 68
		System.out.println("A" + 3); // A3
		System.out.println("A" + 'b'); // Ab
		System.out.println('A' + 'A'); // 130
		System.out.println((char)('A' + 32));
		System.out.println(2 + 3); // 
		System.out.println('2' + '3'); // 50 + 51 =  101
		System.out.println("2" + "3"); // 23
		System.out.println((char)('2' + '3')); // 101 -> e
		System.out.println("2"+"3");
		System.out.println(('2'-48) + ('3' - 48)); // 2 + 3 = 5
		System.out.println(Integer.parseInt("2") + Double.parseDouble("2.3"));
	}
}
