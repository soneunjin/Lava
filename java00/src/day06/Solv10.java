package day06;

public class Solv10 {

	public Solv10() {
//		solv1();
		solv2();
	}
	public static void main(String[] args) {
		new Solv10();

	}

	
	public void solv1() {
		
		int no = 1;
		int i= 0;
		while(i<5) {
			
			int j=0;
			while(j <= i) {
				System.out.printf("%3d",no++);
				j++;
				
				
			}
			System.out.println();
			// while �������� ī���� ���� �������� ������ ó������� �Ѵ�.
			i++;
			
		}
		
		
	}
	public void solv2() {
		for(int i=0;i<5;i++) {
			// �� ���� ���� ���� �����
			int no = 1;
			for(int j=0; j<=i;j++) no +=j;
				
			// �� ���� �� ���� ���� ����ϱ�
			for(int j =0; j<= i; j++) {
				System.out.printf("%3d",no+j);
				
			}
				System.out.println();

		}
		

		
	}
	
}
