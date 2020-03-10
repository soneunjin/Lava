package day01;
import java.util.*;

public class Ex01 {
/*
 * 	1.	5, 10, 20을 제외한 숫자 하나를 가정하고 (양수, 음수 모두)
 * 		이것을 2진수로 바꿔보고
 * 		실제 프로그램의 결과와 일치하는지 확인하세요.
 * 
 *		바코드 확인 방법
 *			Integer.toBinaryString(숫자)
 * 
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 *  2.	반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
 *  		원의 둘레 : 2*반지름*3.14
 *  		원의 넓이 : 반지름 * 반지름 * 3.14
 *  		
 *  		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리를 하세요.
 *  		그리고 둘레는 float 타입의 변수로 만드세요.
 *  
 *  3.	두 개의 숫자(정수)를 변수에 담고
 *  	두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
 *  
 *  4.	3번 문제의 두 수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.
 *  
 *  5.	54232원을 지불해야한다.
 *  	우리나라의 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
 *  	5만원권 - 1장
 *  	1만원권 - 0장
 *  	5천원권 - 0장
 *  	1천원권 - 4장
 *  	1백원권 - 2장
 *  	1십원권 - 3장
 *  	1원권    - 2장
 *  
 *  숙제]
 *  	1년은 365.2426일이다.
 *  	이 날짜는 과연 몇일 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
 *  
 */
	
	
	public static void main(String [] args) {
		
		// 1번
		System.out.println("숫자 11은 이진수 : " + Integer.toBinaryString(11) + "입니다." );
		
		// 2번
		int ars = 7;
		double arr = 3.14;
		System.out.println("원의 둘레는 : " + 2*(float) ars* (float) arr + "입니다.");
		System.out.println("원의 넓이는 : " + ars*ars*arr + "입니다.");
		
		int garo = 3;
		int saro = 4;
		System.out.println( "사각형의 넓이는 :" + garo * saro + "입니다.");
		
		System.out.println( "삼각형의 넓이는 : " + (garo*saro)/2 + "입니다.");
		
		System.out.println("지불할 가격을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int a , b , c , d , e , f , g, h, i ;
		a = money / 50000;
		money %= 50000;
		b = money / 10000;
		money %= 10000;
		c = money / 5000;
		money %= 5000;
		d = money / 1000;
		money %= 1000;
		e = money / 500;
		money %= 500;
		f = money / 100;
		money %= 100;
		g = money / 50;
		money %= 50;
		h = money / 10;
		money %= 10;
		i = money / 1;
		
		
		System.out.println("입력한 5만원권은  : " + a + " 입니다.");
		System.out.println("입력한 1만원권은 : " + b + " 입니다.");
		System.out.println("입력한 5천원권은 : " + c + " 입니다.");
		System.out.println("입력한 1천원권은 : " + d + " 입니다.");
		System.out.println("입력한 5백원권은 : " + e + " 입니다.");
		System.out.println("입력한 1백원권은 : " + f + "입니다.");
		System.out.println("입력한 5십원권은 : " + g + "입니다.");
		System.out.println("입력한 1십원권은 : " + h + "입니다.");
		System.out.println("입력한 1원권은 : " + i + "입니다.");

		
		/*숙제]
				 *  	1년은 365.2426일이다.
				 *  	이 날짜는 과연 몇일 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
		*/
			double year = 365.2426;
			int sec = (int)((year % 1) * 86400) ;
			int dd = (int) year;
			int hh =  sec / 3600;
			sec %= 3600;//1시간
			int mm = sec / 60; // 1분
			sec %= 60;
			int ss = sec; // 1초
			
			System.out.println("몇일 : " + dd);
			System.out.println("몇시간 : " + hh);
			System.out.println("몇분 : " + mm);
			System.out.println("몇초 : " + ss);
		
	}
}
