package day19;
/*
 	���� ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���.
 */
import java.io.*;
import javax.swing.*;
public class Test10 {
	public Test10() {
		// ��Ʈ�� �غ�
		FileWriter fw = null;
		try {
			// ��Ʈ�� �ʱ�ȭ
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			/*
			// 1. �� ���ڸ�(2����Ʈ) �����غ���.
			char ch = '��';
			fw.write(ch);
			//2. �������� ����
			String str = "�䳢 �Ϳ�";
			char[] buff = str.toCharArray();
			fw.write(buff);
			 */
			//3. 
			String str = "�� �����ϸ� �� �ҰŴ�!!!!!!!!!!!!";
			fw.write(str);
			/*
			 char ���� ��Ʈ���� �ؽ�Ʈ �����͸� ó���ϵ��� �Ǿ��ֱ� ������
			 �⺻ �Լ��� ���� ó�� ����� �߰��Ǿ���.
			 */
			
			
			
			JOptionPane.showMessageDialog(null, "��������");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fw.close();
			} catch(Exception e) {
				
			}	
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
