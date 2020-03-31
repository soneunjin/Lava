package day17;

import java.util.*;
public class Test03_01 {

	public Test03_01() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i=0; i<10; i++) {
			
			list.add(new Sagak((int)(Math.random()*16 + 5),(int)(Math.random()*16 + 5)));
			
		}
		
		for(int i=0; i<10; i++) {
			System.out.printf("%2d ] %5.0f\n", i+1, list.get(i).getArea());
		}
		System.out.println("*********************");
		
		
		// �⼧�� for ������� ó��
		int num = 1;
		for(Sagak s : list) {
			System.out.printf("%2d ] %5.0f\n", num++, s.getArea());
		}
		
		
		ArrayList<Collection> list2 = new ArrayList<Collection>();
		
		list2.add(new Vector());
		list2.add(new ArrayList());
		list2.add(new LinkedList());
		list2.add(new HashSet());
		list2.add(new TreeSet());
		
//		list2.add(new HashMap());
		
	}

	public static void main(String[] args) {
		new Test03_01();
	}

}
