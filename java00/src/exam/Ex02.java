package exam;

import java.util.StringTokenizer;

/*
  	문제 2 ]
  	
  		President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12.
 His announcement on Sunday indicated that he had backed down from that suggestion.
 
 단어단위로 문자열을 잘라서
 단어길이가 제일 긴 단어의 글자수와 단어를 출력하세요.
 
 단, ,와 . - 그리고 ? 는 단어에서 제외한다.
 */
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." + 
					 "He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12.His announcement on Sunday indicated that he had backed down from that suggestion.";
				
		String str1 ="";
		String str2 =".";
		String str3 =",";
		String str4 ="?";
		String str5 ="-";
		
		
		
		StringTokenizer token = new StringTokenizer(str);
		
		int count = token.countTokens(); // 자른 문자열의 갯수를 반환해주는 함수
		System.out.println("자른 갯수 : " + count);
		
		while(token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("다시 분리된 문자열 : " + tmp);
		}
		
		/*
		String tmp = str;
		int cnt =0;
		for(int i = 0 ; i < tmp.length() ; i++ ) {
			if(tmp.charAt(i) == ',' && tmp.charAt(i) == '.' && tmp.charAt(i) == '-' && tmp.charAt(i) == '?') {
				cnt += 1;
			}
		}
		String[] arr = new String[cnt + 1];
		*/
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
