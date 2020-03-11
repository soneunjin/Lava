package day02;

public class Test04 {
/*
  	***
   	������(Constructor)
   	: 	Ŭ������ ��ü�� �� �� Ŭ������ �ɹ��� ������ �� �⺻ ���� ���� ���̴�.
   		�� �� �� �ɹ����� �⺻���� �������ִ� ������ �ϴ� ���� ������ �Լ�.
   		
   		����]
   			public Ŭ�����̸� (){
   				����...
   			}
   			
   		***	
   		������ �Լ��� ��ȯ���� ����.
   		
   		***
   		������ �Լ��� �ϳ��� �������� ������
   		�ڹ� ����ӽ��� �ڵ����� �⺻ ������ �Լ��� ���� ȣ�����ش�.
   		
   		���� ������ �Լ��� �ϳ��� �����
   		�ڹ� ���� �ӽ��� �⺻������ �Լ��� ������ �ʴ´�.
   		
   		����
   		������ �Լ��� ���Ǹ� �ҰŸ�
   		�⺻ ������ �Լ��� ������ ������ ���� �صδ� �� ����.
   		
  
 */
	
/*
  	�� ������
  		: ������ ����� ũ�⸦ ���ؼ� ������ ��� ������
  		
  	����]
  		���п��� �񱳿����ڸ� ����ϵ��� 
  		�ѹ��� �ΰ��� ���� ���� ����.
  		
  		��]
  			int no = 10;
  			
  			1 <= no  <= 20; ==> error
  			
  			==> (1 <= no) & (no <= 20)
  			
  			
  	��������]
  		������ ������ �����ؼ� ������ ���� ������
  		
  		����]
  			&	- �� ������ ��� ���ϰ�� ��
  			|	- �� ������ �ϳ��� ���̸� ��
  			!	- ���� ������
  			
  			���迬���� �ϴ� ��������
  			&&	- �� ������ ��� ���ϰ�� ��. 
  			||	- �� ������ �ϳ��� ���̸� ��
  			
  
 */
	public Test04() {
		test1();
		test2();
	}

	public static void main(String[] args) {
		new Test04();

	}
	public void test1() {
		char ch1 = 'A';
		char ch2 = 97;
		System.out.println("97 : " + ch2);
		int no = ch1;
		
		ch2 = (char)(no + 3);
		
		boolean bool1 = false;
		boolean bool2 = true;
		System.out.println(ch1 < 'a');
	}
	public void test2() {
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("1. " +(bool1 & bool2));
		System.out.println("2. " +(bool1 | bool2));
		System.out.println("3. " +!(bool1 & bool2));
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("4. " +((no1 > no2) && (++no1 == no2)));
		System.out.println("4-1. " + no1);
		
		System.out.println("5. " +((no1 < no2) || (++no1 == no2)));
		System.out.println("5-1. " + no1);
		
		// ��Ʈ������
		System.out.println("6. " + (35 & 24));
		
		
		
	}
}
