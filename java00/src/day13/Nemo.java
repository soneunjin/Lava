package day13;

public class Nemo extends Figure {
	private int garo;
	private int sero;
	


	@Override
	public double Area(int... a) {
		garo = a[0];
		sero = a[1];
		return garo * sero;
	}
	
	public void toPrint() {
		System.out.println("garo : [" + garo + "] sero : [" + sero + "] ≥–¿Ã : [" + garo*sero +"]");
	}
	
}
