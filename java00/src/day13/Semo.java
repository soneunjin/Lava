package day13;

public class Semo extends Figure {
	private int with;
	private int hig;
	
	@Override
	public double Area(int... a) {
		 with = a[0];
		 hig = a[1];
		return with * hig * 0.5;
	}
	
	public void toPrint() {
		System.out.println("with : [" + with + "] hig : [" + hig +"] ≥–¿Ã : [" + with * hig * 0.5+"]");
	}
}
