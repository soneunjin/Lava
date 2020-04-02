package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
/*
    문제 1]
       1. Ex01.txt 에 저장된 데이터를 Properties에 담고
       2. 키값을 모두 꺼내서 
       3. 데이터를 추출하고
       4. 총점을 구해주세요.
       5. 메세지창을 띄워서 총점을 출력해주세요.
 */
public class Ex01_01 {

   public Ex01_01() {
      Properties prop = new Properties();
      FileInputStream fin = null;
      
      try {
         fin = new FileInputStream("src/day18/Ex01.txt");
         prop.load(fin);
      } catch(Exception e) {
         e.printStackTrace();
      }

      Set<Map.Entry<Object, Object>> set1 = prop.entrySet(); 
      
      Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
      int num=0;
      String msg = "*** 시험 결과 ***";
      while(itor.hasNext()) {
         Map.Entry<Object, Object> ent = itor.next();
         String y = (String)ent.getKey();
         String val = (String)ent.getValue();
         
         msg += "\n" + y + " : " + val;
         
         int no = Integer.parseInt(val);
         num += no;
                  
      }
      
      msg += "\n총점 : " + num;
      JOptionPane.showMessageDialog(null, msg);
      
   }

   public static void main(String[] args) {
      new Ex01_01();
   }

}