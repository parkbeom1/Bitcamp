package org.opentotorials.javatutorials.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		
		String[] members = {"최진혁","최유빈","한이람"};
		String member = "";
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
			member += members[i];	
		}
		System.out.println(member  + "상담을 받았습니다.");
	}
}
