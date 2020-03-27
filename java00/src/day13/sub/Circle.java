package day13.sub;

public class Circle implements Moyang {
	private int ban;
	private double area;
	
	public Circle() {
		
	}
	public Circle(int ban) {
		this.ban = ban;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = ban*ban*3.14;
	}

	@Override
	public void toPrint() {
		System.out.println("¹İÁö¸§ : " + ban + " ³ĞÀÌ : " + area);
	}

}
