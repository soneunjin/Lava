package day02;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
	Scanner as = new Scanner(System.in);
	System.out.print("���� �ѷ��� ���ϴ� ������ �Է��ϼ��� : ");
	int wjd = as.nextInt();
	Scanner asdf = new Scanner(System.in);
	System.out.print("���� �ѷ��� ���ϴ� �������� �Է��ϼ��� : ");
	int ban = asdf.nextInt();
	Scanner asd = new Scanner(System.in);
	System.out.print("���� �ѷ��� ���ϴ� �������� �Է��ϼ��� : ");
	double arr = asd.nextDouble();
	
	System.out.println("���� �ѷ��� :" + wjd * ban * arr +" �Դϴ�.");
	
	Scanner a = new Scanner(System.in);
	System.out.print("���� ���θ� �Է��ϼ��� : ");
	int garo = a.nextInt();
	Scanner b = new Scanner(System.in);
	System.out.print("���� ���θ� �Է��ϼ��� : ");
	int sero = b.nextInt();
	System.out.println("�簢���� ���̴� : " + garo*sero + " �Դϴ�.");
	
	System.out.println("�ﰢ���� ���̴� : " + garo*sero/2 + " �Դϴ�.");
	
	
	
}
}