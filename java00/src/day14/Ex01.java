package day14;

import javax.swing.*;

public class Ex01 {
	 int wit,wit1;
	  int height,height1;
	  double area;
	 
	public Ex01() {
		String str = JOptionPane.showInputDialog("�غ��� �Է��� �ּ���.");
		String str1 = JOptionPane.showInputDialog("���̸� �Է����ּ���.");
		String str2 = JOptionPane.showInputDialog("�غ��� �Է��� �ּ���.");
		String str3 = JOptionPane.showInputDialog("���̸� �Է����ּ���.");
		
		wit = Integer.parseInt(str);
		height = Integer.parseInt(str1);
		wit = Integer.parseInt(str2);
		height = Integer.parseInt(str3);
		
		
		
		Samgak t1 = new Samgak(wit,height);
		Samgak t2 = new Samgak(wit1,height1);
		
		JOptionPane.showMessageDialog(null,"1�� �ﰢ��"+t1.toString());
		JOptionPane.showMessageDialog(null,"2�� �ﰢ��"+t2.toString());
		JOptionPane.showMessageDialog(null,"1���� 2����"+((t1.equals(t2))? ("�����ﰢ"):("�ٸ��ﰢ")));
		
		
	}
	
	
	

	public static void main(String[] args) {
		new Ex01();
		
	}
	

}
