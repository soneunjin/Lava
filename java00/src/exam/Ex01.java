package exam;

import javax.swing.JOptionPane;

/*
  	JOptionPane 으로 숫자를 입력받아서
  	배열을 만들고
  	배열이 기억할  수 있는 갯수만큼 숫자를 입력받아서
  	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
  	단, 합을 구하는 기능은 함수를 만들어서 처리하세요.
  	
 */
public class Ex01 {
	int[] abc = new int[3];
	public Ex01() {
		
		setSum();
		
	}
	public void setSum() {
		int sum = 0;
		for(int i=0; i<abc.length; i++) {
			String str = JOptionPane.showInputDialog("숫자를 입력하세요.");
			int a =Integer.parseInt(str);
			
			abc[i] = a;
			sum+= a;
			
			
		}
		JOptionPane.showMessageDialog(null, sum);
	}
		
	

	public static void main(String[] args) {
		new Ex01();
	}

}
