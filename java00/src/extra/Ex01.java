package extra;

/*
	 �л� ������ �����ϱ� ���� Ŭ������ �����ϼ���.
	 class name : Stud
	 ���� 
	 	String name;
	 	int no;
	 	int kor, eng, math, physics, cod, total;
	 	
	 ���������� ��ü�� ���鶧 �����ϰ� �ԷµǴ� ������ �ϰ�
	 ���� �ѹ����θ� �ϰ�
	 �����͸� �Է��ؼ�
	 ������ ���� ������ �����ؼ�
	 ����ϼ���.
	 
	 
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		ArrayList<Stud> list = new ArrayList<Stud>();
		String name[] = {"������","�����","����ö","�輺��","������","���̽�","������","�ڱ���","�̸�ȯ","������"}; 
		List<String> nameList = Arrays.asList(name);
		
		for(int i=0; i<10; i++) {
			String str = nameList.get(i);
			int no1 = (int)(Math.random()*101);
			int no2 = (int)(Math.random()*101);
			int no3 = (int)(Math.random()*101);
			int no4 = (int)(Math.random()*101);
			int no5 = (int)(Math.random()*101);
			list.add(new Stud(str,no1,no2,no3,no4,no5));
			
//			System.out.print("no1 : " + no1 + "\nno2 : " + no2 + "\nno3 : " + no3 + "\nno4 : "+ no4 + "\nno5 : "+no5);
//			System.out.println();
		}
		
		Collections.sort(list);
		for(Stud s : list) {
			System.out.print("�̸� : "+ s.getName()+" | "+" Kor : "+s.getKor() + " | " +"Eng : "+s.getEng() + " | " + "Math : "+s.getMath() + " | " + "physics : "+s.getPhysics() + " | " + "cod : "+s.getCod() + " | ");
			System.out.println("total : "+s.getTotal() + " | ");
		}
		System.out.println();
		

		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
