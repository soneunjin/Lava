package day08;
import javax.swing.*;
import java.util.*;
/*
  문제 0]
 	
 	구구단을 출력하는데
 	단과 곱을 배열을 만들어서 처리하고 출력하세요
 	-----------
 	|단	|	|곱|
 	-----------
 	int[] dan = {2,3...,9};
 	int[] gop = {1,2,...,9};
 	-- 초기화는 반복문으로
 	
 	int[][]gugudan ={dan,gop};
 	
 	출력형태는
 		2 X 1 = 2
 		...
 		2 X 9 = 18
 		----------
 		3 X 1 = 3
 		....
 	
 
  문제 1]
	
	우리반 학생들의 정보를 배열로 관리하려고 한다.
	이름, 전화번호, 이메일을 배열의 형태로 만들어 관리하고
	다시 팀별로 데이터를 정리해서 배열을 만들고 출력하세요.
	
문제 2]
	
	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다.(점수는 랜덤하게 추출하세요.)
	학생의 수는 5명이고 
	2차원 배열로 만들어서
	5명의 점수를 저장할 배열을 만드세요.
	
문제 3]
	2번에서
	점수의 총점과 평균을 추가해서 관리하려고 한다.
	2번 문제의 배열의 길이를 증가시켜서 처리하세요.
	
comm 1]
	
	"PengSoo Good!"
	이라는 문자열을 한문자씩 꺼내서
	배열로 저장하고
	하나씩 꺼내서 출력하세요.
	
comm 2]
	
	금액을 입력하면
	금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요.
	로또 한게임은 1000원이고, 한장에는 5게임이 들어간다.
	입력 금액은 1000원 단위로 하기로 한다.
	단, 로또 번호는 오름차순 정렬해서 저장하세요.
	
	예]
		입력금액 : 8000원
		
		로또 :
			1,2,3,4,5,6			- 1게임
			7,8,9,10,11,12		- 2게임
			...
			11,12,13,14,15,16	- 5게임
			--------------------------
			1,2,3,4,5,6			- 6게임
			7,8,9,10,11,12		- 7게임
			...					- 8게임
	
 */
public class Ex01 {

	public Ex01() {
//		solv0();
//		solv1();
		solv2();
	}
	public void solv0() {
		int dan[] = new int[8];
		int gop[] = new int[9];
		int [][] gugudan = {dan,gop};
		
		for(int j=0;j<9;j++) {
			gop[j] = j+1;
		}
		for(int i=1;i<9;i++) {
				dan[i-1] = i+1;
			
		}
		
		for(int i=0; i < gugudan[0].length;i++) {
			
			for(int j = 0 ; j < gugudan[1].length ; j++ ) {
				System.out.println(gugudan[0][i] + " x " + gugudan[1][j] + " = " + (gugudan[0][i]*gugudan[1][j]));
			}
			System.out.println("-------------------");
		}
		
	}
	public void solv1() {
		String[][][] team = new String[2][3][];
		
		String[] name = {"김소영","최두용","정우승","유태희","김종형","임서진"};
		String[] tel= {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555","010-8888-8888","010-9999-9999"};
		String[] mail = {"pengsoon@increpas.com","dDragon@increpas.com","victory@increpas.com","nobody@increpas.com","bell@increpas.com","leem@increpas.com"};

		
		String[] name1 = {"손은진","김수진","이한철","이진수","김성현"};
		String[] tel1 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555","010-8888-8888","010-9999-9999"};
		String[] mail1 = {"pengsoon@increpas.com","dDragon@increpas.com","victory@increpas.com","nobody@increpas.com","bell@increpas.com","leem@increpas.com"};

		for(int i=0;i<team.length;i++) {
			for(int j=0; j<name[i].length(); j++) {
			team[0][0][i] = name[i];
			team[0][0][i] = tel[i];
			team[0][0][i] = mail[i];
		}
		}
		for(int j=0; j<team.length;j++) {
			team[1][0][j] = name1[j];
			team[1][0][j] = tel1[j];
			team[1][0][j] = mail[j];
		}
		
		System.out.println(Arrays.deepToString(team));
		
	}
	
	public void solv2() {
		
//		arr[0] = new String[] {"김수진","이한철","손은진","이진수","김성현"};
//		arr[1] = new String[] {"국어","수학","영어","물리","역사"};
		int[][] arr = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				int score = (int) (Math.random()*(100))+1;
				arr[i][j] = score;
				
				
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println();
		
	}
		
		
		
	
	public static void main(String[] args) {
		new Ex01();

	}

}
