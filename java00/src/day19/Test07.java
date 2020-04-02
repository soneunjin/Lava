package day19;
/*
 	������ ���Ͽ� �����ϴ� ���α׷��� �ۼ��ϼ���.
 	��, ������Ʈ�� Buffered ��Ʈ���� ����ϼ���.
 */
import java.io.*;
import javax.swing.*;
public class Test07 {

	public Test07() {
	// 1. ���Ϸ� �������� ��Ʈ���� �غ��Ѵ�.\
	FileOutputStream fout = null;
	// 2. �ʿ信 ���� ������Ʈ���� ������ �� �ִ�.
	BufferedOutputStream bout = null;
	try {
		fout = new FileOutputStream("src/day19/etc/buffer_test.txt");
		bout = new BufferedOutputStream(fout);
		
		// ������ ������ �غ�
		String str = "�Ϳ��⸸ �ϱ���";
		byte[] buff = str.getBytes();
		
		// ���� ���ۿ� ���� ���ϱ��� �����Ͱ� �Ѿ ���̴�.
		bout.write(buff);
		// ���� ���۰� ä������ �ʾ����Ƿ� ������ ������ FileOutfutStream���� ���޵��� �ʾҴ�.
		// ���� ���� ������ �ȵƴ�.
		
		// �̷� ��� �ʿ��� ����� ������ ������ ������ ��� �����ִ� ����ε�
		bout.flush();
		// ���� ���۵� ��Ʈ���� ����� ��쿡�� ���������� flush()�� �����ؾ� �Ѵ�.
		
		JOptionPane.showMessageDialog(null, "����Ϸ�");
	} catch(Exception e) {
		JOptionPane.showMessageDialog(null, e.toString());
	} finally {
		try {
			bout.close();
			fout.close();
		} catch(Exception e) {}
	}
	
	
	
	
	}

	public static void main(String[] args) {
		new Test07();
	}

}
