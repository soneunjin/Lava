package day14;

public class Test01 {
	int age;
	String name;
	
	public Test01() {}
	public Test01(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() { // Override <== Object�� ������ �ִ� toString() �� �������̵��� ���̴�.
		return name + " ���� ���̴� [" + age + "] �Դϴ�. ";
	}
}
