package day16;

// MessageFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test05 {

	public Test05() {
		/*
			"name : ȫ�浿, Tel : 010-1111-1111, Age : 24"
			"name : ��û��, Tel : 010-2222-2222, Age : 18"
			
			�� ��� �� ���ڿ��� ���� ������ �κ��� ������ �Ͼ��.
			�̷� ��� ���ڿ��� ����� ���
		 */
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		
		// ������ ������ �״�� ����
		// ����Ǵ� �κ��� {0}, {1}, {2} �� ������� ����Ѵ�.
		// ���⼭ {}���� ��ȣ�� �ԷµǴ� �������� ������ �ǹ��Ѵ�.
		
		Object[][] data = { {"ȫ�浿", "010-1111-1111", 24}, {"��û��", "010-2222-2222", 18} };
		
		// {0}, {1}, {2} �� �� �����͸� �迭�� �غ��ϰ�
		String result = form.format(data[0]);
		String result1 = form.format(data[1]);
		JOptionPane.showMessageDialog(null, result + "\n" + result1);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
