package day17;

import java.util.*;

public class HwSort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 1. �ﰢ�� Ÿ������ ���� ����ȯ �ϰ�
		Samgak s1 = (Samgak) o1;
		Samgak s2 = (Samgak) o2;
		// 2. ���� ���ؼ� ����� ����
		int result = (int)(s1.getArea() - s2.getArea());
		// 3. ��ȯ���ְ�
		return result;
	}

}
