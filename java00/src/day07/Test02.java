package day07;

import java.util.Arrays;

/*
       ���� ����
       : �����͸� �����ϴ� ���
       
       
 */
import javax.swing.*;
public class Test02 {

	public Test02() {
//		exec1();
		exec2();
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void exec1() {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] num2 = new int[20];
		
		// num1�� 6��°���� 10��° �����͸� �����ؼ� num2�� �����Ѵ�.
		System.arraycopy(num1,5,num2,10,5);
		
		// ���簡 �� ���Ŀ� num1[7] �� 77�� ����������.
		num1[7] = 77;
		
		// �� �迭�� ������ ���ڿ��� ���� ������ ����ּ���.
		String msg ="num1\t: " + Arrays.toString(num1) +
					"\nnum2\t: " + Arrays.toString(num2);
		
		
		JOptionPane.showMessageDialog(null,msg);

	}
	

	public void exec2() {
		
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] num2 = new int[20];
		
		// num1[5] ~ num1[9] �� �����ؼ� num2[]�� 11��°���� 15���� ���� ä����������...
		
		for(int i=0;i<5;i++) {
			num2[10 + i] = num1[5 + i];
		}
		
		// ���簡 �� ���Ŀ� num1[7] �� 77�� ����������.
				num1[7] = 77;
				
		// �� �迭�� ������ ���ڿ��� ���� ������ ����ּ���.
				String msg ="num1: " + Arrays.toString(num1) +
							"\nnum2: " + Arrays.toString(num2);
				
				
				JOptionPane.showMessageDialog(null,msg);

		
	}

}
