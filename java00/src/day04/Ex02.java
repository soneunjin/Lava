package day04;

/*
  	���� 2]
  		�ΰ��� �ֻ����� ������ ���� 6�� �Ǵ� ��츦 ����ϼ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		for(int i=1;i <=6;i++) {
			for(int j=1;j<=6;j++) {
				int sum = i+j;
				if(i+j == 6) {
					System.out.println("i��[" + i +"] J��[" + j + "] �հ�� " + sum);
					
				}
			}
			
		}

	}

}
