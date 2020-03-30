package day16;

// MessageFormat
// 		db ���� ����� �����ϴµ� ����� ����.
import java.text.*;
public class Test06 {

	public Test06() {
		String sql = "INSERT INTO member VALUES(1234, 'ȫ�浿', '010-1111-1111', 24)";
		// �� ���� ��ɿ��� �����͸� ���� ������ �ʹ�.
		
		// MessageFormat���� �����Ͱ� �� �κ��� ����� ������ �����.
		
		// form�� �����
		MessageFormat form = new MessageFormat("INSERT INTO member VALUES({0}, {1}, {2}, {3})");
		
		// ���� �����͸� ���� �迭�� �����ϰ�
		Object[] result = null;
		
		try {
			result = form.parse(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i =0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
