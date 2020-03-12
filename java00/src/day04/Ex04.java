package day04;
import java.util.*;
/*
  	문제 4]
  		5자리 정수를 입력받아서
  		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
  		
  		회문수란?
  			앞에서 읽으나 뒤에서 읽으나 똑같은 수를 회문수라 한다.
  			예]
  				12321 - 회문수
  		참고]
  			문자열.charAt(위치값) - 문자열의 특정위치의 문자를 반환해주는 함수
  			문자열.toCharArray() - 문자열을 문자배열로 반환해주는 함수
  			
  		반복문 제어 명령]
  		
  			1. break 	- 반복문 또는 switch 문은 종료시키는 명령
  			
  			2. continue - 반복문을 다시 진행시키는 명령
  				
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 정수를 입력하세요 : ");
		
		String result = "회문수";
		String no = sc.nextLine();
			for(int i =0; i<no.length() /2; i++) {
				if(no.charAt(i) == no.charAt((no.length() -1) - i)) {
					continue;
					
				}
				result = "회문수가 아님";
				break;
			}
			System.out.println(result);

	}

}
