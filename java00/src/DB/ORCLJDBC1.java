package DB;

import java.sql.*;
public class ORCLJDBC1 {
	private String user;
	private String pw;
	private String url;
	
	
	public ORCLJDBC1() {
		this("jdbc:oracle:thin:@localhost:1521:orcl", "hello","hello");
	}
	public ORCLJDBC1(String url, String user, String pw) {
		this.user = user;
		this.pw = pw;
		this.url = url;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	

	public static void main(String[] args) {

	}

}
