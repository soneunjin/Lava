package day14;

import javax.swing.*;

public class Samgak{
	 private int wit;
	 private int height;
	 private double area;
	 
	public Samgak(int wit,int height) throws NumberFormatException{
		this.wit = wit;
		this.height = height;
		
	
	if(wit < 0) {
		throw new NumberFormatException();
	}
	setArea();
	toString();
	}
	
	public void setArea() {
		area = wit*height *0.5;
	}
	
	
	
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Samgak d1 = (Samgak) obj;
		
		bool = (this.wit == d1.wit) ? true : false;
		
		return bool;
	}
	public String toString() {
		
		String a = "�� �ﰢ���� �غ���" + wit + "���̰� " + height + "���̰� " + area +"�� �ﰢ���Դϴ�.";
		
		return a;
	}
	
	
}
