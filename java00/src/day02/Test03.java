package day02;

public class Test03 {
	
	public Test03() {
		int sum = addNums(10,50);
		System.out.println("10�� 50�� ���� : "+ sum + " �Դϴ�.");
		
	}
	public static void main(String[] args) {
		new Test03();
		System.out.println();

	}






	/*
		�Լ� : ���α׷����� ����� ���� �ּ� ����
		
			����]
				[����������] [�Ӽ�] ��ȯ��Ÿ�� �Լ��̸�(�Ű���������Ʈ){
					�Լ�����...
					
					return [��ȯ��];
				}
				
				����]
					��ȯ�� ��ȯ�ϱ�
					
					return ��ȯ��;
					
					�ǹ�]
						������ ���� ������ �����ְ� �Լ��� �����ϼ���.
						
						��ȯ���� ���� ���� ��ȯ���� ������� �ʰ�
						return ����� �ǹ̴� �� �Լ��� ��� �����ϼ���.
						
					��ȯ�� Ÿ��]
						
						�ǵ����� �������� Ÿ���� �ǹ��Ѵ�.
						���� �ǵ����� �����Ͱ� ���� ���� void ��� ����Ѵ�.
				
			��]
				�� ���� �Է��ϸ� �� ��(����)�� ���Ѱ��� ��ȯ���ִ� ����� ���� �Լ�
				public int addNums(int no1,int no2){
					int sum = no1 + no2;
					
					return sum;
				}
	*/

	public int addNums(int no1, int no2) {
		int sum = no1 + no2;
		
		return sum;
		
	}
}	