package day13.sub;
import java.util.*;
import java.lang.Math.*;
public class Exec01 {
	
	
	public Exec01() {
		ArrayList list = new ArrayList();
		
		list.add(new Square());
		list.add(new Circle());
		
		ArrayList list2 = new ArrayList();
		
		for(int i=0; i<10; i++) {
			
			int garo = (int)(Math.random()*10+1);
			int sero = (int)(Math.random()*10+1);
			list2.add(new int[] {garo,sero});
			
		}
		
		ArrayList list3 = new ArrayList();
		
		for(int i=0; i<10; i++) {
			int no = (int)(Math.random()*3+1);
			Moyang f;
			if(no == 1) {
				f = new Square(((int[]) list2.get(i))[0],((int[]) list2.get(i))[1]);
			} else if(no == 2) {
				f = new Circle(((int[]) list2.get(i))[0]);
			} else  {
				f = new Samgak(((int[]) list2.get(i))[0],((int[]) list2.get(i))[1]);
			}
			
			list3.add(f);
		}
		
		for(Object o : list3) {
			Moyang f = (Moyang) o;
			f.toPrint();
		}
		
		
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
