package day15;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = {10,5,7,15,8};
		
		// �迭 arr�� �����ϼ���.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.fill(arr,10);
		System.out.println(Arrays.toString(arr));
	}

}
