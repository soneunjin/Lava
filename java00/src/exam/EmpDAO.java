package exam;

public class EmpDAO {
	public Chamgo eSql;
	
	public EmpDAO() {
		eSql = new Chamgo();
		// ��� ȸ���� ������ ��ȸ�� ���Ǹ�� ��������
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println("sql : " + sql);
	}

	public static void main(String[] args) {
		new EmpDAO();
	}

}
