package day13.sub;

public class Square implements Moyang {
	private int garo;
	private int sero;
	private double area;
	
	
	
	public Square() {
		
	}
	public Square(int garo,int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	
	
	
	@Override
	public void setArea() {
		area = garo*sero;

	}

	@Override
	public void toPrint() {
		System.out.println("가로 : " + garo + " 세로 : " + sero + " 넓이 : " + area);

	}

}
