package day15;

public class Ex02 {

	public static void main(String[] args) {
		// String 문자열 함수
		// 1. starWith : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자 구별)
		String str = "apple";
		String str1 = "apple";
		boolean startsWith = str.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// 2. endWith : 문자열 마지막에 지정한 문자가 있는지 판단
		boolean endsWith = str.endsWith("e"); 
		System.out.println("endsWith: " + endsWith);
		
		
		// 3. equals 문자열 비교
		boolean equals = str.equals(str1);
		System.out.println("equals: " + equals);
		
		// 4. lastindexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는 int를 반환한다.
		String str2 = "AdnroidApp";
		int lastIndexOf = str2.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
		
		// 5. split : 지정한 문자로 문자열을 나눌 수 있다. (배열로 반환)
		String str3 = "A:B:C:D:abcd";
		String[] split = str3.split(":");
		System.out.println("split: " + split[1]);
		
		// 6. trim : 문자열에 공백을 없애준다.
		String s = "     java java java     ";
		String v; v = s.trim();
		System.out.println("trim:" + v);
		
		// 7. valueOf : 지정한 개체의 원시 값을 반환
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
		
		// 8. compareTo : 두개의 String를 앞에서부터 순차적으로 비교하다가 틀린부분이 있으면 비교하는 String에 캐릭터 값을 반환한다.
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
		
		// 9. contains : 두개의 String을 비교해서 비교대상 String을 포함하고 있으면 true, 다르면 false을 반환
		String str6 = "abcd";
		String str7 = "c";
		boolean contains = str6.contains(str7);
		System.out.println("contains: " + contains);
		
		// 10. concat : 문자와 문자를 결합해준다.
		String str8 = "Son";
		String str9 = "EunJin";
		String concat = str8.concat(str9);
		System.out.println("concat: " + concat);
		
		// 11. matches : 지정한 정규 표현과 일치 할때 true를 반환
		int t = 123456;
		String str10 = String.format("%,d", t);
		String str11 = "123456";
		boolean matches = str10.matches(str11);
		System.out.println("matches: " + matches);
		
		// 12. replaceFirst : 문자열에 지정한 문자""가 있으면 첫번째만 새로지정한 문자""로 바꿔서 출력
		String str12 = "Aman";
		String replaceFirst = str12.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);




	}

}
