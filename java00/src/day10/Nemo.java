package day10;
/**
 * �� Ŭ������ �簢���� ���ο� ���� �׸��� ���̸� ����� Ŭ����
 * 
 * @author 	������
 * @since 	2020.03.20
 * @version v.1.0
 * @see
 */
public class Nemo {
	// ��Ŭ������ ���ο� ���� �׸��� ���̸� ����ϰ� �־�� �Ǵ� Ŭ�����̴�.
	// ���� �����͸� ����� ������ ����� �ش�.
	
	// ����
	int width;
	int height; // ����
	int area;	// ����
	
	// �׷��� ���ο� ���θ� �Է��ϸ�
	// �� ������ �����͸� ����Ű�� ���̵� ����ؼ� �������ִ� ����� �ʿ��ϴ�.
	// ���� �� ����� ����� �Լ��� ����� �д�.
	public void setVal(int garo,int sero) {
		// ���� ���ο� ���θ� ����Ű��.
		width = garo;
		height = sero;
		
		// ���̴°���ؼ� �ٷ� ����Ű��.
		area = garo * sero;
	}
	
	// ����ϴ� ����� �Լ�
	public void toPrint() {
		System.out.printf("\n���� : %3d,\n���� : %3d,\n���� : %4d\n%10s", width, height, area,"----------");
		
	}
	
	
	
	
	
	
}
