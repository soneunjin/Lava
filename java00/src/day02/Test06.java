package day02;
import java.util.*;
public class Test06 {
/*
  	�����ϰ� ���� 11 ~ 33������ �μ��� �߻���Ű��
  	���ڸ� �Է¹޾Ƽ�
  	�Է¹޴� ���ڰ� 1�̸� �ﰢ���� ���̸�
  	�Է¹޴� ���ڰ� 2�̸� �簢���� ���̸� �����ִ� ���α׷��� �ۼ��ϼ���.
  	
 */
	public Test06() {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ������ְ�
		System.out.print("�ﰢ���� ���̴� 1, �簢�� ���̴� 2 �� �Է��ϼ���! : ");
		int code = sc.nextInt();
		
		// �����ϰ� �μ��� �߻��ؼ� ������ ���
		int no1 = (int) (Math.random()*(33 - 11 + 1)) +11;
		int no2 = (int) (Math.random()*(33 - 11 + 1)) +11;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		
		// �ڵ尪�� 1�̸� �ﰢ�� ���̸� ���ؼ� ������ְ� , 2�� �簢�� ���̸� ���������.
		/*
		  	�簢���� �ﰢ���� ������ Ÿ���� �ٸ��� ������ 
		  	�Ѱ��� Ÿ������ ���� ������� �Ѵ�.
		  	���⼭�� �Լ� ������ ����� �״�� ����� �뵵�θ� ����� ���̱� ������
		  	���ڿ��� �����ؼ� ����ϸ� �ȴ�.
		  	
		 */
		/*
		 // ��� 1] 
		  String result = (code == 1) ? ("�ﰢ���� ���� : " +samgak(no1,no2)) :
		 
						(
								code == 2 ? ("�簢���� ���� : " +sagak(no1,no2)) : ("��������� ���ÿ�!")
								
								  ) ;
		*/
		// ��� 2]
		double semo = samgak(no1,no2);
		int nemo = sagak(no1,no2);
		
		String result = (code == 1) ? ("�ﰢ���� ���̴� : " + semo) :
										(
											code == 2 ? ("�簢���� ���̴� :" + nemo) : ("��������� ���ÿ�!")
										);
		System.out.println(result);
		
	}
	
	// �ﰢ�� ���� �����ִ� �Լ�
	public double samgak(int no1, int no2) {
		// ������ ����ؼ� ������ ���
		double area = no1 * no2 / 2.;
		// ������ ��ȯ���ְ�
		return area;
	}
	// �簢�� ���� �����ִ� �Լ�
	public int sagak(int no1,int no2) {
		// ������ ����ؼ� ������ ���
		int area = no1 * no2;
		// ������ ��ȯ���ְ�
		return area;
	}
	
	public static void main(String[] args) {
		new Test06();

	}

}
