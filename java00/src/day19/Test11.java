package day19;

/*
 Test10�� ���� ������ �о��
 */

import java.io.*;
import javax.swing.*;
public class Test11 {

	public Test11() {
		// ��Ʈ�� �غ�
		FileReader fr = null;
		// ��Ʈ�� �ʱ�ȭ
		try {
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
			/*
			// 1. �ѱ��� �б�
			int ch = fr.read();
			JOptionPane.showMessageDialog(null, "���� ������ : " + (char)ch);
			*/
			char[] buff = new char[1024];
			int len = fr.read(buff);
			// ���� �迭�� ���ڿ��� ��ȯ
			String str = new String(buff, 0 , len);
			JOptionPane.showMessageDialog(null, str);
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fr.close();
			} catch(Exception e) {
			}
		}
	}
	public static void main(String[] args) {
		new Test11();
	}
}
