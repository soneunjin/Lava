package day06;

/*
  	extra ]
  		1, 1, ...
  		�� �����ϴ� �Ǻ���ġ ������ 10�� ����ϼ���.
  		
  		����]
  			�Ǻ���ġ ���� :
  				���� �� ���� ���� ������ ����...
  				
  				1, 1, 2, 3, 5, ...
  				
  				
 */
public class Extra {

	public static void main(String[] args) {
		int jagn = 1;
		int kn = 1;
		System.out.print(jagn+","+kn+",");
		for(int i=0; i< 8; i++) {
			int result = jagn + kn;
			jagn = kn;
			kn = result;
			
			System.out.print(result+",");
			
			
			
		}

	}

}
