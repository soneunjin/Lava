package day10;
import java.util.*;
import javax.swing.*;
/*
 * ���� 4]
	
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	
	��ȭ]
		�����ϰ� �ο����� �����
		�� �ο��� ��ŭ ������ �����ϰ� ����
		�Լ��� �����ϰ� �ϼ���.			
 */
public class Ex02 {
	
	int sum;
	
	public Ex02() {
		getSum();
		
	}
	public void getSum(int...no1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int no = sc.nextInt();
		
		int total = 0;
		for(int i=0; i<no1.length; i++) {
			no1[i] = no;
			
			sum += no;
		
			
		}
		sum = total;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Ex02();
		
	}

}
