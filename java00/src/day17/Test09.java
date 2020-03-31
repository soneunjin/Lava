package day17;
import java.util.*;
public class Test09 {

	public Test09() {
		// HashMap
		// ģ���̸��� Ű�������ϰ� ��ȭ��ȣ�� �����ͷ� �ϴ� ���� ���� ����غ���.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ū��", "010-9999-9999");
		map.put("������", "010-3333-3333");
		map.put("����", "010-5555-5555");
		map.put("�ú�", "010-2222-2222");
		
		// Ű���� ��������. KeySet()
		Set<String> key = map.keySet();
		
		// ArrayList �� ��ȯ�ؼ� �̾ƺ���. Iterator�� ��ȯ�ؼ� ����ص� �ȴ�.
		ArrayList<String> kList = new ArrayList<String>(key);
		for(String k : kList) {
			// ���
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("---------------------------");
		System.out.println();
		// Map.Entry �� ����ؼ� Ű�� ������ ����غ���.
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		// ���� �����ʹ� ��� ��ȯ�� �Ǿ����� ������ ����غ���.
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		// ���� �ϳ��� ������.
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next();
			String k = ent.getKey();
			String val = ent.getValue();
			
			// ����ϰ�...
			System.out.println(k + " : " +val);
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
