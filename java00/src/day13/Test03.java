package day13;

public class Test03 {
	int no = 100;
	static class Cls01 {	// top Level Inner Class
		String name = "������";
	}
	
	class Cls02{
		int num = no;
	}
	public Test03() {
		hw(new Inter01(){	// ���� ���� Ŭ����
			public void toPrint() {
				System.out.println("** ����� �͸� ���� Ŭ����  **");
			}
		});
		
		abc();
	}
	
	public void abc() {
		int b = 10;
		
		Cls02 c2 = new Cls02();
		
		class Cls03{
			int c = 100;
			public void xyz() {
				System.out.println("*************");
			}
		}
		
		Cls03 c3 = new Cls03();
		
		c3.xyz();
	}
	
	
	
	public static void main(String[] args) {
		new Test03();
	}
	// Ŭ���� �� ���� ��������� Ŭ������ ���� Ŭ������ �Ѵ�.
	
	public void hw(Inter01 i) {
		i.toPrint();
	}
}

class Test03_01{ // �ܺ�Ŭ����
	
	public Test03_01() {
		Test03.Cls01 t1 = new Test03.Cls01();
		
		Test03 t2 = new Test03();

		
	}
	
	
}