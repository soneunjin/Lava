package day03;
import java.util.*;
/*
  	문제 3]
  		부서번호를 입력하면
  		부서이름을 출력해주는 프로그램을 작성하세요.
  		
  			10 - 총무부
  			20 - 회계부
  			30 - 영업부
  			40 - 기술부
  			나머지 - 다음기회에....
 */
public class Ex04 {

	public Ex04() {
		solv();
	}
	public void solv() {
		System.out.println("부서번호 10 , 20 , 30 , 40  궁금하면 입력해봐요");
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호를 입력해주세요 : ");
		int num = sc.nextInt();
		String result;
		if(num == 10) {
			result = "총무부";
		} else if(num == 20) {
			result = "회계부";
		} else if(num == 30) {
			result = "영업부";
		} else if(num == 40) {
			result = "기술부";
		} else {
			result = "다음기회에";
		}
		
		System.out.println(result);
		
		
	}
	public static void main(String[] args) {
			new Ex04();

	}

}
