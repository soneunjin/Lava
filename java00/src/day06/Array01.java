package day06;
import java.util.*;

/*
 		1 ���� 5���� ����� �迭�� ����� ������ ����ϼ���.
  */
public class Array01 {

	public static void main(String[] args) {
		// ������ �����Ѵ�.
		int[] num;
		// ������ �迭�� ����� ����Ų��.
		num = new int[] {1,2,3,4,5};
		
		int[] num2 = {1,2,3,4,5};
		
		for(int i=0; i< num.length; i++) {
			int no = num[i];
			// �迭�� �� �濡 ���� �����͸� ������ ����� "�迭����[��ġ]"
			System.out.print(no+",");
	
		}
		System.out.println();
		String str = Arrays.toString(num);
		System.out.print("Arrays.toString()"+str);
		
		System.out.println("num : " + num);

	}

}
