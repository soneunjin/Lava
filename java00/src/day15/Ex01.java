package day15;
import javax.swing.*;
import java.util.regex.*;
/*
  	¹®Á¦ 1]
  		
  		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
  		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
  		ÀÌ¸ŞÀÏ Çü½ÄÀº
  			¾ËÆÄºª°ú ¼ıÀÚ·Î 8±ÛÀÚÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò
  		·Î Ã³¸®ÇÏ¼¼¿ä.
  		
  		Âü°í ]
  			ÇÑ±Û Ã³¸® : [°¡-ÆR] - ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö¸¶¼¼¿ä.
 */
public class Ex01 {
	
	public Ex01() {
		String val = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä! ");
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9].*+$");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null,"¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
		} else {
			JOptionPane.showMessageDialog(null,"Àß¸øµÈ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
			
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
