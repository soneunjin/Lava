package day18;

import java.util.*;

import java.io.*;

import javax.swing.*;

/*
  	문제 2]
  		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
  		을 저장할 VO 클래스를 만들고
  		
  		5학생의 데이터를 입력해서 관리할 Set을 만들어서
  		이름 순으로 출력하세요.
  		
 */
public class Ex02 {

	public Ex02() {
		TreeSet<Stud> set = new TreeSet<Stud>();
		String name[] = {"손은진","김수진","이진수","이한철","김성현"};
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
			System.out.print("이름 : " + s.getName() + "번호 : " + s.getNo() + "반 : " + s.getBan() + "국어 : " + s.getKor() + "영어 : " + s.getEng() + "수학 : " + s.getMath());
			System.out.println("총점 : " + s.getTotal() + "평균 : " + s.getAvg());
			
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
