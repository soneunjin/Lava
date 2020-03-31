package day17;

import java.util.*;
public class Samo1 implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		Samo s1 = (Samo) o1;
		Samo s2 = (Samo) o2;
		
		int result = (int)(s1.getWidth() - s2.getWidth());
		
		return result;
	}

}
