package day15;

import java.io.*;
import java.util.*;
public class Test07 {

	public Test07() {
		File f = new File("D:\\pre\\git\\Lava\\java00\\doc\\day15_src.txt");
	
		Scanner sc = null;
		String str = "";
		try {
			sc = new Scanner(f);
			str = sc.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
		StringTokenizer token = new StringTokenizer(str);
		
		int count = token.countTokens(); // �ڸ� ���ڿ��� ������ ��ȯ���ִ� �Լ�
		System.out.println("�ڸ� ���� : " + count);
		
		// ��������.
//		for(int i=0; i< count; i++) {
//			String tmp = token.nextToken();
//			System.out.println("�и��� ���� : " + tmp);
//		}
//		// �ٽ� ������
//		for(int i=0; i< count; i++) {
//			String tmp = token.nextToken();
//			System.out.println("�ٽò��� ���ڿ� : " + tmp);
//		}
//		
		// ���� StringTokenizer�� ����ϴ� ����� ���� ó�� ����Ѵ�.
		while(token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("�ٽ� �и��� ���ڿ� : " + tmp);
		}
	}
	public static void main(String[] args) {
		new Test07();
	}

}
