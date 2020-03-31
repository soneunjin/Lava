package day17;

import java.util.*;
public class Test05 {
//	�����ϰ� ���ڸ� 10���� ���� �÷��ǿ� ��� �������. ��, �ߺ����ڴ� ����...
	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			// ���� ���ڸ� �����ϰ� ������ش�.
			int num = rnd.nextInt(45+1);
			// set�� ä���ְ�
			set.add(num);
			
			// �׷��� �츮�� ���� ������ �ֱ�� �ߴ�.
			// Set�� �ߺ��� �����͸� ������� �ʰ�
			// ���� �ߺ��� ���� �ԷµǸ� �Էµ� ũ��� ������ �ȵ� ���̴�.
			// set�� �Էµ� �������� ���� 10���� �Ǵ� ���� �� �ݺ����� ���ᰡ �Ǿ�� �ڴ�.
			
			if(set.size() == 6) {
				break;
			}
		}
		
		// set ����ϰ�
		
		// 1. ArrayList�� ��ȯ�ؼ� ����ϴ� ���
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
		System.out.println();
		
		System.out.println("------------ Iterator ------------");
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
