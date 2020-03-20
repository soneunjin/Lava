package day10;

public class One {
	One[] one;

	int ban;
	double ra;
	double area;
	
	
	public void setOne() {
		one = new One[10];
		
		for(int i=0; i<one.length; i++) {
			one[i] = new One();
			
			int no1 = (int)(Math.random()*(33-29+1))+29;
			one[i].setVaEl(no1);	
		}

	}
	public void setVaEl(int no1) {
		ban = no1;
		ra = 2*no1*3.14;
		area = no1*no1*3.14;
		
	}
	public void toPrintn() {
		System.out.printf("\n반지름 : %3d,\n둘레 : %3f,\n넓이 : %10f\n", ban, ra, area,"----------");
		
	}
	
	public static void main(String[] args) {
			One t = new One();
			
			t.setOne();
			
			for(int i=0; i<t.one.length; i++) {
				t.one[i].toPrintn();
			}
			System.out.println("\n##########");
			
	}

}
