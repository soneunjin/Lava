package extra;

/*
	���� 2 ]
		�簢�� Ŭ������ �����
		�簢���� ���α��̰� ������ ���� Ŭ������ ó���ǵ��� �ϼ���.
		==> equals() �������̵� �ϼ���...
		
		
		�׸��� ���� �ٸ� �簢�� 5���� �÷��ǿ� �����ϰ� ����ϼ���.
		
		
 */
import java.util.*;
public class Ex02 {
	
	public Ex02() {
		HashSet<Sagak> list = new HashSet<Sagak>();
		int cnt = 0 ;
		for(;;) {
			System.out.println(cnt++);
			int width = (int)(Math.random()*6 + 5);
			int height = (int)(Math.random()*6 + 5);
			list.add(new Sagak(width,height));
			if(list.size() == 5) {
				break;
			}
		}
		System.out.println("����Ƚ�� : " +((cnt+1)-5));
	
		for(Sagak s : list) {
			System.out.print("width : " + s.getWidth() + " height : " + s.getHeight());
			System.out.println(" area : " + s.getArea());
		}
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
