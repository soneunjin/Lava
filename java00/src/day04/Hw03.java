package day04;


/*	(��ø�� �ݺ������� ó��)
  	2 ~ 100 ������ �� �� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
  	�Ҽ� : 1�� �ڱ��ڽ����θ� ������ �ִ� ��
  	
 */
public class Hw03 {

	public static void main(String[] args) {
		for(int i=2; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				if(i%j == 0) {
					break;
				
				}
			}
			System.out.println(i);
		}
		
	}

}
