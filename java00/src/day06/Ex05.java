package day06;
/*
 * ���� 5]
	
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� �����͸� ����ϼ���.
	
 */
public class Ex05 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int no = 0;
		int no1 = 1;
		
		for(int i=0;i<num.length;i++) {
			int result = no+no1;
			for(int j=1;j<=i;j++) 
				no = no1;
				no1 = result;
				num[i] = no1;
				
				
				System.out.print(num[i]+",");
				
				
			}
		

	}

}
