package day13;

/*
  	�� Ŭ������ �簢���� ������ ����� Ŭ����
 */
public class Class01 extends Test01 {
	private int garo;
	private int sero;
	
	
	@Override
	public double calcArea(int... a) {
		garo = a[0];
		sero = a[1];
		
		return garo * sero;
	}

}
