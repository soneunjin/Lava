package day03;
import java.util.*;
/*
   	문제 2]
   		전기 요금을 계산하는 프로그램을 작성하세요.
   				코드		기본요금	사용요금
   		가정용	(1)		3800	245
   		산업용	(2)		2400	157
   		교육용	(3)		2900	169
   		상업용	(4)		3200	174
   		
   		전기요금 = 기본요금 + 사용량 * 사용요금
   		
   		사용자코드와 사용량을 입력받아서
   		전기요금을 계산해주는 프로그램을 작성하세요.
   		
   		
 */
public class Ex03 {

	
	public Ex03() {
		solv();
	}
	public void solv() {
		System.out.println("사용자 코드 1. 가정용 2. 산업용 3. 교육용 4. 상업용");
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자코드를 입력하세요 : ");
		int code = sc.nextInt();
		System.out.print("사용량을 입력하세요 : ");
		int sa = sc.nextInt();
		int result = 0;
		if(code == 1) {
			result = 3800 +(sa*245);
		} else if(code == 2) {
			result = 2400 +(sa*157);
		} else if(code == 3) {
			result = 2900 +(sa*169);
		} else if(code == 4) {
			result = 3200 +(sa*174);
		} 
		System.out.println("전기세 : "+ result + "원");
		

	}
	public static void main(String[] args) {
		new Ex03();

	}

}
