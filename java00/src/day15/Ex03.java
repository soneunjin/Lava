package day15;
import java.lang.*;
public class Ex03 {

	public static void main(String[] args) {
		// Stringbuffer Ȱ��.
		
		// 1. ��ü�� ���� �ٸ� ������ Ÿ���� �����͸� ���ڿ��� �����ϱ� ���ؼ��� insert �޼ҵ带 �̿��Ѵ�.
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("values");
		sb.append("(");
		sb.append("tiger");
		sb.append("1234");
		sb.append("ȫ�浿");
		sb.append("20");
		sb.append(")");
		System.out.println(sb);
		// 2. int capacity() �޼ҵ�� StringBuffer ��ü�� �Ҵ�� �� �뷮 ũ�⸦ ���ϰ��� �� �� ����Ѵ�.
		//    int length() �޼ҵ�� StringBuffer ��ü�� ���� ���̸� �˰��� �� �� ����Ѵ�.
		System.out.println("capacity : " + sb.capacity());
        System.out.println("length : " + sb.length());

        sb.setLength(2);
        System.out.println("setLength : " + sb);

		// 3. char charAt() ��ü�� ����(char)�� ��ȸ �� ��ü�� �����ϴ�.
        //	  setCharAt()
        StringBuffer sb1 = new StringBuffer("abcde");
        System.out.println("charAt(3) : " + sb1.charAt(3));

        sb1.setCharAt(4, 'f');
        System.out.println("setChatAt(4, 'f') : " + sb1);
        
        // 4.��ü�� ���� �ٸ� ������ Ÿ���� �����͸� ���ڿ��� ��ȯ�Ͽ� ÷���ϱ� ���ؼ��� append �޼ҵ带 �̿��Ѵ�.
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
        
        // 5. StringBuffer reverse() ��ü�� ���ڿ��� �������� ��ȯ�Ѵ�.
        System.out.println(sb.reverse());
        
        // 6. StringBuffer delete() ��ü�� delete �޼ҵ�� �־��� ���� ��ŭ �����Ѵ�.
        //    StringBuffer deleteCharAt() ��ü�� deleteCharAt �޼ҵ�� �Է��� �ε����� ���ڸ� �����Ѵ�
        StringBuffer sb3 = new StringBuffer("abcxxxdef");
        sb3.delete(4, 6);
        System.out.println(sb3);
        sb3.deleteCharAt(3);
        System.out.println(sb3);
        
        // 7. StringBuffer replace() ��ü�� ���ڿ����� �־��� ���� ��ŭ �Է� ���� ���ڿ� ġȯ�Ѵ�.
        StringBuffer sb4 = new StringBuffer("abcxxghi");
        sb4.replace(3, 5, "def");
        System.out.println(sb4);
	}

}
