package day07;
import javax.swing.*;
import java.util.*;
/*
  ���� 1]
	
	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ�
	����ϰ�,
	���� �迭�� �ҹ��ڷ� ������ ��
	�� �迭�� ����ϼ���.
	
���� 2]
	
	���� 10���� ������ �迭�� �����
	�����ϰ� 1 ~ 50���� �� �� �߻����Ѽ�
	�迭�� ���
	�迭�� 5��°������ �����͸� ���� ����� �����ϼ���.
	
���� 3]
	
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� - ���ڿ� �迭 3��
	�����͸� �Է��� ����
	
	�̸��� �Է��ϸ�
	�� ����� �����͸� ��� ������ �迭�� ����
	�����͸� �ְ� ����ϼ���.
	
���� 4]
	��ȭ��ȣ�� �Է��ϸ�
	'-'�� �������� �����͸� �и��ؼ�
	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
	indexOf(),substring()

extra ]
	���� ���ڿ��� �Է¹޾Ƽ�
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸�  * �� ǥ���ϼ���.
 */
public class Ex01 {

	public Ex01() {
//		solv1();
//		solv2();
//		solv3();
//		solv4();
		solv5();
	}
	
	public void solv1() {
		char ch[] = new char[10];
		char ch1[] = ch;
		
		
		for(int i=0; i<10; i++) {
			char tmp =(char)(Math.random()*('Z' - 'A' +1) +'A');
			ch[i] = tmp;
				
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		for(int i=0;i<10;i++) {
		char tmp =(char)(Math.random()*('Z' - 'A' +1) +'A');
		ch[i] = tmp;
		ch1[i] = (char)(('a'-'A')+(ch[i]));
		
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		
	}
	
	public void solv2() {
		int [] arr = new int[10];
		int [] arr1 = new int[10];
		for(int i=0; i<10;i++) {
			arr[i] = (int)(Math.random()*(50))+1;
			System.arraycopy(arr,0, arr1,0,5);
			
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		
	}
	
	public void solv3() {
		String name[] = new String[] {"����ö","������","�����","������","�輺��"};
		String tel[] = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555","010-6666-6666"};
		String mail[] = new String[] {"lee@naver.com","son@naver.com","kim@naver.com","lee1@naver.com","kim1@naver.com"};
		
		String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ��� ! : ");
		int idx = -1;
		
		for(int i=0;i<5;i++) {
			if(name[i].equals(str)){
				idx = i;
				
				String info[] = new String[] {name[idx],tel[idx],mail[idx]};	
				JOptionPane.showMessageDialog(null, info);
				System.out.println(Arrays.toString(info));
			}
		}
	}
	
	public void solv4() {
		String tel = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ��� ! :");
		
		int no1 = tel.indexOf('-');
		String[] num = new String[3];

			num[0] = tel.substring(0,no1);
			
			String tmp = tel.substring(no1+1);
			no1 = tmp.indexOf('-');
			num[1] = tmp.substring(0,no1);
			num[2] = tmp.substring(no1 +1);
			
	
			JOptionPane.showMessageDialog(null, num);
			System.out.println(Arrays.toString(num));
	}
	
	
	public void solv5() {
		String str = JOptionPane.showInputDialog("�����ڸ� �Է��ϼ��� ! : ");
		String tmp = str.charAt(0)+"";
		
		
		
		loop :
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<tmp.length(); j++ ) {
				if(str.charAt(i) == tmp.charAt(j)) {
					continue loop;			
				}				
			}
			tmp+= str.charAt(i);
		}
			
		char arr[] = tmp.toCharArray();
			
		int cnt[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == arr[i]) {
					cnt[i] += 1;
				}

			}
			
		}
			for(int i=0; i<arr.length;i++) {
				System.out.printf("%3c : " , arr[i]);
				for(int j=0; j<cnt[i]; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
