package NCS;

public class Semo extends Figure {
	private int width;
	private int height;
	private	float area;
	public Semo(int width,int height) {
		this.width = width;
		this.height = height;
		area();
		
	}
	public float area(int width,int height) {
		return area = width * height * 0.5f;
		
	}

}
