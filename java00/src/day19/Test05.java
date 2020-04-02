package day19;

/*
 예제5]
 	1. day/etc에 폴더하나를 강제로 만든다.
 		day/etc/snue
 	2. 경로상에 없는 폴더까지 한꺼번에 만든다.
 		day/etc/zzz/abc
 	3. 만들어진 파일 중 하나를 삭제한다. (폴더, 파일 삭제 가능)
 	4. 특정 파일의 이름을 다른이름으로 변경하자.
 */

import java.io.*;
import javax.swing.*;
public class Test05 {

	public Test05() {
		// 만들고 싶은 폴더(없어도 됨) 파일로 만든다.
		
		/*
		// 1. 
		File file = new File("src/day19/etc/snue");
		file.mkdir();
		
		// 2.
		File file = new File("src/day19/etc/zzzz/abc");
		file.mkdirs();
		 */
		
		// 3.
		File file = new File("src/day19/etc/zzzz/abc");
		file.delete();
		
		// 4.
		File oldF = new File("src/day19/etc/sample.txt");
		File newF = new File("src/day19/etc/sample.increpas");
		
		// 바꿔준다.
		oldF.renameTo(newF);		
		
		
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}
}
