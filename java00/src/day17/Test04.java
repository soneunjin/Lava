package day17;
import java.util.*;

public class Test04 {

	public Test04() {
		ArrayList<String> list = new ArrayList<String>();
		// list�� �����͸� ä������.
		list.add("����");
		list.add("ū��");
		list.add("ȸ��");
		list.add("����");
		list.add("��ȣ");
		
		// ��º����ϰ�
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
		// �������� �����غ���.
		Collections.sort(list);
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
		Collections.sort(list,new Comparator() {
			// ���ڿ��� �⺻ ���Ĺ���� �������� �����̰�
			// �ٸ� ������� ������ �Ϸ��� Comparator �������̽��� ������ Ŭ������ ���������Ѵ�.
			@Override
			public int compare(Object o1, Object o2) {
				// �� �Լ� �ȿ���
				// ��ȯ���� �����̸� ��ü�ϰ�
				// ����̸� ���ΰ�
				
				// ���ڿ��� ��������ȯ ���ְ�
				String s1 = (String) o1;
				String s2 = (String) o2;
				
				int result = s1.compareTo(s2);
				return -result;
			}
			
		});
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
