package day03;

public class People {

	public People() {
		int no = 1001;
		String[] id = {"sung","han","son","soo","jin"};
		String pw = "12345";
		String[] name = {"�輺��","����ö","������","�����","������"};
		String[] tel = {"010-1234-5678","010-2345-6789","010-9876-5432","010-1111-1111","010-0101-1101"};
		
		int no1 = 1001;
		String[] id1 = {"pengsoon","doo","tae","woo","jh","lim"};
		String[] name1 = {"��ҿ�","�����","������","���","������","�Ӽ���"};
		String[] tel1 = {"010-7777-7777","010-2222-2222","010-3333-3333","010-5555-5555","010-6666-6666","010-8888-8888"};
		 
		Member[][] team1 = new Member[5][6];
		
		//1
		for(int i =0; i<5; i++) {
			team1[0][i] = new Member(no++,id[i],pw,name[i],tel[i]);
		}
		
		//2
		for(int i =0; i<6; i++) {
			team1[1][i] = new Member(no1++,id1[i],pw,name1[i],tel1[i]);
		}
		System.out.println("--------------------------");
		for(int j = 0; j<2;j++) {
			System.out.print("|");
		for(int i =0;i<team1[j].length;i++) {
			if(j ==0 && i == 5) {
				continue;
			}
			System.out.print(team1[j][i].name+"|");
		}
		System.out.println();
		System.out.println("-------------------------");
	}
	}
	public static void main(String[] args) {
		new People();

	}

}
