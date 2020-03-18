package day08;
import javax.swing.*;
import java.util.*;
/*
  ���� 0]
 	
 	�������� ����ϴµ�
 	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���
 	-----------
 	|��	|	|��|
 	-----------
 	int[] dan = {2,3...,9};
 	int[] gop = {1,2,...,9};
 	-- �ʱ�ȭ�� �ݺ�������
 	
 	int[][]gugudan ={dan,gop};
 	
 	������´�
 		2 X 1 = 2
 		...
 		2 X 9 = 18
 		----------
 		3 X 1 = 3
 		....
 	
 
  ���� 1]
	
	�츮�� �л����� ������ �迭�� �����Ϸ��� �Ѵ�.
	�̸�, ��ȭ��ȣ, �̸����� �迭�� ���·� ����� �����ϰ�
	�ٽ� ������ �����͸� �����ؼ� �迭�� ����� ����ϼ���.
	
���� 2]
	
	����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�.(������ �����ϰ� �����ϼ���.)
	�л��� ���� 5���̰� 
	2���� �迭�� ����
	5���� ������ ������ �迭�� ���弼��.
	
���� 3]
	2������
	������ ������ ����� �߰��ؼ� �����Ϸ��� �Ѵ�.
	2�� ������ �迭�� ���̸� �������Ѽ� ó���ϼ���.
	
comm 1]
	
	"PengSoo Good!"
	�̶�� ���ڿ��� �ѹ��ھ� ������
	�迭�� �����ϰ�
	�ϳ��� ������ ����ϼ���.
	
comm 2]
	
	�ݾ��� �Է��ϸ�
	�ݾ׸�ŭ�� �ζǰ����� ������ִ� ���α׷��� �ۼ��ϼ���.
	�ζ� �Ѱ����� 1000���̰�, ���忡�� 5������ ����.
	�Է� �ݾ��� 1000�� ������ �ϱ�� �Ѵ�.
	��, �ζ� ��ȣ�� �������� �����ؼ� �����ϼ���.
	
	��]
		�Է±ݾ� : 8000��
		
		�ζ� :
			1,2,3,4,5,6			- 1����
			7,8,9,10,11,12		- 2����
			...
			11,12,13,14,15,16	- 5����
			--------------------------
			1,2,3,4,5,6			- 6����
			7,8,9,10,11,12		- 7����
			...					- 8����
	
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
		
		String[] name = {"��ҿ�","�ֵο�","�����","������","������","�Ӽ���"};
		String[] tel= {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555","010-8888-8888","010-9999-9999"};
		String[] mail = {"pengsoon@increpas.com","dDragon@increpas.com","victory@increpas.com","nobody@increpas.com","bell@increpas.com","leem@increpas.com"};

		
		String[] name1 = {"������","�����","����ö","������","�輺��"};
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
		
//		arr[0] = new String[] {"�����","����ö","������","������","�輺��"};
//		arr[1] = new String[] {"����","����","����","����","����"};
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
