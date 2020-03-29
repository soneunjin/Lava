package day15;

public class Ex02 {

	public static void main(String[] args) {
		// String ���ڿ� �Լ�
		// 1. starWith : ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ� ������ true��ȯ �ƴϸ� false�� ��ȯ�Ѵ�.(��ҹ��� ����)
		String str = "apple";
		String str1 = "apple";
		boolean startsWith = str.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// 2. endWith : ���ڿ� �������� ������ ���ڰ� �ִ��� �Ǵ�
		boolean endsWith = str.endsWith("e"); 
		System.out.println("endsWith: " + endsWith);
		
		
		// 3. equals ���ڿ� ��
		boolean equals = str.equals(str1);
		System.out.println("equals: " + equals);
		
		// 4. lastindexOf : ���ڿ��� ������ ���ڰ� ������ ���°�� �ִ� int�� ��ȯ�Ѵ�.
		String str2 = "AdnroidApp";
		int lastIndexOf = str2.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
		
		// 5. split : ������ ���ڷ� ���ڿ��� ���� �� �ִ�. (�迭�� ��ȯ)
		String str3 = "A:B:C:D:abcd";
		String[] split = str3.split(":");
		System.out.println("split: " + split[1]);
		
		// 6. trim : ���ڿ��� ������ �����ش�.
		String s = "     java java java     ";
		String v; v = s.trim();
		System.out.println("trim:" + v);
		
		// 7. valueOf : ������ ��ü�� ���� ���� ��ȯ
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
		
		// 8. compareTo : �ΰ��� String�� �տ������� ���������� ���ϴٰ� Ʋ���κ��� ������ ���ϴ� String�� ĳ���� ���� ��ȯ�Ѵ�.
		String str4 = "A";
		String str5 = "B";
		int compareTo = str4.compareTo(str5);

		if(compareTo > 0){

		       System.out.println(str4 + " > " +str5);
		} else if (compareTo == 0){
		       System.out.println(str4 + " = " +str5);
		} else{
		       System.out.println(str4 + " < " +str5);
		}
		
		// 9. contains : �ΰ��� String�� ���ؼ� �񱳴�� String�� �����ϰ� ������ true, �ٸ��� false�� ��ȯ
		String str6 = "abcd";
		String str7 = "c";
		boolean contains = str6.contains(str7);
		System.out.println("contains: " + contains);
		
		// 10. concat : ���ڿ� ���ڸ� �������ش�.
		String str8 = "Son";
		String str9 = "EunJin";
		String concat = str8.concat(str9);
		System.out.println("concat: " + concat);
		
		// 11. matches : ������ ���� ǥ���� ��ġ �Ҷ� true�� ��ȯ
		int t = 123456;
		String str10 = String.format("%,d", t);
		String str11 = "123456";
		boolean matches = str10.matches(str11);
		System.out.println("matches: " + matches);
		
		// 12. replaceFirst : ���ڿ��� ������ ����""�� ������ ù��°�� ���������� ����""�� �ٲ㼭 ���
		String str12 = "Aman";
		String replaceFirst = str12.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);




	}

}
