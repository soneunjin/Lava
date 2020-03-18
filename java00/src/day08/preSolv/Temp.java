package day08.preSolv;

public class Temp {

	public static void main(String[] args) {
		String str = "we are the world!";
		System.out.println(str.substring(str.indexOf('w', 3), str.indexOf('!')));
		System.out.println(str.substring(str.indexOf("world"), str.indexOf('!')));

	}

}