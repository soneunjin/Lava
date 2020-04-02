package day19;
/*
 	DataOutputStream ���� ������ ģ���� ������ �о��.
 	
 
 */

import java.io.*;
import javax.swing.*;
public class Test08_01 {

	public Test08_01() {
		// Ÿ�� ��Ʈ�� �غ�
		FileInputStream fin = null;
		// ���� ��Ʈ�� �غ�
		DataInputStream din = null;
		
		try {
			// ��Ʈ�� �ʱ�ȭ �ϰ�
			fin  = new FileInputStream("src/day19/etc/DataStream_test.txt");
			din = new DataInputStream(fin);
			// ���� ������ ������ �� �̸�, ����, ����, ����, ��ȭ, ������ ������ ������ �߱� ������
			// ���� ���� �� ������ �о�� �Ѵ�.
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			// ����ϰ�
			String msg = "�̸� : " + name + "\n���� : " + age + "\n���� : "+height+"cm\n���� : "
					+ "\n��ȭ : " + tel + "\n���� : " + mail;
			JOptionPane.showMessageDialog(null, msg);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {
				
			}
		}	
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
