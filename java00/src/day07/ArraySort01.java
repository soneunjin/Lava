package day07;

import java.util.*;

import javax.swing.*;

/*
  	���� ]
  		�ζ� �� ������ ���� �迭�� ���
  		���� ��ȣ���� �����ؼ�
  		��� �����͸� ����غ���.
  		
  		�ζ� �� ������
  			1 ~ 45 ������ ���ڰ� 6�� �� �ʿ��ϴ�.
 */
public class ArraySort01 {

	public static void main(String[] args) {
		// ����
		// 1. ���� 6���� ����� �迭�� �����.
		int[] Lotto = new int[6];
		loop:
		for(int i = 0; i<Lotto.length; i++) {
			// 2. �迭�� �����ϰ� ������ ����
			Lotto[i] = (int)(Math.random()*45)+1;
			
		// 3. ������ ������� ���� ��ȣ�� �ִ��� üũ�ϰ�
			for(int j=0; j<i; j++) {
				if(Lotto[j] == Lotto[i]) {
				i--;
				continue loop;
			}
		}
		// �� �κ��� �����ϴ� ���� ���� �ݺ����� ��� ������ �� ����
		// �� �ǹ̴� ���� ��ȣ�� �������� ���ٴ� �ǹ��̹Ƿ�
		// 4. �� �濡 �� ��ȣ�� �����ϰ�
		}
		// 5. ����ϰ�
//		JOptionPane.showMessageDialog(null, "��÷ ! "+Arrays.toString(Lotto));
		// 6. ������ �ϰ�
		for(int i=0;i<Lotto.length - 1; i++) {
			// ���⼭ ���� �����ʹ� �� ������ �����ʹ� ���� �ʿ䰡 �����Ƿ� 
			// �� ������ �ٷ� ���������� �̾Ƽ� �����ָ� �ȴ�.
			
			// ���� ������ ���ĺ��� �� ���������� �ϳ��� ������ ���Ѵ�.
			for(int j= i+1; j<Lotto.length;j++) {
				if(Lotto[i] > Lotto[j]) {
					// �� ���� �ڿ��� �̾ƿ� �����Ͱ� �� ���� ����̹Ƿ�
					// ���� �ڸ��� �����͸� ��ü �ؾ� �Ѵ�.
					// �� �� ���� �ڸ��� �����͸� ��ü �ϴ� ���� ���� �������� ����� ������Ƿ�
					// ������ �ּҸ� ������ ���´�.
					int tmp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = tmp;
				}
				
			}
		}
//		Arrays.sort(Lotto);
		// 7. ����ϰ�
		JOptionPane.showMessageDialog(null, "<html><b style=\"color:green;\">*** ��÷ ���� ��ȣ ***</b></html>\n"+Arrays.toString(Lotto));
	}

}
