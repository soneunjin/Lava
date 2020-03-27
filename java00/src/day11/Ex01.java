package day11;

public class Ex01 {
/*
 * 	���� 3]
 * 		���� 1,2������ ���� Ŭ������ ��ü�� ����
 * 		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 */
	public Ex01() {
		// �� 10���� ���� ��������.
		Circle[] won = new Circle[10];
		for(int i=0; i<won.length; i++) {
			if(i < 5) {
			won[i] = new Circle((int)(Math.random()*16 + 5));
			} else {
				won[i] = new Circle();
			}
		}
		
		// �� ����ϱ�
		for(int i=0; i< won.length; i++) {
			won[i].toPrint();
		}
		System.out.println("**********************************");
		
		// ���� Ŭ���� �����
	/*	
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("������");
		score[2] = new Score("�ؼ���",100,100,100,100,95,80);
		
		for(int i=0; i<score.length; i++) {
			score[i].toPrint();
		}
	*/	
		
		
		String[] name = {"������","������","�ڱ�ȣ"};
		
		Score[] ban = new Score[3];
		
		ban = setArr(ban,name);
		
		System.out.printf("%s : %3s | %3s | %3s | %3s | %4s | %5s | %5s   |\n","�̸�","java","oracle","html","javascript","jsp","spring","total","avg");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	
		}
		
		
	
	public Score[] setArr(Score[] s, String...name) {
		for(int i=0; i<name.length; i++) {
			s[i] = new Score(name[i]);
		}
		return s;
	}
		
//		Score s = new Score();
//		Circle c = new Circle();
//		
//		s.toPrint();
//		c.toPrint();
	
	public static void main(String[] args) {
		new Ex01();

		
	}

}
