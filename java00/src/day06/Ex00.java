package day06;

/*
    	���� 00]
    		1, 2, ...�� �����ϴ� ���丮�� 10���� ���ؼ� ����ϼ���.
    		
    		���丮�� :
    			1���� �ڱ��ڽű��� ���� ��
 */
public class Ex00 {

	public static void main(String[] args) {
		// �� ���� �ݺ��ؼ� ������ִ� �ݺ���
		for(int i=1; i<=10; i++) {
			int result = 1;
			// ������� ���ڱ��� ���� ����� ������ִ� �ݺ���
			for(int j=1; j <= i; j++) {
				result = result * j;
		
			}
			System.out.print(result+",");
			
			
		}

	}

}
