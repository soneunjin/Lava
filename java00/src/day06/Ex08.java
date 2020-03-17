package day06;
import java.util.*;
/*
 * 문제 8]
	
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 -- 문자열 배열 3개
	데이터를 입력해서
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요.
	
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name[] = new String[] {"이한철","김수진","이진수","손은진","김성현"};
		
		String pone[] = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		
		String email[] = new String[] {"a@naver.com","ab@naver.com","abc@naver.com","abcd@naver.com","abcde@naver.com"};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회원의 이름을 입력하세요 : ");
		String str = sc.nextLine();
		for(int i=0; i<5; i++) {
			if(str.contentEquals(name[i])) {
				System.out.println("이름 : " + name[i]);
				System.out.println("번호 : " + pone[i]);
				System.out.println("메일 : " + email[i]);
				
			}
			System.out.println();
			
			}
		}
		
		
		}

	

