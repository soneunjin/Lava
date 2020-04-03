package day20;

/*
  	�� Ŭ������ JDBC�� �׽�Ʈ �ϱ� ���� Ŭ����
  	
  	����Ŭ�� ����� ���� hello ������ �����ؼ�
  	member ���̺� �����͸� ä������.
  	
  	
  	
 */
import java.util.*;
import java.sql.*;
import javax.swing.*;
public class Test01 {

	public Test01() {
		// ����
		/*
		  	1. JDBC��� �ܺ� �����ͺ��̽��� ������ ����̹��� �̹� �߰��� �س��Ҵ�.
		  		���� �� ���α׷����� �� ����̹��� ������ �;� �Ѵ�.
		  		�ܺ� Ŭ������ �ε��ϴ� �Լ�
		  		
		  			Class.forName(Ŭ�����̸�)
		  			
		  	
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. ���� ����̹� �ε��� ���� ���´�.
			JOptionPane.showMessageDialog(null, "*** DB Driver Loading Complete!!! ***");
			
			// 2. ������ �õ��� ����.
			/*
			  		������ �����ͺ��̽� ���� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
			  		�� ��� ���� ���۽��� ������ û�ϼ���.
			  		
			  		�����ϴ� ����� JDBC���� ����� �ϸ� �ȴ�.
			  		DriverManager.getConnection();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			// �� url�� �����ͺ��̽����� ���ݾ� �޶�����.
			Connection con = DriverManager.getConnection(url,user, pw);
			/*
			  	��ó�� ������ �ϰ� �Ǹ� �����ڸ� �����ϴ� ������ �����ϴµ�
			  	�� ������ �����ϴ� Ŭ������ �ٷ� Connection �̴�.
			  	
			  	��������� �����ͺ��̽��� ���� ���ݾ� ������ �޶����� �κ��̴�.
			  	
			  	���ĺ��ʹ� �׻� ������ ������� JDBC���� ����� ������
			  	JDBC�� �ش� DBMS���� ����� �����Ѵ�.
			 */
			JOptionPane.showMessageDialog(null, "*** Oracle Connect Complete!!! ***");
			
			// ���� ����Ŭ�� ���ӵ� �Ǿ��� ���� ���Ǹ���� ��������.
			// 3. Statement �����.
			Statement stmt = con.createStatement();
			
			// 4. ���� ����� �����
			ArrayList<String> avtList = new ArrayList<String>();
			avtList.add("INSERT INTO avatar VALUES(11,'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(12,'img_avatar2.png','img_avatar2.png','M')");
			avtList.add("INSERT INTO avatar VALUES(13,'img_avatar3.png','img_avatar3.png','M')");
			avtList.add("INSERT INTO avatar VALUES(14,'img_avatar4.png','img_avatar4.png','F')");
			avtList.add("INSERT INTO avatar VALUES(15,'img_avatar5.png','img_avatar5.png','F')");
			avtList.add("INSERT INTO avatar VALUES(16,'img_avatar6.png','img_avatar6.png','F')");
			
			
			String sql01 = "INSERT INTO member VALUES(1000,'������','euns','12345','euns@increpas.com','M','010-3175-9042',11,'Y')";
			String sql02 = "INSERT INTO member VALUES(1001,'�ֵο�','dDragon','12345','dDragon@increpas.com','M','010-9292-4184',11,'Y')";
			String sql03 = "INSERT INTO member VALUES(9999,'�����','chairman','12345','chairman@increpas.com','F','010-9999-9999',14,'Y')";
			
			/*
			// ���� Statement �� ���� ����� �Ǿ ������ �ȴ�.
			int cnt =0;
			for(int i=0; i<avtList.size(); i++) {
				
				cnt += stmt.executeUpdate(avtList.get(i));
			}
			
			JOptionPane.showMessageDialog(null, "�Էµ� ������ �� : " + cnt);
			*/
			
			/*
			// ȸ���� �߰��غ���.
			stmt.execute(sql01);
			stmt.execute(sql02);
			stmt.execute(sql03);
			*/
			
			String sql04 = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM member WHERE mno = 1000";
			ResultSet rs = stmt.executeQuery(sql04);
			// ���� �۾����� BOF �̹Ƿ� ���� ������ ����ִ� ������ ���� ������ �ȴ�.
			rs.next();
			
			/*
			int mno = rs.getInt(1);
			String name = rs.getString(2);
			String mid = rs.getString(3);
			String mpw = rs.getString(4);
			String mail = rs.getString(5);
			String gen = rs.getString(6);
			String tel = rs.getString(7);
			int ano = rs.getInt(8);
			char isshow = rs.getString(9).charAt(0);
			*/
			
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
			char isshow = rs.getString("status").charAt(0);
			
			JOptionPane.showMessageDialog(null, name + " ������ ����\nȸ����ȣ : " + mno +
					"\nȸ�����̵� : " + mid + "\nȸ����� : " + mpw + "\nȸ������ : " + mail +
					"\nȸ������ : " + gen + "\nȸ����ȭ : " + tel + "\n�ƹ�Ÿ��ȣ : " + ano +
					"\nȰ������ : " + ((isshow == 'Y') ? "Ȱ����" : "Ż��ȸ��")
					);
			
			
			/*
			if(bool) {
				JOptionPane.showMessageDialog(null, "*** ���Ǹ�� ��� �߻� ***");
			} else {
				JOptionPane.showMessageDialog(null, "*** ���Ǹ�� ��� ���� ***");
			}
			*/
			
			/*
			String dsql = "TRUNCATE TABLE MEMBER";
			
			stmt.execute(dsql);
			*/
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
