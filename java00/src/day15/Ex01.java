package day15;
import javax.swing.*;
import java.util.regex.*;
/*
  	���� 1]
  		
  		�̸����� �Է¹޾Ƽ�
  		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �ƴ��� �˻��ϼ���.
  		�̸��� ������
  			���ĺ��� ���ڷ� 8�����̻����� �ϰ� @ �������ּ�
  		�� ó���ϼ���.
  		
  		���� ]
  			�ѱ� ó�� : [��-�R] - �ѱ��� ���̵� ����������.
 */
public class Ex01 {
	
	public Ex01() {
		String val = JOptionPane.showInputDialog("�̸����� �Է����ּ���! ");
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9].*+$");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null,"�ùٸ� �̸����Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null,"�߸��� �̸����Դϴ�.");
			
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
