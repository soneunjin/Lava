package day03;
/*
  ���� 5]
  		������ ���� 10 ~ 99 ������ ���ڸ� �߻���Ų ��
  		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
  		
  		 ��]
  		 	45 �� 50 ���� ���� 5�� ����.
  		 	
  		 	53�� 50 ���� ���� 3�� ����.
 */
public class Hw05 {
	
	public Hw05() {
		solv();
	}
	
	public void solv() {
		// 10 ~ 99 ������ ������ ���� �����
		int num = (int)(Math.random()*(99-10+1))+10;
		
		// ����� 10�� ��� �����
		// ���� 10���� ���� ������ ���ϰ�
		int nmj = num % 10;
		// �������� 5���� ũ�ų� ������ ���Ǵ����� 10�÷��ְ�, ������ 10�� ������ �׳� ����
		int sip = (nmj >= 5) ? (num/10 *10 + 10) : (num / 10 * 10);
		// ���� ���Ѵ�. �׷��� �������� 5���� ũ�ų� ���� ���� sip���� ���ڸ� ������ϰ�,
		// 5���� ������ ���ڿ��� sip�� ���ָ� �ȴ�.
		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
		// ����ϰ�
		System.out.println("�����ϰ� �߻��� ���� : " + num + "\n ����� ���� ��� : " + sip + "\n ����� ���� ������� �� : " + cha);
		
	}
	public static void main(String[] args) {
		new Hw05();
		

	}
	

}