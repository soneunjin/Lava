package day06;
import java.util.*;
/*
 * ����7]

	���ڿ��� �Է¹޾Ƽ�
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���.
	
	"hong"
	
	------------
	|'h'|'o'|'n'|'g'|
	
	
	����]
		���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
		
		���ڿ�.charAt(��ġ��)
		
		���ڿ��� ���̸� ��ȯ���ִ� �Լ�
			
			���ڿ�.length(); 
			
		��ȯ���� ����
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		char arr[] = new char[str.length()];
		
		for(int i=0; i<str.length();i++) {
			arr[i] = str.charAt(i);
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		}
		
		

	}


