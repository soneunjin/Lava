package exam;

/**
 * 	�� Ŭ������ emp ���̺��� ��� ������ ���� ���� ����� �����
 * 	��û�� ���� ��ȯ���ִ� Ŭ����
 * @author ������
 * @since 2020.03.30
 * @version v.1.0
 * 
 *
 */
public class Chamgo {
	// �ڵ带 ���� ����
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1002;
	
	public final int EDIT_SAL = 2001;
	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		// ��� ����� ���� �������� ���Ǹ��
		switch(code) {
		case SEL_ALL :
			buff.append("SELECT ");
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_DNO :
			buff.append("SELECT ");
			buff.append("	empno, ename, job, mgr, hiredate, sal, comm, deptno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			
			break;
		case EDIT_SAL :
			buff.append("UPDATE ");
			buff.append("	emp ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			
			break;
		
		}
		return buff.toString();
	}
}
