package day02;
import java.util.*;
public class Ex01 {
/*
 	문제 1]
  	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 랜덤하게 만든 후
  	백자리 이하를 버린 숫자를 만들어서 출력하세요.
  		예]
  			456 --> 400
  			
  	문제 2]
  		0 ~ 255 사이의 숫자를 랜덤하게 만들고
  		그 숫자를 코드값으로 하는 문자를 만들어서
  		해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
  		단, 삼항 연산자를 사용해서 처리하세요.
  		
  	문제 3]
  		화씨(Fahrenheit) 온도 100도는
  		섭씨(Celcius) 온도 몇도인지 알아보는 프로그램을 작성하세요.
  		
  		공식]
  			섭씨온도 = 5 / 9 X (화씨온도 - 32)
  			
  	문제 4]
  		소수점이 있는 숫자를 입력한 후
  		소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
  		
  		원리]
  			+0.005 을 하면 세째자리에서 변환이 일어날 것이고
  			여기에 x100 해주면 두째까지 정수부에 들어갈 것이고
  			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고
  			다시 / 100 으로 해주면 원 소수점 형태로 변환될 것이다.
  	
  	문제 5]
  		랜덤한 숫자 10 ~ 99 사이의 숫자를 발생시킨 후
  		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
  		
  		 예]
  		 	45 는 50 과의 차가 5가 난다.
  		 	
  		 	53은 50 과의 차가 3이 난다.
  		 	
  	문제 6]
  		임의의 년도를 입력받아서
  		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
  		
  		단, 삼항연산자를 사용해서 처리하세요.
  		
  		윤년의 정의]
  			4로 나눠 떨어지고 100으로 나눠 떨어지지 않으며
  			400으로 나눠 떨어지는 해를 윤년이라 한다.
  		
  		
 */
	// 기본 생성자 함수 정의
	public Ex01() {
		sol01();
		sol02();
		sol03();
		sol04();
		sol05();
		sol06();
	}
	
	public void sol01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3자리숫자 를 입력하세요 : ");
		int no1 = sc.nextInt();
		
		int no2 = (int)(Math.random()*999)+1;
		int result = (no1/100) * 100;
		System.out.println(result);
		System.out.println("랜덤한 숫자 : " + no2);
		int result2 = (no2/100) * 100;
		System.out.println(result2);
	}
	
	public void sol02() {
		int code = (int)(Math.random()*(255-0+1)+0);
		char ch = (char) code;
		System.out.println(ch);
		String result = ((char) code >='A'& (char)code <= 'Z') ? ("영문자입니다.") :
									 ((char) code >= 'a' & (char) code <= 'z' ) ?
											 ("영문자입니다.") : ("영문자가 아닙니다.");
						
		System.out.println(result);
	}
	public void sol03() {
		int fe = 100;
		double ce = 5 / 9f *(fe - 32);
		System.out.println("화씨 fe는 :" + ce +" 입니다.");
		
	}
	
	public void sol04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자를 입력하세요 : ");
		double sosu = sc.nextDouble();
		double result = (sosu + 0.005)*100;
		int result1 = (int) result;
		double result2 = (double) result1/100;
		System.out.println("소수점 세째자리 반올림한 수 : " + result2);
		
	}
	
	public void sol05() {
		int no1 = (int)(Math.random()* (99-10+1))+10;
		int result =  (no1+5) /10 * 10 ;
		int result1 =  (int) result;
		int result2 = result - no1;
		System.out.println("no1 은 : "+ no1+"과"+result+" 의차이는"+Math.abs(result2)+"납니다.");
		
	}
	
	public void sol06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 년도를 입력하세요 : ");
		int no1 = sc.nextInt();
		String result = (no1 % 4 == 0 && no1 % 100 !=0 || no1%400 == 0) ? ("윤년입니다.") : ("평년입니다.");
		System.out.println("해당년도 "+no1+" 은 "+result);
		
	}
	public static void main(String[] args) {
		new Ex01();
		

	}

}
