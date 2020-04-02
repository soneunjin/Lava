package day19;

/*
 fr01.txt. ������ �о��.
 �� ������ ObjectOutputStream���� ������ �����̹Ƿ�
 �ݵ�� ������ �� ����� Ŭ������ �д� �ʿ��� ��Ű���� �����̸����� �Ȱ��ƾ� �Ѵ�.
 �ݵ��  ObjectInputStream�� ����ؼ� �о���Ѵ�.
 */
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
public class Test14_01 {

	public Test14_01() {
		// Ÿ�Ͻ�Ʈ�� ����
		FileInputStream fin = null;
		// ������Ʈ�� �غ�
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/fr01.txt");
			oin = new ObjectInputStream(fin);
			
			Friend fr = (Friend) oin.readObject();
			JOptionPane.showMessageDialog(null, fr.getName() + "\n"
					+ fr.getTel() + "\n"+ fr.getMail() + "\n"
					+ fr.getAge() + "\n"+ fr.getHeight() + "\n"
					+ fr.getGen() + "\n");
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Test14_01();
	}

}
