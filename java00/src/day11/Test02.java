package day11;

public class Test02 {

	public static void main(String[] args) {
//		int no1 = getRandom(); // static ����ȿ����� static ����� �޸𸮿� �÷��� �־�� ����� �� �ִ�.
		
		// �� ����ؾ� �ڴٸ�
		// 1. ����� �Լ��� ����� ������ Ŭ������ ��ü�� ������ش�.
		//		��ü = �������� + �ν��Ͻ�
		Test02 t1 = new Test02();
		int no1 = t1.getRandom();
		
		// static ��� ȣ��
		int no2 = getTen();
	}

	public int getRandom() {
		int result = (int)(Math.random()*7+1);
		return result;
	}
	
	public static int getTen() {
		return 10;
	}
}
