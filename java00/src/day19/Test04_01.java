package day19;

/*
 	����4]
 	������ �����غ���.
 */
import java.io.*;
import java.util.Arrays;

import javax.swing.*;
public class Test04_01 {

	public Test04_01() {
	// ����
	// ���� ����� ������ ������ ���� ��
	// ���� ������ �ٸ� ���Ͽ� �������� �۾��̴�.
	// ���� ���������� ���� Ÿ�ٽ�Ʈ���� �غ��ϰ�
	// ���� �� ���� ������ byte[] �����صθ� �� ���̴�.
	// ������ Ÿ�ٽ�Ʈ���� ���� �� ���̴�.
	
	// 1. �⺻��Ʈ�� �ΰ��� �غ��Ѵ�.
	FileInputStream fin = null;		//����
	FileOutputStream fout = null;	//���纻

	try{
		// 2. �⺻��Ʈ�� �ΰ��� ����.
		fin = new FileInputStream("src/day19/etc/sample.txt");
		fout = new FileOutputStream("src/day19/etc/increpas.whw");
		/*
		fin = new FileInputStream("src/day19/Test04.java");
		fout = new FileOutputStream("src/day19/Test04_01.java");
 */		
		// �� ������ �о �״�� �ٸ� ���� ���� �ȴ�.
		// ��� �о�� ���� ��.
		byte[] buff = new byte[1024];
		while(true) {
			Arrays.fill(buff,(byte)0);
			int len = fin.read(buff);
			if(len==-1) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "��");		
	} catch(Exception e) {
		JOptionPane.showMessageDialog(null, e.toString());
	} finally {
		try {
			fin.close();
			fout.close();
		} catch(Exception e) {}
	}
	
	
	
	
	}

	public static void main(String[] args) {
		new Test04_01();
	}

}
