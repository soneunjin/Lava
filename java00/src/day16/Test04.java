package day16;

// ChoiceFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		// ChoiceFormat �� ���鶧 limits, formats�� �ϳ��� ���� ���� �ִ�.
		/*
		  	����� ����
		  		60#D	<= �� �ǹ�
		  		70<C	<  �� �ǹ�
		  		
		  		�̰��� | ��  �̿��ؼ� �����ؼ� ����ϸ� �ȴ�.
		 */
		String pattern = "0#F | 60#D | 70#C | 80#B | 90#A";
		// 60#D�� �ǹ̴� 60 <= �� ���� ���ں��ٴ� ���� ���� D�� ó���Ѵ�.
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		while(true) {
			String sno = JOptionPane.showInputDialog("������ �Է��ϼ���.\n���� : q");
			if(sno.equals("q")) {
				break;
			}
			
			int score = 0;
			
			try {
				score = Integer.parseInt(sno);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "�߸��� �����Դϴ�.");
				continue;
			}
			
			// ���� ��� ���ϰ�
			String grade = form.format(score);
			
			// ��� ������ְ�
			JOptionPane.showMessageDialog(null, "���� : " + score + "\n���� :" + grade);
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
