package day04;

/*
  	�� ����� ����� �ϴµ� 
  	�� ����� ���� �����  0.54m/s �����ϰ�
  	�� ����� ���󿡼� 1.07m/s �������� �����ߴ�.
  	
  	���� ���̰� 7564m ��� �����ϰ�
  	�� ����� ������ �ð��� ��� ���� �������� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
  	
  	
 */
public class Hw04 {

	public static void main(String[] args) {
		int tHeight = 7564;
		for(int i=0;;i++) {
			double h1 = i*0.54;
			double h2 = tHeight - (1.07*i);
			if(h1 > h2) {
				System.out.println("�ö󰡴� ����� ���� : " + h1);
				System.out.println("�������� ����� ���� : " + h2);
				System.out.println("�λ���� ���� ���� �ð� : " + (i / 60) + "��,"+ (i%60) + "��");
				break;
				
				
				
			}
			
			
		}
		

	}

}
