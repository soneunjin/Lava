package day17;

import java.util.*;
public class Test03 {

	public Test03() {
		ArrayList<Samo> list = new ArrayList<Samo>();
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Samo(no1,no2));
		}
		
		Collections.sort(list);
		for(Samo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		
		Collections.sort(list,new Samo1() {
			public int compare(Object o1, Object o2) {
				return ((Samo) o1).getWidth() - ((Samo) o2).getWidth();
			}
		});
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getWidth() + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test03();
	}

}
