package exam;

import javax.swing.JOptionPane;

/*
  	JOptionPane ���� ���ڸ� �Է¹޾Ƽ�
  	�迭�� �����
  	�迭�� �����  �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ�
  	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
  	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���.
  	
 */
public class Ex01 {
	int[] abc = new int[3];
	public Ex01() {
		
		setSum();
		
	}
	public void setSum() {
		int sum = 0;
		for(int i=0; i<abc.length; i++) {
			String str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���.");
			int a =Integer.parseInt(str);
			
			abc[i] = a;
			sum+= a;
			
			
		}
		JOptionPane.showMessageDialog(null, sum);
	}
		
	

	public static void main(String[] args) {
		new Ex01();
	}

}
