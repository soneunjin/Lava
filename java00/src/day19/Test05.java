package day19;

/*
 ����5]
 	1. day/etc�� �����ϳ��� ������ �����.
 		day/etc/snue
 	2. ��λ� ���� �������� �Ѳ����� �����.
 		day/etc/zzz/abc
 	3. ������� ���� �� �ϳ��� �����Ѵ�. (����, ���� ���� ����)
 	4. Ư�� ������ �̸��� �ٸ��̸����� ��������.
 */

import java.io.*;
import javax.swing.*;
public class Test05 {

	public Test05() {
		// ����� ���� ����(��� ��) ���Ϸ� �����.
		
		/*
		// 1. 
		File file = new File("src/day19/etc/snue");
		file.mkdir();
		
		// 2.
		File file = new File("src/day19/etc/zzzz/abc");
		file.mkdirs();
		 */
		
		// 3.
		File file = new File("src/day19/etc/zzzz/abc");
		file.delete();
		
		// 4.
		File oldF = new File("src/day19/etc/sample.txt");
		File newF = new File("src/day19/etc/sample.increpas");
		
		// �ٲ��ش�.
		oldF.renameTo(newF);		
		
		
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}
}
