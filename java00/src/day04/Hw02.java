package day04;
import java.util.*;
/*
  	�� ���� �Է¹��� ��
  	�� ���� �ּ� ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
  	 �ּ� ����� : �� ���� ������ �������� ���� ���� ��
  	 
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		Scanner sa = new Scanner(System.in);
		int no2 = sa.nextInt();
		
		if(no2 > no1) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
	
		for(int i = no2; i>0; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				int result = no1 * no2 /i;
					System.out.println(no1 + "��" + no2 +"�� �ּ� �������"+ result +"�̴�.");
					break;
			}
		 }
		}

}

}