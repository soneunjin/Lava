package day04;
import java.util.*;
/*
  	4�ڸ� ���ڷε� �⵵�� �Է¹޾Ƽ�
  	�������� ������� �Ǵ��ؼ� ����ϼ���.
  	��, switch ~ case �������� ó���ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("4�ڸ� �⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		String str = "���";
		int code = 0;
	/*	if(year % 400 == 0) {
			code = 3;
		} else if (year % 100 == 0) {
			code = 2;
		} else if (year % 4 == 0) {
			code = 1;
		}
	*/	
		/*switch(code) {
		case 3:
			str = "����";
			break;
		case 2:
			break;
		case 1:
			str = "����";
			break;
		default:
		}
	*/
		/*
		switch(year % 400) {	
		case 0:
			str = "����";
			break;
		default:
		switch(year % 100) {
		case 0:
			break;
		default:
			str = "����";
		switch(year % 4) {
		case 0:
			str = "����";
			break;
		default:
			
		}
			
		
		}
		
			
	}
*/		
		
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			code = 1;
		}
		switch(code) {
		case 1:
			str ="����";
			break;
		default:
			
		}
			
		
		System.out.println("�ش� �⵵�� [ " + str + " ] �Դϴ�.");
	}
}
