package day15;

import java.util.*;
import java.io.*;
public class Test08 {

	public Test08() {
		
		for(int i=0; i<10; i++) {
			Date date = new Date();
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		new Test08();
	}

}
