package day17;

import java.util.*;
public class NemoTest {

	public NemoTest() {
		TreeSet<Nemo> set = new TreeSet<Nemo>(new Nemo_Comp());
		Random rnd = new Random();
		int no = 0;
		for(;;) {
			System.out.println(no++); // �ݺ� ī��Ʈ ���...
			int width = rnd.nextInt(16)+1;
			int height = rnd.nextInt(16)+1;
			
			set.add(new Nemo(width,height));
			
			if(set.size() == 10) break; 
		}
		
		// ������ �������.
		Iterator<Nemo> itor = set.iterator();
		
		while(itor.hasNext()) {
			System.out.print(itor.next().getArea() + " | ");
		}
		System.out.println();
		/*
		TreeSet set1 = new TreeSet();
		for(int i=0; i<5; i++) {
			int width = rnd.nextInt(16) + 5;
			int height = rnd.nextInt(16) + 5;
			
			set1.add(new Nemo(width,height));
			
		}
		*/
		// Set to ArrayList
		/*
		ArrayList list = new ArrayList(set1);
		for(int i=0; i<list.size(); i++) {
			System.out.print(((Nemo)list.get(i)).getArea() + " | ");
		}
		System.out.println();
		// �� ��� TreeSet�� ������ �� �ִ� �����͸� �Է��ؾ� ������ �Ǵµ�
		// Nemo Ŭ������ ������ �� ���� �����̹Ƿ� �Է��� �ϸ� ������ ����.
		 
		*/
		
	}

	public static void main(String[] args) {
		new NemoTest();
	}

}
