package day10;

/**
 * �� Ŭ������ �����μ� �׽�Ʈ Ŭ����
 * @author ������
 * @since 2020.03.20
 * @version v.1.0
 * 
 */
public class Test05 {
	
	public Test05() {
		System.out.println(1);
		System.out.println("�ο��� : " + getCnt("������","�����","�ڱ�ȣ","�ڱ���","������"));
		System.out.println(2);
	}
	// �̸����� �Է��ϸ� �ο����� ��ȯ���ִ� �Լ�
	public int getCnt(String...name) {
		System.out.println(3);
		System.out.println(name[1]);
		return name.length;
	}
	
	
	public static void main(String[] args) {
		System.out.println(4);
		new Test05();
		System.out.println(5);
	}

}
