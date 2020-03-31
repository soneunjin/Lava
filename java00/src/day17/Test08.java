package day17;
import java.util.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		// Hashtable - HashMap �� ������..
		// ���� �����
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("�̸�", "ū��");
		table.put("tel", "010-9999-9999");
		table.put("����", "�ǹ���");
		table.put("�ξ�", "���");
		/*
		for(;;) {
		// ������ ������
		// ���� Ű�� �����
		String key = JOptionPane.showInputDialog("�˰���� ������ �Է��ϼ���,����� q");
		if(key.equals("q")) break;
		// ������ ������ �����ְ�
		JOptionPane.showMessageDialog(null, table.get(key));
		}
		*/
		
		// Map �迭�� Ű���� �˾ƾ� �����͸� ���� �� �ִ�.
		
		Collection<String> con = table.values();
		
		// Iterator�� ��ȯ�� ���
		Iterator<String> itor = con.iterator();
		
		// �ϳ��� ���������� ������ ���
		
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		// Ű���� �̾ƺ���. �Լ��� keys() / keySet()
		Enumeration<String> en = table.keys();
		
		// Iterator ó�� ��������.
		while(en.hasMoreElements()) {
			// ���ڿ� ������ ���
			String key = en.nextElement();
			// ������ְ�
			System.out.print("key : "+ key + "\n\t");
			// Enumeration�� ���ۿ� ����Ǵ� �������̹Ƿ� ������ ���� ������� �������̴�.
			// ���� ������ ��� ����ϴ��� ���� �����ϴ��� �ؾ� �Ѵ�.
			System.out.println(key + " : " + table.get(key));
		}
		System.out.println();
		/*
		while(en.hasMoreElements()) {
			String key = en.nextElement();
		}
		*/
		System.out.println("-----------------------------");
	}
	

	public static void main(String[] args) {
		new Test08();
	}

}
