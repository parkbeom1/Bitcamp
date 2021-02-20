package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*이름(name), 국어(kor), 영어(eng), 수학점수(math)를 입력하여 총점(tot)과 평균(avg)  학점(grade)을 구하시오
총점 = 국어 + 영어 + 수학
평균 = 총점 / 3
[실행결과]
이름 입력 : 홍길동
국어 점수 입력 : 98
영어 점수 입력 : 75
수학 점수 입력 : 82

학점(grade) = 	평균이 90이상이면 "A" 학점으로 들어간다. 
	  			평균이  80이상이면 "B"
	 			평균이 70이상이면  "C"
	 			평균이 60이상이면  "D"
	 			그 외는 "F" 			
   *** 홍길동 성적 ***
이름       국어      영어      수학       총점        평균
홍길동     98    75    82   xxx   xx.xxx
*/
public class SunJuk {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String grade = ""; // String은  "" = Null 로 초기화 시켜줌
		System.out.print("이름 입력 :");
		String name = bf.readLine();
		System.out.print("국어점수 입력 : ");
		// readLine() String 반환 이라  int 로  받을수있게  형변환  한다.
		int kor = Integer.parseInt(bf.readLine());
		System.out.print("영어점수 입력 : ");
		int eng = Integer.parseInt(bf.readLine());
		System.out.print("수학점수 입력 : ");
		int math = Integer.parseInt(bf.readLine());
//		a = Integer.parseInt(br.readLine());
		int tot = kor + eng + math;
		float avg = (float)tot / 3;	
//		if (avg >= 90)
//			grade = "A";
//		else if (avg >= 80 && avg <= 89) // else if(avg >= 80) 만 적어도 된다. 어자피 위에 것이 거짓이니까
//			grade = "B";
//		else if (avg >= 70 && avg <= 79)
//			grade = "C";
//		else if (avg >= 80 && avg <= 69)
//			grade = "D";
//		else
//			grade = "F";	
		switch((int)avg / 10) {  // 범위가크면  90점대  80점대  70점대  60점대  50점대   십의자리로 값을 찾으면 된다.
								 // 올백이 나오면 300 / 10 하면 30이 나오니가.case 10  올백 준다 주면 된다. 
		  case 10:
			  grade = "A+";break;
		  case 9 :
			  grade = "A"; break;
		  case 8 : 
			  grade = "B"; break;
		  case 7 : 
			  grade = "C"; break;
		  case 6 : 
			  grade = "D"; break;
		  default :
			  grade = "F";
		}	
		// ctrl + shift + f  자동정렬 해준다. 
		System.out.println("***" + name +" 성적 ***\t");
//		System.out.println("이름   국어   영어  수학  총점  평균   \t");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
//		System.out.println(name +" "+ kor+"  "+eng+" "+math+" "+tot+" "+avg);
		System.out.println(
							kor+"\t"
							+eng+"\t"
							+math+"\t"
							+tot+"\t"								
						+String.format("%.3f", avg) +"\t"+grade);
					}
				}
