package day04;

/*
반복문을 사용해서 다음 모양을 출력하세요.

	1 - 0. 
		
		*****
		*****
		*****
		*****
		*****
	
	1. 
		*
		**
		***
		****
		*****
	
	2.
		    *
		   **
		  ***
		 ****
		*****
	
	3. 
		*****
		****
		***
		**
		*
	
	4. 
		*****
		 ****
		  ***
		   **
		    *
		    
	5. 
		    *
		   ***
		  *****
		 *******
		*********
		
	6.
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
	
	7-0.
		    12345
		    12345
		    12345
		    12345
		    
	7-1.
			1  2  3  4  5
			6  7  8  9  10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 24 25
	
	7.
		1
		12
		123
		1234
		12345
		
	8.
		    1
		   12
		  123
		 1234
		12345
		
	9.
		12345
		1234
		123
		12
		1
		
	10.
		1
		2  3
		4  5  6
		7  8  9  10
		11 12 13 14 15
		
	00. ==> 반복문 중첩해서...
		1  1  1  1  1
		2  2  2  2  2
		3  3  3  3  3
		4  4  4  4  4
		5  5  5  5  5 
		
	00 - 01. ==> 반복문 중첩해서...
	
		1  1  1  1  2
		2  2  2  3  3
		3  3  4  4  4
		4  5  5  5  5
		6  6  6  6  6
	
	11.
		2 x 1 = 2 	3 x 1 = 3 	...		9 x 1 = 9
		...
		2 x 9 = 18	3 x 9 = 27	...		9 x 9 = 81
	
	12.
		
		A B C D E
		F G H I J
		K L M N O
		P Q R S T
		U V W X Y
	
	13.
		
		A
		B C
		D E F
		G H I J
		K L M N O
		
	14.
		
			1	6	11	16	21
			2	7	12	17	22
			3	8	13	18	23
			4	9	14	19	24
			5	10	15	20	25
		
	15.
			A	F	K	P	U
			B	G	L	Q	V
			C	H	M	R	W
			D	I	N	S	X
			E	J	O	T	Y
		
	16.
			
			1	2	3	4	5
			10	9	8	7	6
			11	12	13	14	15
			20	19	18	17	16
			21	22	23	24	25
	
*/
  			
  			
  			 

public class Hw05 {

	public Hw05() {
//		solv1();
//		solv2();
//		solv3();
//		solv4();
//		solv5();
//	    solv6();
//		solv7();
//		solv8();
//		solv81();
//		solv9();
		solv10();
//		solv11();
//		solv12();
//		solv13();
//		solv14();
//		solv15();
//		solv16();
	}
	public void solv1() {
		for(int i=1;i<=5;i++) {
			String mg = "*****";
			System.out.println(mg);
		}
		
	}
	public void solv2() {
		String mg = "*";
		label:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				mg = (mg+"*");
				System.out.println((mg));
				continue label;
			}
			System.out.println(mg);
		}
	}
	
	public void solv3() {
		for(int i=5;i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	public void solv4() {
		for(int i=0; i< 5; i++) {
		for(int j=0; j< 5; j++){
				if(i <= j) {
					System.out.print("*");	
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
			
	}
	
	public void solv5() {
		for(int i=0;i<5;i++) {
			String str =" ";
			for(int j=0;j<i+5;j++) {
				if(j>=(4-i)) {
					str = "*";
					System.out.print(str);
				}else {
				System.out.print(str);
			}
				}
			System.out.println();
		}
		
		
		
}
	public void solv6() {
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
				
			}
			System.out.println();
	}
}
	public void solv7() {
		for(int i=2; i<7; i++) {
			for(int j=1; j<i; j++) {
			System.out.print(+j);
			
		}
		System.out.println();
		}
		
		
	}
	public void solv8() {
		int num=1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(num++ +"\t");
			}
			System.out.println();

		}
		
	}
	public void solv81() {
		for(int i=1; i<=5; i++) {
			for(int j=5;j>i;j--) {
					System.out.print(" ");
			}	
				for(int k=1; k<=i;k++) {
					System.out.print(k);
					

			}
				System.out.println();
			
		}
		
		
	}
	
	
	
	public void solv9() {
		for(int i=5;i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	public void solv10() {
		int num = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print(num++ +" ");
			
		}
		System.out.println();
		}
		
	}
	public void solv11() {
		for(int i=1; i<7; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(i+"\t");
				
			}
			System.out.println();
			
		}
		
	}
	public void solv12() {
		for(int i=1; i<=5; i++) {
			for(int j=5;j>i;j--) {
					System.out.print(i);
			}	
				for(int k=1; k<=i;k++) {
					System.out.print(i+1);
					

			}
				System.out.println();
			
		}
		
	}
	public void solv13() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "X"+j+"="+i*j);
				
			}
		}
		
		
	}
	
	public void solv14() {
		char alpq='A';
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(alpq++ +"\t");
			}
			System.out.println();

		}
		
		
	}
	public void solv15() {
		char alpa = 'A';
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print(alpa++ +" ");
			
		}
		System.out.println();
		}

	}
	
	public void solv16() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print(i);
			
		}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
			new Hw05();
				
			}
		}

	

