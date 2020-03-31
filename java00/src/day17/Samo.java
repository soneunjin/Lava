package day17;

public class Samo implements Comparable{
		private int width;
		private int height;
		private double area;
	
		public Samo() {}
		public Samo(int width,int height) {
			this.width = width;
			this.height = height;
			setArea();
		}
	@Override
	public int compareTo(Object o) {
		Samo s = (Samo) o;
		
		double result = this.getArea() - s.getArea();
		
		return (int) result;
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
		this.area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
