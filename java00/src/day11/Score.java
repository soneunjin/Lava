package day11;
import java.util.*;
/*
  	���� 2]
  		�� Ŭ������ �л��Ѹ���
  		�̸�, java, oracle, html, javascript, jsp, spring �� ������ ����� Ŭ�����̴�.
  		�� Ŭ������ ��ü�� �ɶ� �����͸� �Է¹޾Ƽ� �� ������ ����̵ǰ�
  		Ŭ������ ���� �ϼ���.
  		
  		��, �����Ͱ� �Է��� �� �� ��� 
  			�̸��� "�ڱ�ȣ"�� �ϰ�
  			������ �����ϰ� ���ǰ��ϼ���.
  			
 */
public class Score {
	
	String name;
	
	int java,oracle,html,javascript,jsp,spring,total;
	
	double avg;
	
	

	
	
	
	
	public Score(String name) {
		this.name = name;
		setSub();
		setTotal();
		setAvg();
		
	}
	public Score() {
		this("�ڱ�ȣ");
		
		/* getJumsoo() �Լ��� �� Ŭ������ ����̰�
		�� �Լ��� ����� �� �ִ� ������
		�� Ŭ������ ��ü�� �� ���Ŀ� ��� �����ϴ�.
		
		���� �� �Լ��� ���ٸ� �Ӽ��� ���� �����ϰ� �Ǹ�
		���� �޸𸮿� �÷����� ���� ���°�
		������ �Լ����� ȣ�� �� �� ���� �����̱� ������ ����� �� ����.
		
		�� �Լ��� ���� ����ϰڴٸ���
		�� �Լ��� �̸� �޸𸮿� �÷��ָ� �ɰ��̴�.
		�̶� ����� �� �ִ� �Ӽ���
			"static"
		�Ӽ��̴�.
		*/
	}
	public Score(String name,int java,int oracle,int html, int javascript, int jsp, int spring) {
		this.name =name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
	}
	
	public void setSub() {
		

		java = (int)(Math.random()*61+40);
		oracle = (int)(Math.random()*61+40);
		html = (int)(Math.random()*61+40);
		javascript = (int)(Math.random()*61+40);
		jsp = (int)(Math.random()*61+40);
		spring = (int)(Math.random()*61+40);
		
//		this(name,getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo());
	}
	// �����ϰ� ���� ��ȯ���ִ� �Լ�
	public static int getJumsoo() {
		return (int)(Math.random()*61+40);
	}
	
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	public void setAvg() {
		this.avg = this.total / 6.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %3d | %4d | %5.2f |\n",name,java,oracle,html,javascript,jsp,spring,total,avg);
	}
	
	
}
	
