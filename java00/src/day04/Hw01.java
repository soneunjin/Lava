package day04;
import java.util.*;
/*
  	�� ���� �Է¹��� ��
  	�� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
  	�ִ�����: �� ���� ���� �� �ִ� �ִ� �� 
 */
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		Scanner sa = new Scanner(System.in);
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int no2 = sa.nextInt();

		
			if(no2 > no1) {
				int tmp = no1;
				no1 = no2;
				no2 = tmp;
			}
			for(int i = no2; i>0; i--) {
				if(no1 % i == 0 && no2 % i == 0) {
					System.out.println(no1 + "��"+no2+"�� �ִ�������"+i);
					break;
				}
			}
				
			}
			
		}
		