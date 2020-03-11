package day03;
/*
    	���� 4]
  		�Ҽ����� �ִ� ���ڸ� �Է��� ��
  		�Ҽ��� ���� ��°�ڸ����� �ݿø��� ����� ����ϼ���.
  		
  		����]
  			+0.005 �� �ϸ� ��°�ڸ����� ��ȯ�� �Ͼ ���̰�
  			���⿡ x100 ���ָ� ��°���� �����ο� �� ���̰�
  			�̰��� ������ �ٲٸ� �������� ��°�ڸ� ���ϴ� �������̰�
  			�ٽ� / 100 ���� ���ָ� �� �Ҽ��� ���·� ��ȯ�� ���̴�.
 */
// ���̺귯�� ��������
import java.util.*;
public class Hw04 {

	public Hw04() {
		// �Է¹��� �غ��ϰ�
			Scanner sc = new Scanner(System.in);
		// �޼�������ϰ�
			System.out.print("�Ǽ��� �Է��ϼ��� : ");
		// �Ǽ� �Է¹޾� ������ ���
			double num = sc.nextDouble();
		// �Լ� ���������� �Ѱ��ָ鼭 �����ϰ� ������ �ް�
			double result = banolim(num);
		// ������ ����ϰ�
			System.out.println("�Է¹��� �Ǽ� : " + num + "\n�ݿø��� �Ǽ� : " + result);
	}
	
	// �Ǽ��� �Ҽ� ��°�ڸ����� �ݿø����ִ� �Լ�
	public double banolim(double no) {
		// ��ȯ���� ���� ������ �����
		double result = 0.;
		
		// �Է¹��� ������ �ݿø��ϰ�(�Ҽ� ��°�ڸ�����...)
		/*
		  	double no = 123.4567;
		  	int no1 = (int)(no * 1000); ==> 123456
		  	no1 = no1 + 5;				==> 123461
		  	no1 = (no1 / 10) / 100;		==> 123.46
		 */
		int no1 = (int)(no*1000);
		no1 = no1 + 5;
		result = (no1 / 10) / 100.;
		
		// ������ ��ȯ�ϰ�
		return result;
	}
	public static void main(String[] args) {
		new Hw04();

	}

}
