package day04;

/*
  	���� 3]
  		2x + 4y = 10 �� �������� ����� ����ϼ���.
  		��, x, y �� ��� 0�̻�  10������ �����̴�.
 */
public class Ex03 {

	public static void main(String[] args) {
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				int sum = 2*x + 4*y;
				if(2*x+4*y == 10) {
					System.out.println("2x + 4y = 10 : "+ "x :["+x+ "] y : [" + y+ "] = " +sum);
				}
			}
		}
			

	}

}
