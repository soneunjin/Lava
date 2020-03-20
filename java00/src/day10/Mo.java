package day10;

import java.util.Arrays;

public class Mo {
	int[] mo1;
	int sum;
	double average;
	
	public void setA() {
		mo1 = new int[10];
	
		for(int i=0; i<mo1.length;i++) {
			int no1 = (int)(Math.random()*100)+1;
			mo1[i] = no1;
			
			
		}
		
	}
	public void setB() {
		int total =0;
		for(int i=0; i<mo1.length;i++) {
			total += mo1[i];
			
		}
		sum = total;
	}
	
	public void setC() {
		average = sum/10;
	}
	
	public void toPrint() {
		System.out.println(Arrays.toString(mo1)+"\n"+ sum +"\n"+ average);
	}
}
