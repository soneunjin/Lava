package day15;
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		String str = "create a repository, start a branch, write comments, open a pull request";
		String tmp = str;
		
		// , �� ��� �������� ī��Ʈ �Ѵ�.
		int cnt = 0;
		
		for(int i = 0 ; i < tmp.length() ; i++ ) {
			// ���ڸ� ���ھ� ������ ���� ��ǥ�� ������ ī��Ʈ�� �÷��ش�.
			if(tmp.charAt(i) == ',') {
				cnt += 1;
			}
		}
		
		// ���� ��ǥ�� ��� ������ �Ǿ����� �˾Ƴ�����
		// �迭�� �����
		String[] arr = new String[cnt + 1];
		// �ݺ��ؼ� �迭�� ��ǥ ���� �߶� �־��ְ� ��ǥ ������ tmp�� ��ü������.
		
		for(int i = 0 ; i < cnt; i++) {
			// ��ǥ�� ��ġ �˾Ƴ���
			int idx = tmp.indexOf(",");
			// ��ǥ �������� ���ڿ� �߶� �迭�� ���
			arr[i] = tmp.substring(0, idx);
			// tmp �� ���� ���ڿ��� ��ü�ϰ�
			tmp = tmp.substring(idx + 2);
		}
		// ������ ���ڿ� ä���ְ�
		arr[cnt] = tmp;
		
		System.out.println("�ڸ��迭 : " + Arrays.deepToString(arr));
		System.out.println(arr.length);
		
		for(String msg : arr) {
			System.out.println(msg);
		}
	}

}
