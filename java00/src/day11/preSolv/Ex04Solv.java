package day11.preSolv;

public class Ex04Solv {
	
	public Ex04Solv() {
		// ���� �ټ����� �̸��� ������ �迭�� ������.
		String[] name = {"������","�ڱ���","������","�ڱ�ȣ","����ö","�߰���"};
		
		// �ټ����� �����͸� ������ �迭�� �����.
		Stud[] ban = new Stud[name.length];
		
		
		ban = setArr1(ban,name);
		
		// �迭�� �ϼ��� �Ǿ���
		// �����غ���.
		
		ban = setSort1(ban);
		
	
		
		// ����Ѵ�.
		System.out.printf("%6s : %3s | %3s | %3s | %3s | %4s | %5s | %5s   |\n","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
		System.out.println();
		System.out.println("**************************************************");
		System.out.println();
		setArr(ban,name);
		setSort(ban);
	
		
		System.out.printf("%6s : %3s | %3s | %3s | %3s | %4s | %5s | %5s   |\n","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��","��  ��");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}

	
	// �����μ��� �̸��� �Է¹޾Ƽ� �迭�� �������ִ� �Լ��� ����� ����.
	// �׷��� �����μ��� �տ��� �Ϲ� ������ �͵� ���������, �ڿ��� ���� ����� �ȵȴ�.
	public Stud[] setArr1(Stud[] s, String...name) {
		for(int i = 0; i <name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		return s;
		
	}
	
	public void setArr(Stud[] s,String...name) {
		for(int i = 0; i <name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		
	}
	
	// Stud Ÿ���� �迭�� �Է����ָ� �������ִ� �Լ��� ������.
	public void setSort(Stud[] s) {
		
		for(int i=0; i<s.length - 1;i++) {
			
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
					
				}
			}
		}
	
	}
	public Stud[] setSort1(Stud[] s) {
		
		for(int i=0; i<s.length - 1;i++) {
			
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
					
				}
			}
		}
		
		return s;
	}

	public static void main(String[] args) {
		new Ex04Solv();

	}

}
