package day16;
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
/*
  	ChoiceFormat
  	
  		�л��� ������ �Է¹޾�
  		������ ����ϴ� ���α׷��� �ۼ��غ���.
 */
public class Test03 {

	public Test03() {
		// ���� limits�� ����� �ش�.
		double[] limits = {0, 60, 70, 80, 90};
		// limits�� ���鶧 ���ǻ���
		// 	�ݵ�� �������� ���ĵǾ�� �Ѵ�.
		//	�̰��� �ǹ̴� 60 ~ 69 ���̴� �ϳ��� ���ڷ� �ٲٰ�
		//	70 ~ 79 ���̴� �ٸ� �ϳ��� ���ڷ� �ٲ�� ...
		
		// ��ü�� ���ڸ� �����
		String[] formats = {"F", "D", "C", "B", "A"};
		// �̶� �ݵ�� limits�� ������ ��ġ ���Ѿ� �Ѵ�.
		
		ChoiceFormat cForm = new ChoiceFormat(limits, formats);
		
		// ���� ������ �Է¹޾Ƽ� ������ ó���غ���.
		while(true) {
			String str = JOptionPane.showInputDialog("������ �Է��ϼ���.\n����� q�� �Է��ϼ���.");
			if(str.equals("q")) {
				break;
			}
			int score = 0;
			try {
				score = Integer.parseInt(str);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "��� ������ �Է��ϼ���.");
				continue;
			}
			
			String grade = cForm.format(score);
			JOptionPane.showMessageDialog(null, "���� : " + score +"\n���� : " + grade);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
