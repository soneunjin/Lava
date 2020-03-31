package day17;

import java.util.*;
public class Test01 {

	public Test01() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random()*16+5);
			int no2 = (int)(Math.random()*16+5);
			list.add(new Sagak(no1,no2));
		}
		
		for(Sagak s : list) {
			System.out.print(s.getArea()+ " | ");
		}
		System.out.println();
		
		// ���� �� ArrayList�� �����غ���.
		// �����ϴ� ����� CollectionsŬ������ �Ҽӵ� sort()�Լ��� ȣ���ϸ� ���� ���������� �� ���̴�.
		Collections.sort(list);
		for(Sagak s : list) {
			System.out.print(s.getArea()+ " | ");
		}
		System.out.println();
		
		// ���� ���θ� �������� �����Ϸ��� �Ѵ�.
		Collections.sort(list,new HwSort());
		for(Sagak s : list) {
			System.out.print(s.getWidth()+ " | ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
