package day12;

public class Test05 {	
	public Test05() {
		Emp e1 = new Emp();
//		e1.sal = 10000; // ������ ���������ڰ� private �̱� ������ �ٷ� ������ �Ұ����ϴ�.
		e1.setEmpno(10000);
		int eno = e1.getEmpno();
	}
	public static void main(String[] args) {
		new Test05();
	}

}
