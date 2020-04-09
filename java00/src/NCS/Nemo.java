package NCS;

public class Nemo extends Figure {
	private int width, height;
	private float area;
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		area();
		
	}
	public float area(int width, int height) {
			return area = width * height;
		
	}

}
