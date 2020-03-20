package day10;

import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		int[][] gion = new int[5][2];
		
		for(int i=0; i<gion.length; i++) {
			for(int j=0; j<gion[i].length;j++) {
				int random = (int)(Math.random()*(61))-20;
				gion[i][0] = random;
				gion[i][j] = i+1;
			
		}
		
	}
		for(int[] g : gion) {
			System.out.println(Arrays.toString(g));
		}
		System.out.println();
		for(int i=0; i<gion.length -1; i++) {
			
			for(int j=i+1; j<gion.length; j++) {
				if(gion[i][0] > gion[j][0]) {
					int[] tmp = gion[i];
					gion[i] = gion[j];
					gion[j] = tmp;
					
				}
			}
		}
		
		for(int i=0; i<gion.length;i++) {
			gion[i][1] = i+1;
		}
		
		for(int[] g : gion) {
			System.out.println(Arrays.toString(g));
		}
		
		
  }

}
