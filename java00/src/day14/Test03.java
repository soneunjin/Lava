package day14;
import javax.swing.*;
public class Test03 {

	public Test03() {
		// getNum() �� ���ܸ� �����ϴ� �Լ��̹Ƿ�
		// �̷� ���������Լ��� �ݵ�� ����ó���� ����� �Ѵ�.
		
		
		int num = 0;
		try {
			num = getNum();
			
		} catch(NumberFormatException e) {
			// ����Ŭ������ ��� �� ���� ���������� ����ϴ� ���� ��Ģ�̴�.
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���ڸ� �Է¹޾Ƽ� ������ ��ȯ���ִ� getNum() �Լ�
	public int getNum() throws NumberFormatException{
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		int num =0;
		
		// ���ڸ� �Է¹޾Ƽ� ���ڿ��� ���
		String str = JOptionPane.showInputDialog("���ڸ� �Է����ּ���");
		
		// ���ڿ��� ������ ��ȯ�ϰ�
		num = Integer.parseInt(str);
		
		if(num <0) {
			// ���� ���� �߻���Ű��...
			//	���� ]
			//		throw new ����Ŭ����������();
			throw new NumberFormatException();
		}
		/*
		  	num ������ �����͸� ���� ��� ���ܰ� �߻��� �� �ִ�.
		  	���� ��Ģ�� �� �κ��� ����ó���� �ؾ� ������
		  	�̹����� �� �Լ��� ȣ���� ������ ����ó���� ���ѱ��.
		  	
		 */
		
		// ������ �Ѱ��ְ�
		return num;
		
	}
	public static void main(String[] args) {
		new Test03();
		
	}

}
