package day17;

public class Sagak implements Comparable {
	private int width;
	private int height;
	private double area;
	
	public Sagak() {}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	
	@Override
	public int compareTo(Object o) {
		// �� �Լ��� Comparable �������̽��� ������ �ִ� �߻��Լ� �̹Ƿ�
		// �� �������̽��� �����ؼ� Ŭ������ �����ϴ� ��쿡��
		// �ݵ�� �� �Լ��� �������̵� ����� �Ѵ�.
		// �̶� ��ȯ���� ������ ���� ���Ľ� �Էµ� �����Ϳ� �ڸ��� �ٲ��� �ʴ´�.
		// ==> �Ű������� �ԷµǴ� �����Ͱ� �� ũ��.
		// ��ȯ���� 0 �� ���� ���� ����̴�.
		// ��ȯ���� ����� ���� ���Ľ� �Էµ� �����Ϳ� �ڸ��� �ٲ۴�.
		
		// Object Ÿ������ �Էµ� �����͸� Sagak Ÿ������ ��������ȯ�� ����� �Ѵ�.
		Sagak s = (Sagak) o;
		
		double result = s.getArea() - this.getArea();
		
		return (int) - result;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
