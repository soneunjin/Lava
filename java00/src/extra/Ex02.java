package extra;

/*
	문제 2 ]
		사각형 클래스를 만들고
		사각형의 가로길이가 같으면 같은 클래스로 처리되도록 하세요.
		==> equals() 오버라이드 하세요...
		
		
		그리고 각각 다른 사각형 5개를 컬렉션에 저장하고 출력하세요.
		
		
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
		System.out.println("실패횟수 : " +((cnt+1)-5));
	
		for(Sagak s : list) {
			System.out.print("width : " + s.getWidth() + " height : " + s.getHeight());
			System.out.println(" area : " + s.getArea());
		}
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
