package day06;
import java.util.*;
/*
 * ���� 2]
	'A' ~ 'J' ���ڸ� �����ϰ� 100�� �߻���Ų ��
	�� ������ ī��Ʈ�� ���ؼ�(����) ����ϼ���.
	
	�߰��� ���ڸ�ŭ ��ǥ(*)�� �� ����ϼ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		// ���ڹ迭
		char ch[] = new char[100];
		// ī��Ʈ ���� ������ ���� �迭
		int cnt[] = new int[10];
		// 'A'~ 'J' ���� ���� 100���� �����ϰ� ����� 
		for(int i=0;i<100;i++) {
			char tmp = (char)(Math.random()*('J' - 'A' + 1)+'A');
		// ch�迭�� �ְ�
			ch[i] = tmp;
			
		}
		
		// ������� ���ڹ迭���� �� ���ڰ� ����� ī��Ʈ�� �÷��ش�.
		for(int i=0;i<100;i++) {
			int idx = ch[i] - 'A';
			
			cnt[idx] = cnt[idx] + 1;

		}
		
		for(int i=0; i<10;i++) {
			System.out.printf("%3s : ",(char)('A' + i));
			for(int j=0; j<cnt[i]; j++) {
				System.out.print("*");
						
			}
			System.out.println();
			
		}

	}


}