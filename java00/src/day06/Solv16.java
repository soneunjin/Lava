package day06;

public class Solv16 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d",((j+1) + 5 * i) * (1-i % 2) + (i % 2)*((i+1) * 5 - j));
				
	
				
//				if(i%2 == 0) {
//					System.out.printf("%3d",i*5+j+1);
//		
//				} else {
//					System.out.printf("%3d",i*5+5-j);
//				}

			}
			System.out.println();
		}
		System.out.println();
	}

}
