package day15;

import java.io.*;
import java.util.*;
public class Test06 {

	public Test06() {
		File f = new File("D:\\pre\\git\\Lava\\java00\\doc\\ScannerTest.txt");
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(f);
			String str = scan.nextLine();
			System.out.println("�� ���� ���� : " +str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
