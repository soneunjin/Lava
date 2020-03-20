package day09_sub;

/*
  	1 2 3 4 10
  	3 4 5 6 18
  	5 6 7 8 26
  	
 */
public class Ex04 {

	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			int sum = 0;
			for(int j=0; j<5; j++) {
				int num = (i*2-1)+j;
				if(j == 4) {
					num = sum; 
				
				}else {
					sum = sum+num;
				} 
				System.out.print(num);
			}
			System.out.println();
		}

	}

}
