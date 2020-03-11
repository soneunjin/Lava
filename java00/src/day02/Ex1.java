package day02;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
	Scanner as = new Scanner(System.in);
	System.out.print("원의 둘레를 구하는 정수를 입력하세요 : ");
	int wjd = as.nextInt();
	Scanner asdf = new Scanner(System.in);
	System.out.print("원의 둘레를 구하는 반지름을 입력하세요 : ");
	int ban = asdf.nextInt();
	Scanner asd = new Scanner(System.in);
	System.out.print("원의 둘레를 구하는 원주율을 입력하세요 : ");
	double arr = asd.nextDouble();
	
	System.out.println("원의 둘레는 :" + wjd * ban * arr +" 입니다.");
	
	Scanner a = new Scanner(System.in);
	System.out.print("정수 가로를 입력하세요 : ");
	int garo = a.nextInt();
	Scanner b = new Scanner(System.in);
	System.out.print("정수 세로를 입력하세요 : ");
	int sero = b.nextInt();
	System.out.println("사각형의 넓이는 : " + garo*sero + " 입니다.");
	
	System.out.println("삼각형의 넓이는 : " + garo*sero/2 + " 입니다.");
	
	
	
}
}