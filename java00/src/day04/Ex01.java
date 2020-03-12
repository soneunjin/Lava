package day04;
import java.util.*;
/*
  	4자리 숫자로된 년도를 입력받아서
  	윤년인지 평년인지 판단해서 출력하세요.
  	단, switch ~ case 구문으로 처리하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("4자리 년도를 입력하세요 : ");
		int year = sc.nextInt();
		String str = "평년";
		int code = 0;
	/*	if(year % 400 == 0) {
			code = 3;
		} else if (year % 100 == 0) {
			code = 2;
		} else if (year % 4 == 0) {
			code = 1;
		}
	*/	
		/*switch(code) {
		case 3:
			str = "윤년";
			break;
		case 2:
			break;
		case 1:
			str = "윤년";
			break;
		default:
		}
	*/
		/*
		switch(year % 400) {	
		case 0:
			str = "윤년";
			break;
		default:
		switch(year % 100) {
		case 0:
			break;
		default:
			str = "윤년";
		switch(year % 4) {
		case 0:
			str = "윤년";
			break;
		default:
			
		}
			
		
		}
		
			
	}
*/		
		
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			code = 1;
		}
		switch(code) {
		case 1:
			str ="윤년";
			break;
		default:
			
		}
			
		
		System.out.println("해당 년도는 [ " + str + " ] 입니다.");
	}
}
