package day15;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		
		for(int i=0; i<3; i++) {
			int rnd = rand1.nextInt(100);	// 0 ~ 100 ������ ������ �߻��ض�...
			boolean bRnd = rand1.nextBoolean();
			System.out.println("rnd : " + rnd + ",bRnd : " + bRnd);
			
			
		}
		
		Random r1 = new Random(10);
		for(int i=0; i<3; i++) {
			int rnd = r1.nextInt(100);	// 0 ~ 100 ������ ������ �߻��ض�...
			boolean bRnd = r1.nextBoolean();
			System.out.println("rnd : " + rnd + ",bRnd : " + bRnd);
			
			
		}
	}

}
