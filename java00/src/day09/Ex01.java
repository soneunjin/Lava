package day09;
import java.util.*;
/*
    String str = "GitHub is built for collaboration.
    Set up an organization to improve the way your team works together,
    and get access to more features.";
  	
  	1. str 문장을 두 문장으로 분리해서 배열에 넣으세요.
  	   String[] str1 = new String['.' 갯수만큼...]; 
  	2. 단어수만큼의 크기를 가지는 배열을 만들고
  		배열에 단어를 입력하세요. (toCharArray 사용x)
  	
  	
 */
public class Ex01 {
	public Ex01() {
//		solv1();
		solv2();
	}
	public void solv1() {
		String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		String[] str1 = new String[2];
			int idx = 0;
			for(int i=0; i<str.length();i++) {
				
				for(int j=0; j<str1.length; j++) {
					if(str.charAt(j) == '.') {
						idx = j;
						break;
				
					}
					
				}
				str1[i] = str.substring(0,idx);
				str = str.substring(idx+1);	
			}
			System.out.println(Arrays.toString(str1));
	}
	public void solv2() {
		String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		int ch = str.indexOf(" ");

		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			char num = str.charAt(i);
			if(num == ' ') ++cnt; 
				
		}
		String[] str1 = new String[cnt+1];
		
		int idx = 0;
		for(int i=0; i<cnt;i++) {
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == ' ') {
					idx = j;
					break;
					
				}
				
				
			}
			str1[i] = str.substring(0,idx);
			str = str.substring(idx+1);
		}
		str1[cnt] = str;
		System.out.println(Arrays.toString(str1));
		
	}
	
	
	public static void main(String[] args) {
		new Ex01();
		

}
}
