package day08.preSolv;
import javax.swing.*;
import java.util.*;


/*
  	extra ]
		���� ���ڿ��� �Է¹޾Ƽ�
		�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
		�󵵸�  * �� ǥ���ϼ���.
	
	
	
 */
public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("�����ڸ� �Է����ּ��� ! : ");
		// 2-0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = "";
		
		loop:
		for(int i=0; i< str.length();i++) {
			char imsi = str.charAt(i);
			// tmp�� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �����ش�.
			for(int j=0; j<tmp.length(); j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
					
				}
				
			}
			tmp += imsi;
			
		}
		
		int cnt = tmp.length();
		// ����
		// 1. ���ԵǾ� �ִ� ������ �������� ���Ѵ�.
		
		// 2. ���Ե� ������ �迭�� ���� �� �ְ� �Ǿ����Ƿ� ���� �迭�� ī��Ʈ �迭�� �����.
		char[] ch = tmp.toCharArray(); // ���Ե� ���ڸ� ������ �迭
		// ���ڹ迭�� ������ �ƽ�Ű�ڵ尡 ���� ������ �����ϰ�
		
		// �����ϱ�
		for(int i=0; i< ch.length - 1;i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
					
				}
				
				
			}
			
			
		}
		int[] count = new int[cnt]; // ���Ե� ������ �����󵵸� ����� �迭
		// 2. ���ڸ��� �����ϴ� ī��Ʈ�� �����ش�.
		for(int i=0; i<ch.length; i++) {
				char c = ch[i];
			for(int j=0; j<str.length();j++) {
				if(c == str.charAt(j)) {
					count[i] += 1;
					
				}
				
			}
			
		}
		
		StringBuffer buff = new StringBuffer();
		for(int i=0; i< ch.length; i++) {
			buff.append("  ");
			buff.append(ch[i]);
			buff.append("  :  ");
			for(int j=0; j<count[i]; j++) {
				buff.append("*");
			}
			buff.append("\n");
		}
		JOptionPane.showMessageDialog(null, buff.toString());

  }
	
}

