package day04;
import java.util.*;
/*
  	���� 4]
  		5�ڸ� ������ �Է¹޾Ƽ�
  		�� ���ڰ� ȸ�������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
  		
  		ȸ������?
  			�տ��� ������ �ڿ��� ������ �Ȱ��� ���� ȸ������ �Ѵ�.
  			��]
  				12321 - ȸ����
  		����]
  			���ڿ�.charAt(��ġ��) - ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ�
  			���ڿ�.toCharArray() - ���ڿ��� ���ڹ迭�� ��ȯ���ִ� �Լ�
  			
  		�ݺ��� ���� ���]
  		
  			1. break 	- �ݺ��� �Ǵ� switch ���� �����Ű�� ���
  			
  			2. continue - �ݺ����� �ٽ� �����Ű�� ���
  				
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5�ڸ� ������ �Է��ϼ��� : ");
		
		String result = "ȸ����";
		String no = sc.nextLine();
			for(int i =0; i<no.length() /2; i++) {
				if(no.charAt(i) == no.charAt((no.length() -1) - i)) {
					continue;
					
				}
				result = "ȸ������ �ƴ�";
				break;
			}
			System.out.println(result);

	}

}
