package day16;

import java.util.*;
public class Test09 {

	public Test09() {
		/*
		ArrayList list = new ArrayList();
		// List�� ������ ä���
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		*/
		
		
		
		HashSet list = new HashSet();
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		/*
		// list �迭�� ������ �Լ��� �־ �� �Լ��� ����ϴ� ���� ���ϴ�.
		for(int i=0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		*/
		
		// 2. Iterator �� ��������.
		Iterator itor = list.iterator();
		
		while(itor.hasNext()) {
			// hasNext()	==> ���ۿ� ���� �����Ͱ� ������ true, ������ flase�� ��ȯ���ش�.
			String tmp = (String) itor.next();
			// ���������� �ϳ��� ������ �ϴµ�
			// ������ �Լ��� next() �ε� ��ȯ�� Ÿ���� Object �̹Ƿ� ������ ��������ȯ�ؼ� ����ؾ� �Ѵ�.
			System.out.print(tmp + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test09();
	}

}
