package day02;

public class Sol01 {

	public static void main(String[] args) {
		double data = 365.2426;
		// 1. ��¥�� ����Ѵ�.
		int day = (int) data; // data -(data % 1)
		// 2. �������� ��¥ �̿��� �����͸� �ʷ� ȯ���Ѵ�.
		int sec = (int) ((data - day) * 24 * 60 * 60);
		// 0.2426 �� ==> 0.2426 * 24 (�ð�)
		//		   	==> 0.2426 * 24 * 60 (��)
		//			==> 0.2426 * 24 * 60 * 60 (��)
		
		int hour = sec / 3600;
		
		sec %= 3600;
		
		int min = sec / 60;
		
		sec %= 60;
		
		System.out.println("�ϳ��� " + day + "�� " + hour + "�ð� " + min + "�� " + sec + "�� �Դϴ�.");
		

	}

}
