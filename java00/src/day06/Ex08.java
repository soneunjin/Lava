package day06;
import java.util.*;
/*
 * ���� 8]
	
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� -- ���ڿ� �迭 3��
	�����͸� �Է��ؼ�
	
	ȸ���� �̸��� �Է��ϸ�
	ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���.
	
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name[] = new String[] {"����ö","�����","������","������","�輺��"};
		
		String pone[] = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		
		String email[] = new String[] {"a@naver.com","ab@naver.com","abc@naver.com","abcd@naver.com","abcde@naver.com"};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ���� �̸��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		for(int i=0; i<5; i++) {
			if(str.contentEquals(name[i])) {
				System.out.println("�̸� : " + name[i]);
				System.out.println("��ȣ : " + pone[i]);
				System.out.println("���� : " + email[i]);
				
			}
			System.out.println();
			
			}
		}
		
		
		}

	

