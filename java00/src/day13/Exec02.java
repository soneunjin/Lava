package day13;
import java.util.*;
import java.lang.Math.*;
public class Exec02 {

	public Exec02() {
		ArrayList list = new ArrayList();
		
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Semo());
		
		ArrayList list2 = new ArrayList();
		
		
		for(int i=0; i<10; i++) {
		
			int garo = (int)(Math.random()*10+1);
			int sero = (int)(Math.random()*10+1);
			list2.add(new int[] {garo,sero});
		
		}
//		
//		for(int j=0; j<10; j++) {
//		for(int i=0; i<list.size(); i++) {
//			Figure t = (Figure) list.get(i);
//			int[] arr = (int[]) list2.get(i);
//			
//				System.out.println(t.Area(arr));
//
//			}
		
//			System.out.println("----------------------");
//		}
		
		
		
		ArrayList flist = new ArrayList();
		
		for(int i=0; i<10; i++) {
			int no = (int)(Math.random()*3+1);
			Figure f;
			if(no == 1) {
				f = new Nemo();
			} else if(no == 2) {
			f = new Semo();
			} else {
				f = new Won();
			}
			
			f.Area((int[]) list2.get(i));
			flist.add(f);
		}
		
		
		
		for(Object o : flist) {
			Figure f = (Figure) o;
			f.toPrint();
		}
			

	}
	
	
	public static void main(String[] args) {
		new Exec02();
	}

}
