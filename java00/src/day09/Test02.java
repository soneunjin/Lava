package day09;

/*
  	����(����) �ΰ��� �Է��ϸ�
  	�� ���ڸ� ����������ִ� �Լ����� �����
  	������ �ؼ�
  	������ ����ϰ�
  	������ ����ϴ� ���α׷��� �ۼ��ϼ���.
  	
 */
public class Test02 {

	public Test02() {
		// �Լ��� ��ȯ���� ������ ��Ƽ�
		int gap1 = plus(3,7);
		int gap2 = minus(6,7);
		int gap3 = namuji(7,7);
		int gap4 = gop(1000,2000);
		int gap5 = nanugi(1,1);
		
		// ����Ѵ�.
		System.out.println("plus(3,7) : " + gap1);
		System.out.println("minus(6,7) : " + gap2);
		System.out.println("namuji(7,7) : " + gap3);
		System.out.println("gop(1000,2000) : " + gap4);
		System.out.println("nanugi(1,1) : " + gap5);
	}
	
	// ���ϱ� ����
	public int plus(int no1,int no2) {
		int sum = no1 + no2;
		return sum;
	}
	
	// ���� ����
	public int minus(int no1,int no2) {
		int result = no1 - no2;
		return result;
	}
	
	// ������ ����
	public int namuji(int no1,int no2) {
		int result = no1 % no2;
		return result;
	}
	
	// ���ϱ� ����
	public int gop(int no1,int no2) {
		int result = no1 * no2;
		return result;
	}
	
	// ������ ����
	public int nanugi(int no1,int no2) {
		int result = no1 / no2;
		return result;
	}
	public static void main(String[] args) {
		new Test02();
	}

}
