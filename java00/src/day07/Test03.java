package day07;
import javax.swing.*;
public class Test03 {

	public static void main(String[] args) {
		// "hyunwoo" �� ����� ���ڿ� ������ ����� �� ������ ���ϼ���.
		
		String str1 = "hyunwoo";		
		String str2 = "hyunwoo";
		
		String str3 = new String("hyunwoo");
		String str4 = new String("hyunwoo");
		
		JOptionPane.showMessageDialog(null, "str1 == str2 : " + (str1 == str2) +
											"\nstr1 == str3 : " + (str1 == str3) +
											"\nstr3 == str4 : " + (str3 == str4));
	}

}
