package day18;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Ex01 {
/*
  	���� 1]
  		1. Ex01.txt �� ����� �����͸� Properties�� ���
  		2. Ű���� ��� ������
  		3. �����͸� �����ϰ�
  		4. ������ �����ּ���.
  		5. �޼���â�� ����� ������ ������ּ���.
 */
	public Ex01() {
		Properties pror = new Properties();
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			pror.load(fin);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Set set = pror.entrySet();
		ArrayList<Map.Entry<String, String>> elist = new ArrayList<Map.Entry<String,String>>(set);
		int sum = 0;
		String msg = "*** ���� ��� ***";
		for(int i=0; i<elist.size(); i++) {
			sum += Integer.parseInt(elist.get(i).getValue());
		}
		
		for(int i=0; i< elist.size(); i++) {
			msg += "\n" + elist.get(i).getKey() + " | " + elist.get(i).getValue();
//					JOptionPane.showMessageDialog(null, elist.get(i).getKey() + " | " + elist.get(i).getValue());
		}
			msg += "\n���� : " + sum;
			JOptionPane.showMessageDialog(null, msg);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
