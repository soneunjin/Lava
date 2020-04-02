package day18;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Ex01 {
/*
  	문제 1]
  		1. Ex01.txt 에 저장된 데이터를 Properties에 담고
  		2. 키값을 모두 꺼내서
  		3. 데이터를 추출하고
  		4. 총점을 구해주세요.
  		5. 메세지창을 띄워서 총점을 출력해주세요.
 */
	public Ex01() {
		Properties pror = new Properties();
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			pror.load(fin);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Set set = pror.entrySet();
		ArrayList<Map.Entry<String, String>> elist = new ArrayList<Map.Entry<String,String>>(set);
		int sum = 0;
		String msg = "*** 시험 결과 ***";
		for(int i=0; i<elist.size(); i++) {
			sum += Integer.parseInt(elist.get(i).getValue());
		}
		
		for(int i=0; i< elist.size(); i++) {
			msg += "\n" + elist.get(i).getKey() + " | " + elist.get(i).getValue();
//					JOptionPane.showMessageDialog(null, elist.get(i).getKey() + " | " + elist.get(i).getValue());
		}
			msg += "\n총점 : " + sum;
			JOptionPane.showMessageDialog(null, msg);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
