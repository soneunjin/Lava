package day19;
/*
 ����ȭ�� �Ǳ� ���ؼ��� Serializable�� �����ؾ� �Ѵ�.
 ����ȭ�� ����ȭ ������ Ŭ������ �����ϹǷ�
 
 */
import java.io.*;
public class Friend implements Serializable {
	private String name,tel,mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	private int age;
	private float height;
	private char gen;
	
	public Friend() {}
	public Friend(String name,String tel,String mail, int age, float height, char gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.height = height;
		this.gen = gen;
	
		
	}
	

}
