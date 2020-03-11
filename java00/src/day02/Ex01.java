package day02;
import java.util.*;
public class Ex01 {
/*
 	���� 1]
  	3�ڸ��� ������ ���� �ϳ��� �Է��� ���� �� �Ǵ� �����ϰ� ���� ��
  	���ڸ� ���ϸ� ���� ���ڸ� ���� ����ϼ���.
  		��]
  			456 --> 400
  			
  	���� 2]
  		0 ~ 255 ������ ���ڸ� �����ϰ� �����
  		�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
  		�ش� ���ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
  		��, ���� �����ڸ� ����ؼ� ó���ϼ���.
  		
  	���� 3]
  		ȭ��(Fahrenheit) �µ� 100����
  		����(Celcius) �µ� ����� �˾ƺ��� ���α׷��� �ۼ��ϼ���.
  		
  		����]
  			�����µ� = 5 / 9 X (ȭ���µ� - 32)
  			
  	���� 4]
  		�Ҽ����� �ִ� ���ڸ� �Է��� ��
  		�Ҽ��� ���� ��°�ڸ����� �ݿø��� ����� ����ϼ���.
  		
  		����]
  			+0.005 �� �ϸ� ��°�ڸ����� ��ȯ�� �Ͼ ���̰�
  			���⿡ x100 ���ָ� ��°���� �����ο� �� ���̰�
  			�̰��� ������ �ٲٸ� �������� ��°�ڸ� ���ϴ� �������̰�
  			�ٽ� / 100 ���� ���ָ� �� �Ҽ��� ���·� ��ȯ�� ���̴�.
  	
  	���� 5]
  		������ ���� 10 ~ 99 ������ ���ڸ� �߻���Ų ��
  		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
  		
  		 ��]
  		 	45 �� 50 ���� ���� 5�� ����.
  		 	
  		 	53�� 50 ���� ���� 3�� ����.
  		 	
  	���� 6]
  		������ �⵵�� �Է¹޾Ƽ�
  		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  		
  		��, ���׿����ڸ� ����ؼ� ó���ϼ���.
  		
  		������ ����]
  			4�� ���� �������� 100���� ���� �������� ������
  			400���� ���� �������� �ظ� �����̶� �Ѵ�.
  		
  		
 */
	// �⺻ ������ �Լ� ����
	public Ex01() {
		sol01();
		sol02();
		sol03();
		sol04();
		sol05();
		sol06();
	}
	
	public void sol01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�ڸ����� �� �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		
		int no2 = (int)(Math.random()*999)+1;
		int result = (no1/100) * 100;
		System.out.println(result);
		System.out.println("������ ���� : " + no2);
		int result2 = (no2/100) * 100;
		System.out.println(result2);
	}
	
	public void sol02() {
		int code = (int)(Math.random()*(255-0+1)+0);
		char ch = (char) code;
		System.out.println(ch);
		String result = ((char) code >='A'& (char)code <= 'Z') ? ("�������Դϴ�.") :
									 ((char) code >= 'a' & (char) code <= 'z' ) ?
											 ("�������Դϴ�.") : ("�����ڰ� �ƴմϴ�.");
						
		System.out.println(result);
	}
	public void sol03() {
		int fe = 100;
		double ce = 5 / 9f *(fe - 32);
		System.out.println("ȭ�� fe�� :" + ce +" �Դϴ�.");
		
	}
	
	public void sol04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ҽ����� �ִ� ���ڸ� �Է��ϼ��� : ");
		double sosu = sc.nextDouble();
		double result = (sosu + 0.005)*100;
		int result1 = (int) result;
		double result2 = (double) result1/100;
		System.out.println("�Ҽ��� ��°�ڸ� �ݿø��� �� : " + result2);
		
	}
	
	public void sol05() {
		int no1 = (int)(Math.random()* (99-10+1))+10;
		int result =  (no1+5) /10 * 10 ;
		int result1 =  (int) result;
		int result2 = result - no1;
		System.out.println("no1 �� : "+ no1+"��"+result+" �����̴�"+Math.abs(result2)+"���ϴ�.");
		
	}
	
	public void sol06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �⵵�� �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		String result = (no1 % 4 == 0 && no1 % 100 !=0 || no1%400 == 0) ? ("�����Դϴ�.") : ("����Դϴ�.");
		System.out.println("�ش�⵵ "+no1+" �� "+result);
		
	}
	public static void main(String[] args) {
		new Ex01();
		

	}

}
