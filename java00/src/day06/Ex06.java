package day06;
/*
 * ���� 6]
	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ���
	������ ����ϼ���. 
 */
public class Ex06 {

	public static void main(String[] args) {
		long arr[] = new long[10];
		
		for(int i=0; i<arr.length; i++) {
			long no1 = 1;
			for(int j=1;j<=i+1;j++) {
				no1 = no1*j;
				
			}
			arr[i] = no1;
			
			System.out.println((long)arr[i]);
		}

	}

}
