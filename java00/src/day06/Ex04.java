package day06;
import java.util.*;
/*
 * ���� 4]
	
	������ 5���� ����� �迭�� �����					- �����迭 1��
	�����ϰ� 2~ 30 ������ 5���� �������� ���� �Է��ϰ�	- Math.random
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� ����� - �Ǽ��迭 1��
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����			- �Ǽ��迭 1��
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	��, ������´�
		
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
	
	�� ���·� ��µǰ� �ϼ���.
 */
public class Ex04 {

	public static void main(String[] args) {
		int ban[] = new int[5];
		double ban1[] = new double[5];
		double ban2[] = new double[5];
		
		for(int i=0;i<5;i++) {			
			int tmp = (int)(Math.random()*(30-2+1))+2;
			ban[i] = tmp;
			
			ban1[i] = tmp*tmp*3.14;
			ban2[i] = tmp*2*3.14;
			
			System.out.printf("������ :" + ban[i]+"���� �ѷ� : "+ban2[i]+" ���� ���� : " + "%.2f",ban1[i]);
			System.out.println();
			
		}
		
		
		

	}

}
