package basic;
public class Money {
	/*
	 * 	금액 : 1234원
		천원 : 1장
		백원 : 2개
		십원 : 3개
		 원 : 4개
	 */
	public static void main(String[] args) {
		int money = 1234;
		int thousand = money / 1000; // 1장
		int hundred = (money % 1000) / 100; // 2개
		int ten = ((money % 1000) % 100) / 10;  // 3개
		int one = (((money % 1000) % 100) % 10); // 4개
		
		System.out.println("금액 : " + money + "원");
		System.out.println("천원 : " + thousand +"장");
		System.out.println("백원 : " + hundred +"개");
		System.out.println("십원 : " + ten +"개");
		System.out.println(" 원 : " + one +"개");
	}
}
