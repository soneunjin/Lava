package MyProj.test;

import java.sql.*;
import DB.*;
public class Test01 {
	ORCLJDBC db;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	
	public Test01() {
		db = new ORCLJDBC();
		con = db.getCon();
		
		// ���Ǹ��
		String sql = "SELECT mno, name, id FROM member WHERE mno = ";
		
		// ȸ��� ������ �����ͺ���.
		sql = sql + 9999;
		
		int mno = 1000;
		String tel = "010-7777-7777";
		
		String sql1 = "UPDATE member SET tel = " +tel + " WHERE mno = " + mno;
		
		// Statement ��������
		stmt = db.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			// rs ���� ������ ������
			
			stmt.executeUpdate(sql1);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
