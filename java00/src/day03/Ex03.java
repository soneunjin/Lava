package day03;
import java.util.*;
/*
   	���� 2]
   		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
   				�ڵ�		�⺻���	�����
   		������	(1)		3800	245
   		�����	(2)		2400	157
   		������	(3)		2900	169
   		�����	(4)		3200	174
   		
   		������ = �⺻��� + ��뷮 * �����
   		
   		������ڵ�� ��뷮�� �Է¹޾Ƽ�
   		�������� ������ִ� ���α׷��� �ۼ��ϼ���.
   		
   		
 */
public class Ex03 {

	
	public Ex03() {
		solv();
	}
	public void solv() {
		System.out.println("����� �ڵ� 1. ������ 2. ����� 3. ������ 4. �����");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ڵ带 �Է��ϼ��� : ");
		int code = sc.nextInt();
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int sa = sc.nextInt();
		int result = 0;
		if(code == 1) {
			result = 3800 +(sa*245);
		} else if(code == 2) {
			result = 2400 +(sa*157);
		} else if(code == 3) {
			result = 2900 +(sa*169);
		} else if(code == 4) {
			result = 3200 +(sa*174);
		} 
		System.out.println("���⼼ : "+ result + "��");
		

	}
	public static void main(String[] args) {
		new Ex03();

	}

}
