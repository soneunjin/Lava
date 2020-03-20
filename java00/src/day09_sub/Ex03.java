package day09_sub;
/*
  	¹®Á¦ 3]
  		
  		1 2 99 4 5
  		2 99 4 5 99
  		99 4 5 99 7
 */
public class Ex03 {

	public static void main(String[] args) {
		
		for(int i=1; i<4;i++) {
			for(int j=0; j<5; j++) {
					if(i+j == 3 || i+j == 6) {
						int a = i+j;
						a = 99;
						System.out.print(a+" ");
						continue;
					} 
					System.out.print(i+j+" ");
					
			}
			System.out.println();
		}

	}

}
