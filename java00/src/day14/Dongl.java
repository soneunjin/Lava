package day14;

public class Dongl {
	private int rad;
	private double arround, area;
	
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
		
	}
	
	// �ѷ� �����ִ� �Լ�
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}
	
	// ���� �����ִ� �Լ�
	public void setArea() {
		area = 3.14 * rad * rad;
	}
	
	// area �� ���������ڰ� private �̰� �̰��� Ŭ������������ ������ �����ϹǷ� 
	// �Լ��� ���� �����͸� ��ȯ���ֵ��� ����.
	public double getArea() {
		return this.area;
	}
	
	// ���� ������ ������ ���� ������ �Ǵܵǵ��� equals �Լ��� �������̵� �غ���.
	public boolean equals(Object obj) {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		// �ԷµǴ� Dongl �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����� �� ���̹Ƿ�
		// Dongl Ÿ������ ���� ����ȯ�� ���Ѽ� ����� ����ؾ߰ڴ�.
		Dongl d1 = (Dongl) obj;
		
		// Ÿ���� ��ȯ�� ��� ���� ������ ������ ���غ���.
		// �񱳴� ����� �ΰ��� �ʿ��ϴ�. �ϳ��� �Ű������� �Է��� �޾Ҵ�. �׷� �ٸ� �ϳ���??
		bool = (this.area == d1.area) ? true : false;
		
		// ��� ��ȯ���ְ�...
		return bool;
	}
	
}
