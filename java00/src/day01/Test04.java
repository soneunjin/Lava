package day01;

/**
 * 	Ŭ������ ������ ��� �ּ�. �� �κп� Ŭ������ ������ �ۼ�
 	@author ������
 	@since	2020.03.09 (�ۼ��� �����ϴ� �κ�)
 	@version v.1.0	   (�ش� Ŭ������ ������ �����ϴ� �κ�)
 	@see 			   (�����ؾ��� Ŭ�������� �����ϴ� �κ�)
 	
 			�����̷�
 				2020.03.09 -	Ŭ��������		- ����� : ������
 
 */

public class Test04 {
	public static void main(String [] args) {
		/*
		 	java �� �ּ�ó��
		 		1. // - �� �࿡ ���ؼ� �ּ�ó�� �ϴ� ���.
		 				// ������ ������ �ּ����� ó���Ѵ�.
		 		
		 		2. /*  <== �������� �ּ�ó�� �ϴ� ���, ��ȣ ������ ������ ��� �ּ�ó���� �ȴ�.
		 		   */
		/*
		  	����������
		  		++, --
		  		: ������ �ٿ����� �ٿ��� ������ ���� 1�Ǵ� -1���ش�.
		  			��ȣ ���Ŀ� ó�������� ������ ���ؼ� �ѹ���
		  
		 */
		
		int no1 = 10;
		int no2 = no1++ + ++no1;
		
		System.out.println("no2 : " + no2);
		
		/*
		  	���ڿ��� �������ִ� �����ڴ�  + �� ó���� �Ѵ�. 
		 */
		
		int num1 = 10;
		int num2 = ++num1 + num1++;
		int num3 = num1++ + 15;
		System.out.println("num2 : " + num2);
		
		
	}
}