package day06;

/*
    	문제 00]
    		1, 2, ...로 시작하는 팩토리얼 10개를 구해서 출력하세요.
    		
    		팩토리얼 :
    			1부터 자기자신까지 곱한 수
 */
public class Ex00 {

	public static void main(String[] args) {
		// 각 숫자 반복해서 만들어주는 반복문
		for(int i=1; i<=10; i++) {
			int result = 1;
			// 만들어진 숫자까지 곱한 결과를 만들어주는 반복문
			for(int j=1; j <= i; j++) {
				result = result * j;
		
			}
			System.out.print(result+",");
			
			
		}

	}

}
