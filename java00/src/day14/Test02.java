package day14;

import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		// ���������� ���ڿ��� �Է¹ް�
		String sno = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!");
		// ���� ������ �����
		int no = 0;
		
		try {
			System.out.println("*** ���� ��ȯ �� ***");
			no = Integer.parseInt(sno);
			System.out.println("### ���� ��ȯ �� ###");
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			// �� ���� ���� �߻� ���ο� ������� �ݵ�� ����Ǿ�� �� ����� ����Ǵ� �κ�..
			System.out.println("no : " +no);
		}
		
		
		
	}

}
