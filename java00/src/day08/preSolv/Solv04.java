package day08.preSolv;
import javax.swing.*;
import java.util.*;
/*
  	���� 4]
	��ȭ��ȣ�� �Է��ϸ�
	'-'�� �������� �����͸� �и��ؼ�
	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
	indexOf(),substring()

 */
public class Solv04 {

	public static void main(String[] args) {
		// ��ȭ��ȣ�� xxx-xxxx-xxxx �� �������� �Է¹��� ���̰�
		
		// �� ��ȣ�� ���ڿ��� �����ϰ�
		
		// ���ڿ��߿�  - �� ������ŭ �ݺ��ؼ�
		
		// ��ȣ�� ������ �迭�� �����ϸ� �ȴ�.
		
		// 1. ���� �Է¹޾Ƽ� ������ �����ϰ�
		String phone = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ��� ! : ");
		// 2. '-' �� ������ ī��Ʈ�ϰ�
		int cnt = 0;
		
		for(int i=0; i< phone.length(); i++) {
			char ch = phone.charAt(i);
			if(ch < '0' || ch > '9' ) ++cnt; 

		}
		// 3. �и��� ���ڿ��� �Է��� �迭�� �����
		//	==> ��ȭ��ȣ�� �и��� �ϰ� �Ǹ� '-'�� �������� 1���� �� ���� ���ڿ��� �и��� �ȴ�.
		String arr[] = new String[cnt + 1];
		// 4. �迭�� ���ڿ��� �߶� �Է��ϰ�
		// �߷��� ���ڿ��� ������ ����(�۾��� ����) �����.
		// ó������ ��ü ���ڿ��� ��� ������ �Ǿ�� �� ���̴�.
		String tmp = phone;
		int idx = 0; 
		
		for(int i=0; i < cnt; i++) {
			// '-' �� �ε����� �˾Ƴ���.
//			idx = tmp.indexOf('-');
			
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j) < '0' || tmp.charAt(j) > '9') {
					idx = j;
					break;
				}
			}
			// ���� '_'�� �ε����� �˾Ƴ�����
			// '_' ���������� ���ڿ��� �����س��� �ȴ�.
			arr[i] = tmp.substring(0,idx);
			
			// ���� �� ��ȣ�� �ٽ� ©�� tmp���� ������ ����
			// �ٽ� ���� ��ɵ��� �ݺ��ϸ� �ȴ�.
			tmp = tmp.substring(idx+1);
			
			
		}
		arr[cnt] = tmp;
		// 5. ����ϰ�
		JOptionPane.showMessageDialog(null, "�Է��� ��ȣ : " + phone +
											"\n�и��� ���� �迭 : " + Arrays.toString(arr));
		
		
		
		

	}

}
