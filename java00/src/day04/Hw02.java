package day04;
import java.util.*;
/*
  	두 수를 입력받은 후
  	두 수의 최소 공배수를 구해서 출력해주는 프로그램을 작성하세요.
  	
  	 최소 공배수 : 두 수로 나누어 떨어지는 가장 작은 수
  	 
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		Scanner sa = new Scanner(System.in);
		int no2 = sa.nextInt();
		
		if(no2 > no1) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
	
		for(int i = no2; i>0; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				int result = no1 * no2 /i;
					System.out.println(no1 + "와" + no2 +"의 최소 공배수는"+ result +"이다.");
					break;
			}
		 }
		}

}

}