package day04;


/*	(중첩된 반복문으로 처리)
  	2 ~ 100 사이의 수 중 소수만 출력해주는 프로그램을 작성하세요.
  	
  	소수 : 1과 자기자신으로만 나눌수 있는 수
  	
 */
public class Hw03 {

	public static void main(String[] args) {
		for(int i=2; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				if(i%j == 0) {
					break;
				
				}
			}
			System.out.println(i);
		}
		
	}

}
