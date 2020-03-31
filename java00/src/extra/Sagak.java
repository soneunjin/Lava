package extra;

import day14.Samgak;

public class Sagak implements Comparable{
	private int width;
	private int height;
	private double area;
	
	
	public Sagak() {}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
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
		this.area = width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Sagak d1 = (Sagak) obj;
		
		bool = (this.width == d1.width) ? true : false;
		
		return bool;
	}
	

}
