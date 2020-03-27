package day14;

import javax.swing.*;

public class Ex01 {
	 int wit,wit1;
	  int height,height1;
	  double area;
	 
	public Ex01() {
		String str = JOptionPane.showInputDialog("밑변을 입력해 주세요.");
		String str1 = JOptionPane.showInputDialog("높이를 입력해주세요.");
		String str2 = JOptionPane.showInputDialog("밑변을 입력해 주세요.");
		String str3 = JOptionPane.showInputDialog("높이를 입력해주세요.");
		
		wit = Integer.parseInt(str);
		height = Integer.parseInt(str1);
		wit = Integer.parseInt(str2);
		height = Integer.parseInt(str3);
		
		
		
		Samgak t1 = new Samgak(wit,height);
		Samgak t2 = new Samgak(wit1,height1);
		
		JOptionPane.showMessageDialog(null,"1번 삼각형"+t1.toString());
		JOptionPane.showMessageDialog(null,"2번 삼각형"+t2.toString());
		JOptionPane.showMessageDialog(null,"1번과 2번은"+((t1.equals(t2))? ("같은삼각"):("다른삼각")));
		
		
	}
	
	
	

	public static void main(String[] args) {
		new Ex01();
		
	}
	

}
