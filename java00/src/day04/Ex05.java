package day04;
/*
  	���� 5]
  	
  		1 - 2 + 3 -4 + 5 - 6 ....
  		
  		�̷��� ����� �� ��� ������� 100�� �Ѿ�� ó�� ���ڴ� ������ ������� �Բ� ����ϼ���.
 */
public class Ex05 {

	public static void main(String[] args) {
			
		
		int giho = -1;
		int sum = 0;
		for(int i = 1 ; ; i++ ) {
			giho *= -1;
			sum += giho * i;
			if(sum > 100) {
				System.out.print(i + " �϶� ó�� 100�� �Ѿ�� �հ�� " + sum);
				break;
		}
			
		
		}
	}
}