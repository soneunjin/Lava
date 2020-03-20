package day10;
import java.util.*;
import javax.swing.*;
/*
 * 문제 4]
	
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	
	심화]
		랜덤하게 인원수를 만들고
		그 인원수 만큼 점수를 랜덤하게 만들어서
		함수를 실행하게 하세요.			
 */
public class Ex02 {
	
	int sum;
	
	public Ex02() {
		getSum();
		
	}
	public void getSum(int...no1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int no = sc.nextInt();
		
		int total = 0;
		for(int i=0; i<no1.length; i++) {
			no1[i] = no;
			
			sum += no;
		
			
		}
		sum = total;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Ex02();
		
	}

}
