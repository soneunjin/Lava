package day03;

/*
  	문제 1]
  		게시판에 글을 한페이지에 15개 글을 표시할 수 있다.
  		게시물의 갯수를 랜덤하게 (0 ~ 100) 발생한 후
  		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
  		단, 게시물 수가 0인 경우는 1페이지가 필요한 것으로 한다.
 */
public class Ex02 {

	public Ex02() {
		solv();
	}
	public void solv() {
		int no1 = (int)(Math.random()*(100 -0 +1))+0;
		int result = 0;
		if(no1 <= 15) {
			result = 1;			
		} else if(no1%15 == 0){
			result = no1/15;
		} else  {
			result = no1/15 +1;
		}
		System.out.println("랜덤한숫자" + no1 +"\n페이지수"+ result);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
