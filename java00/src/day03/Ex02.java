package day03;

/*
  	���� 1]
  		�Խ��ǿ� ���� ���������� 15�� ���� ǥ���� �� �ִ�.
  		�Խù��� ������ �����ϰ� (0 ~ 100) �߻��� ��
  		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  		��, �Խù� ���� 0�� ���� 1�������� �ʿ��� ������ �Ѵ�.
 */
public class Ex02 {

	public Ex02() {
		solv();
	}
	public void solv() {
		int no1 = (int)(Math.random()*(100 -0 +1))+0;
		int result = 0;
		if(no1 <= 15) {
			result = 1;			
		} else if(no1%15 == 0){
			result = no1/15;
		} else  {
			result = no1/15 +1;
		}
		System.out.println("�����Ѽ���" + no1 +"\n��������"+ result);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
