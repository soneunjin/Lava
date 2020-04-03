package MyProj.DAO;

/**
 * �� Ŭ������  ȸ���� ���õ� �����ͺ��̽� ó���۾��� �ϱ� ���� Ŭ�����̴�.
 * @author ������
 * @since 2020.04.03
 * @version v.1.0
 * 
 */
import DB.*;
import java.sql.*;
import java.util.*;
import MyProj.VO.*;
import MyProj.sql.*;
public class MemberDAO {
	// �� Ŭ������ �����ͺ��̽� ó���۾��� ���� Ŭ�����̹Ƿ� �⺻������
	// �����ͺ��̽� ����̹��ε��� ���� �۾��� 
	// �� Ŭ������ ��ü�� �Ǵ� ���� �̷�� ���°��� ���� ���̴�.
	ORCLJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	
	public MemberDAO() {
		// �����ͺ��̽� ����̹� �ε�
		db = new ORCLJDBC();
		con = db.getCon();
		// MemberSQL �ʱ�ȭ
		mSQL = new MemberSQL();
	}
	
	// ȸ������ �����ͺ��̽� ó�� �����Լ�
	public int addMember(MemberVO vo) {
		int cnt = 0; // ��ȯ�� ���� �����
		// �� �۾��� VO�� ��� ������ ������ ���Ǹ�ɿ� ä���� ������ �ȴ�.
		// ���� PreparedStatement�� �ʿ��� ���̴�.
		
		// ���� �ʿ��� ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		// PreparedStatement ��������
		pstmt = db.getPSTMT(sql);
		
		// ���� ���� ��ɿ� �ʿ��� ������ ä���
		try {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getMail());
			pstmt.setString(5, vo.getGen());
			pstmt.setString(6, vo.getTel());
			pstmt.setInt(7, vo.getAno());
			
			// ���� ����� �ϼ��� �Ǿ����� ������ ����� �� ���� ��ȯ������ �ȴ�.
			cnt = pstmt.executeUpdate();
			
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}

}
