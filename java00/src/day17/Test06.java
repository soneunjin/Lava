package day17;

import java.util.*;
public class Test06 {

	public Test06() {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elevator");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		set.add("jfla");
		
		// �� �߿��� b�� �����ϴ� �����ͺ���
		// d�� �����ϴ� �����ͱ����� ������
		// ���ο� Set�� ������.
		TreeSet<String> tmpSet = (TreeSet<String>) set.subSet("b", "dzzzzzzzzz");
		
		// ����Ѵ�.
		Iterator<String> itor = tmpSet.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
