package exam;

import java.util.StringTokenizer;

/*
  	���� 2 ]
  	
  		President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12.
 His announcement on Sunday indicated that he had backed down from that suggestion.
 
 �ܾ������ ���ڿ��� �߶�
 �ܾ���̰� ���� �� �ܾ��� ���ڼ��� �ܾ ����ϼ���.
 
 ��, ,�� . - �׸��� ? �� �ܾ�� �����Ѵ�.
 */
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." + 
					 "He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12.His announcement on Sunday indicated that he had backed down from that suggestion.";
				
		String str1 ="";
		String str2 =".";
		String str3 =",";
		String str4 ="?";
		String str5 ="-";
		
		
		
		StringTokenizer token = new StringTokenizer(str);
		
		int count = token.countTokens(); // �ڸ� ���ڿ��� ������ ��ȯ���ִ� �Լ�
		System.out.println("�ڸ� ���� : " + count);
		
		while(token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("�ٽ� �и��� ���ڿ� : " + tmp);
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
