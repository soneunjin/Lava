package day11.preSolv;

public class Ex04Solv {
	
	public Ex04Solv() {
		// 먼저 다섯명의 이름을 저장할 배열을 만들자.
		String[] name = {"우현우","박기윤","손은진","박광호","이한철","추가인"};
		
		// 다섯명의 데이터를 저장할 배열을 만든다.
		Stud[] ban = new Stud[name.length];
		
		
		ban = setArr1(ban,name);
		
		// 배열은 완성이 되었고
		// 정렬해보자.
		
		ban = setSort1(ban);
		
	
		
		// 출력한다.
		System.out.printf("%6s : %3s | %3s | %3s | %3s | %4s | %5s | %5s   |\n","이  름","국  어","영  어","수  학","물  리","코  딩","총  점","평  균");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
		System.out.println();
		System.out.println("**************************************************");
		System.out.println();
		setArr(ban,name);
		setSort(ban);
	
		
		System.out.printf("%6s : %3s | %3s | %3s | %3s | %4s | %5s | %5s   |\n","이  름","국  어","영  어","수  학","물  리","코  딩","총  점","평  균");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}

	
	// 가변인수로 이름을 입력받아서 배열을 셋팅해주는 함수를 만들어 보자.
	// 그런데 가변인수는 앞에는 일반 변수가 와도 상관없지만, 뒤에는 오면 절대로 안된다.
	public Stud[] setArr1(Stud[] s, String...name) {
		for(int i = 0; i <name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		return s;
		
	}
	
	public void setArr(Stud[] s,String...name) {
		for(int i = 0; i <name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		
	}
	
	// Stud 타입의 배열을 입력해주면 정렬해주는 함수를 만들자.
	public void setSort(Stud[] s) {
		
		for(int i=0; i<s.length - 1;i++) {
			
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
					
				}
			}
		}
	
	}
	public Stud[] setSort1(Stud[] s) {
		
		for(int i=0; i<s.length - 1;i++) {
			
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
					
				}
			}
		}
		
		return s;
	}

	public static void main(String[] args) {
		new Ex04Solv();

	}

}
