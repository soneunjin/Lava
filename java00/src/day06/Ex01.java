package day06;
import java.util.*;
/*
 * ���� 1]
	'A' ~ 'J' ������ ���ڸ� ���������� ����
	�迭�� �ְ� �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ�
	����ϼ���.
	
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		char str[] = new char[10];
		char str1[] = new char[10];
		
		for(int i=0;i<10; i++ ) {
			str[i] = (char) ('A'+i);
		}
		for(int i=0; i<10; i++) {
			str1[i] = (char) (('a'-'A')+(str[i]));
		}
		System.out.println(str);
		System.out.println(str1);
	}
		
}


