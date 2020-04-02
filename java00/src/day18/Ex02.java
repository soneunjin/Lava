package day18;

import java.util.*;

import java.io.*;

import javax.swing.*;

/*
  	���� 2]
  		�л��� �̸�, ��ȣ, ��, ����, ����, ����, ����, ���
  		�� ������ VO Ŭ������ �����
  		
  		5�л��� �����͸� �Է��ؼ� ������ Set�� ����
  		�̸� ������ ����ϼ���.
  		
 */
public class Ex02 {

	public Ex02() {
		TreeSet<Stud> set = new TreeSet<Stud>();
		String name[] = {"������","�����","������","����ö","�輺��"};
		for(int i=0; i<5; i++) {
			String str = name[i];
			int no = i+1;
			int ban = (int)(Math.random()*3)+1;
			int kor = (int)(Math.random()*101);
			int eng = (int)(Math.random()*101);
			int math = (int)(Math.random()*101);
			set.add(new Stud(str,no,ban,kor,eng,math));
			
		}
		for(Stud s : set) {
			System.out.print("�̸� : " + s.getName() + "��ȣ : " + s.getNo() + "�� : " + s.getBan() + "���� : " + s.getKor() + "���� : " + s.getEng() + "���� : " + s.getMath());
			System.out.println("���� : " + s.getTotal() + "��� : " + s.getAvg());
			
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
