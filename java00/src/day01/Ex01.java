package day01;
import java.util.*;

public class Ex01 {
/*
 * 	1.	5, 10, 20�� ������ ���� �ϳ��� �����ϰ� (���, ���� ���)
 * 		�̰��� 2������ �ٲ㺸��
 * 		���� ���α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���.
 * 
 *		���ڵ� Ȯ�� ���
 *			Integer.toBinaryString(����)
 * 
 * 
 * ------------------------------------------------------------------------------------------------
 * 
 *  2.	�������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
 *  		���� �ѷ� : 2*������*3.14
 *  		���� ���� : ������ * ������ * 3.14
 *  		
 *  		��, ������, �ѷ�, ���̴� ������ ���� ó���� �ϼ���.
 *  		�׸��� �ѷ��� float Ÿ���� ������ ���弼��.
 *  
 *  3.	�� ���� ����(����)�� ������ ���
 *  	�� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
 *  
 *  4.	3�� ������ �� ���� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.
 *  
 *  5.	54232���� �����ؾ��Ѵ�.
 *  	�츮������ ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
 *  	5������ - 1��
 *  	1������ - 0��
 *  	5õ���� - 0��
 *  	1õ���� - 4��
 *  	1����� - 2��
 *  	1�ʿ��� - 3��
 *  	1����    - 2��
 *  
 *  ����]
 *  	1���� 365.2426���̴�.
 *  	�� ��¥�� ���� ���� ��ð�, ���, �������� ����ؼ� ����ϼ���.
 *  
 */
	
	
	public static void main(String [] args) {
		
		// 1��
		System.out.println("���� 11�� ������ : " + Integer.toBinaryString(11) + "�Դϴ�." );
		
		// 2��
		int ars = 7;
		double arr = 3.14;
		System.out.println("���� �ѷ��� : " + 2*(float) ars* (float) arr + "�Դϴ�.");
		System.out.println("���� ���̴� : " + ars*ars*arr + "�Դϴ�.");
		
		int garo = 3;
		int saro = 4;
		System.out.println( "�簢���� ���̴� :" + garo * saro + "�Դϴ�.");
		
		System.out.println( "�ﰢ���� ���̴� : " + (garo*saro)/2 + "�Դϴ�.");
		
		System.out.println("������ ������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int a , b , c , d , e , f , g, h, i ;
		a = money / 50000;
		money %= 50000;
		b = money / 10000;
		money %= 10000;
		c = money / 5000;
		money %= 5000;
		d = money / 1000;
		money %= 1000;
		e = money / 500;
		money %= 500;
		f = money / 100;
		money %= 100;
		g = money / 50;
		money %= 50;
		h = money / 10;
		money %= 10;
		i = money / 1;
		
		
		System.out.println("�Է��� 5��������  : " + a + " �Դϴ�.");
		System.out.println("�Է��� 1�������� : " + b + " �Դϴ�.");
		System.out.println("�Է��� 5õ������ : " + c + " �Դϴ�.");
		System.out.println("�Է��� 1õ������ : " + d + " �Դϴ�.");
		System.out.println("�Է��� 5������� : " + e + " �Դϴ�.");
		System.out.println("�Է��� 1������� : " + f + "�Դϴ�.");
		System.out.println("�Է��� 5�ʿ����� : " + g + "�Դϴ�.");
		System.out.println("�Է��� 1�ʿ����� : " + h + "�Դϴ�.");
		System.out.println("�Է��� 1������ : " + i + "�Դϴ�.");

		
		/*����]
				 *  	1���� 365.2426���̴�.
				 *  	�� ��¥�� ���� ���� ��ð�, ���, �������� ����ؼ� ����ϼ���.
		*/
			double year = 365.2426;
			int sec = (int)((year % 1) * 86400) ;
			int dd = (int) year;
			int hh =  sec / 3600;
			sec %= 3600;//1�ð�
			int mm = sec / 60; // 1��
			sec %= 60;
			int ss = sec; // 1��
			
			System.out.println("���� : " + dd);
			System.out.println("��ð� : " + hh);
			System.out.println("��� : " + mm);
			System.out.println("���� : " + ss);
		
	}
}
