package day10;
/*
  	Nemo Ŭ������ 5�� ������ �迭�� �����
  	���� ���δ� 1 ~ 29 ���� �����ϰ� ���� �迭�� �ϼ�����.
  	
  	�׸��� �� �׸��� ����, ����, ���̸� ����غ���.
  	
 */
public class Test03 {
	// Nemo �迭������ ������
	Nemo[] nemo;
	
	// �׸� �ʱ�ȭ�ϴ� �Լ��� ������.
	public void setNemo() {
		// ���� �迭�� �ʱ�ȭ ���ش�.
		nemo = new Nemo[5];
		
		// ���� nemo���� �����ʹ� ä���� ���� �ʰ� �����Ͱ� �� �游 ����� ���� ���´�.
		// �� �濡 �����͸� �־�����.
		for(int i=0; i<nemo.length; i++) {
			// �ݺ����� �ѹ� �ݺ��ɶ� ����
			// Nemo Ŭ������ �ν��Ͻ��� ���� ���濡 �־���� �Ѵ�.
			nemo[i] = new Nemo();
			
			// Nemo �ν��Ͻ��� ����� �״µ� ���� ����, ����, ���̴� �Է� ���� �ʾҴ�.
			// ���� ���� ���� ���� ���̴� 0���� ������ �Ǿ��ִ�.
			// ���� ���� ���� ���̸� ������ ������. �츮�� �װ��� ����� ����� �����Ƿ� �� ����� ����� ����.
			// ���� ���� �ΰ��� �����.
			int garo = (int)(Math.random()*29)+1;
			int sero = (int)(Math.random()*29)+1;
			nemo[i].setVal(garo, sero);
		}
	}
	
	public static void main(String[] args) {
		Test03 t = new Test03(); // ���� ������� nemo�� ���õǾ� ���� �ʴ�.
		Test03 t1 = new Test03(); // ���� ������� nemo�� ���õǾ� ���� �ʴ�.
		
		t.setNemo(); // nemo �� �������ش�.
		
		// ������ش�. �츮�� ��������� ������ ������ִ� �Լ��� ����� �״�. �װ��� ȣ������.
		
		for(int i=0; i<t.nemo.length; i++) {
			t.nemo[i].toPrint();
		}
		System.out.println();
		System.out.println("##########");
		/*
		for(int i=0; i<t.nemo.length; i++) {
			t1.nemo[i].toPrint();
		}
		*/	
	}

}
