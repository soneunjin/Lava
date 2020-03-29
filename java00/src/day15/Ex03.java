package day15;
import java.lang.*;
public class Ex03 {

	public static void main(String[] args) {
		// Stringbuffer 활용.
		
		// 1. 객체의 끝에 다른 데이터 타입의 데이터를 문자열로 삽입하기 위해서는 insert 메소드를 이용한다.
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("values");
		sb.append("(");
		sb.append("tiger");
		sb.append("1234");
		sb.append("홍길동");
		sb.append("20");
		sb.append(")");
		System.out.println(sb);
		// 2. int capacity() 메소드는 StringBuffer 객체에 할당된 총 용량 크기를 구하고자 할 때 사용한다.
		//    int length() 메소드는 StringBuffer 객체의 현재 길이를 알고자 할 때 사용한다.
		System.out.println("capacity : " + sb.capacity());
        System.out.println("length : " + sb.length());

        sb.setLength(2);
        System.out.println("setLength : " + sb);

		// 3. char charAt() 객체의 문자(char)를 조회 및 교체가 가능하다.
        //	  setCharAt()
        StringBuffer sb1 = new StringBuffer("abcde");
        System.out.println("charAt(3) : " + sb1.charAt(3));

        sb1.setCharAt(4, 'f');
        System.out.println("setChatAt(4, 'f') : " + sb1);
        
        // 4.객체의 끝에 다른 데이터 타입의 데이터를 문자열로 변환하여 첨부하기 위해서는 append 메소드를 이용한다.
        boolean b = true;
        char c = 'a';
        double d = 1.1;
        float f = 3.14f;
        int i = 1;
        long l = 2;
        String str = "A";

        StringBuffer sb2 = new StringBuffer();
        sb2.append(b).append(", ");
        sb2.append(c).append(", ");
        sb2.append(d).append(", ");
        sb2.append(f).append(", ");
        sb2.append(i).append(", ");
        sb2.append(l).append(", ");
        sb2.append(str);

        System.out.println(sb2);
        
        // 5. StringBuffer reverse() 객체의 문자열을 역순으로 반환한다.
        System.out.println(sb.reverse());
        
        // 6. StringBuffer delete() 객체의 delete 메소드는 주어진 범위 만큼 삭제한다.
        //    StringBuffer deleteCharAt() 객체의 deleteCharAt 메소드는 입력한 인덱스의 문자를 삭제한다
        StringBuffer sb3 = new StringBuffer("abcxxxdef");
        sb3.delete(4, 6);
        System.out.println(sb3);
        sb3.deleteCharAt(3);
        System.out.println(sb3);
        
        // 7. StringBuffer replace() 객체의 문자열에서 주어진 범위 만큼 입력 받은 문자열 치환한다.
        StringBuffer sb4 = new StringBuffer("abcxxghi");
        sb4.replace(3, 5, "def");
        System.out.println(sb4);
	}

}
