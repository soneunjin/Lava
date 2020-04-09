package NCS;

public class Plus implements Calc {

	public Plus() {
		cal(10,20);
	}

	@Override
	public double cal(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}
	public static void main(String[] args) {
	}

}
