package day04;

/*
  	while ���
  	
  		for ��ɹ�ó�� �ݺ������� �� �ִ� ��ɹ�
  		for ��ɹ����� �������� �ݺ��� �� Ƚ���� �����ϴ� ī���� ������
  		�׸��� �����ĵ� ��� ���ο� ���°��� �������̴�.
  		
  		����]
  			
  			(1)
  			while(���ǽ�(2)){
  				(3)
  			}
  			(4)
  			
  			���� : 1 -> 2 -> 3-> 2-> 3 -> ... ���ǽ��� true �� ��쿡�� -> 4
  			
 */
public class Test05 {

	public static void main(String[] args) {
		int dan = 1;
		
		
		while(dan < 10) {
			System.out.println("--------------------");
			int gop = 1;
			while(gop < 10) {
				System.out.println(dan + " X " + gop + " = " + (dan * gop));
				gop++;
			}
			dan++;
		}
		System.out.println("--------------------");
	}
	
}
