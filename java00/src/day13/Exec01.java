package day13;
import java.util.*;
/*
  	
 */
public class Exec01 {
	/*
	  	quiz ]
	  		�迭�� ���� ]
	  			1. �Ѱ��� Ÿ���� �����͸� �Է��� �� �� �ִ�.
	  			2. �迭�� ���̸� ������ �� ����.
	  			
	  	���� �̷� ������ �����ϰ��� ������� Ŭ������
	  	ArrayList �̴�.
	  	
	  	���ݺ��ʹ� �迭�� ��� �����ð�
	  	ArrayList�� ����ϸ� �ǰڽ��ϴ�.
	  	
	  	ArrayList ����ϴ� ��� ]
	  		
	  		ArrayList list = new ArrayList(); // ArrayList ��ü�� �����.
	  		list.add(������); �� �����͸� ä���.
	  		
	  		��������
	  			list.get(index);	�� �ε����� ����ؼ� ������ �ȴ�.
	  			
	  		�ε����� �Է����ִ� ������� �ڵ����� �ٿ����� �ȴ�.
	  		
	  			
	 */
	public Exec01() {
		ArrayList list = new ArrayList();
		
		list.add(new Class01());
		list.add(new Class02());
		list.add(new Class03());
		
		ArrayList list2 = new ArrayList();
		list2.add(new int[] {10,5});
		list2.add(new int[] {5,20});
		list2.add(new int[] {15});
		
		
		for(int i=0; i<list.size(); i++) {
			// Collection������ length ��� size()�� ����ؼ� ���̸� �����´�.
			Test01 t = (Test01) list.get(i);
			int[] arr = (int[]) list2.get(i);
			
//			System.out.println(t.calcArea((int[])list2.get(i)));
			System.out.println(t.calcArea(arr));
			
		}
		System.out.println("##################");
		abc();
		
	}
	
	// �ο�����
	public void abc() {
		Test01 t = new Class01();
		// ==> Class01 Ŭ������ Test01 Ŭ������ ����� �޾Ƽ� ���� Ŭ�����̹Ƿ�
		//		Class01 ���ο� Test01�� ����� ��� ���ԵǾ��ְ�
		//		���� ����� ������ �ش� Ŭ������ �� �� �����Ƿ�
		//		Test01 Ŭ������ �� �� �ִ�.
		
		Test01 t2 = new Class02();
		Test01 t3 = new Class03();
		
		ArrayList list2 = new ArrayList();
		list2.add(new int[] {10,5});
		list2.add(new int[] {5,20});
		list2.add(new int[] {15});
		
		
		// ���� ����ϱ�
		System.out.println(t.calcArea((int[])list2.get(0)));
		System.out.println(t2.calcArea((int[])list2.get(1)));
		System.out.println(t3.calcArea((int[])list2.get(2)));
		
		ArrayList list = new ArrayList();
		list.add(t);
		list.add(t2);
		list.add(t3);
		// �׷��� ArrayList �� �����͸� �Է��ϸ� �Էµ� �����͸� Object Ÿ������
		// �ڵ� ����ȯ �ؼ� ����ϹǷ�
		// �츮�� Test01 Ÿ������ �Է��� �ߴ���
		// Object Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����ȴ�.
		// ���� ������ �� ���� �ش� Ÿ�Կ� �´� ���·� ���� ����ȯ�� ���Ѽ� ����ؾ� �Ѵ�.
		
		// ���� ��Ģ�� �Ʒ�����ó�� ����ؾ� ������
		Class01 c1 = (Class01) list.get(0);
		Class02 c2 = (Class02) list.get(1);
		Class03 c3 = (Class03) list.get(2);
		
		// ==> Test01Ÿ���� ������ ����ص� �� ���̴�.
		Test01 tt1 = (Class01) list.get(0);
		Test01 tt2 = (Class02) list.get(1);
		Test01 tt3 = (Class03) list.get(2);
		
		
		
		// �׷��� �̰��� �ݺ��� ó�� �ݺ��ؼ� ����ؾ� �Ǵ� �����
		// ���� ����� �������� �ʴ�.
		// ���� �ݺ������� ó���� �Ϸ��� ����Ÿ������ ���� �����͸� ���� ����ȯ ���Ѿ� �� ���̴�.
		
		
		
		
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
