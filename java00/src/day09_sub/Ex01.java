package day09_sub;


/*
  	문제 1]
  		
  		반복문을 사용해서 출력해주세요.
  		
  		2 3 4 5 6
  		3 4 5 6 7
  		4 5 6 7 8
  		5 6 7 8 9
  		6 7 8 9 10
  		
 */
public class Ex01 {

	public static void main(String[] args) {
		for(int i=2; i<7; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+j+" ");	
			}
			System.out.println();
		}

	}

}
