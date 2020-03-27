package day13;

public class Won extends Figure {
	private int ban;
	
	@Override
	public double Area(int... a) {
		ban = a[0];
		
		return ban*ban*3.14;
	}
	
	public void toPrint() {
		System.out.println("ban : [" + ban + "] ³ĞÀÌ : [" + ban*ban*3.14+"]" );
	}
}
