package day15;
/*
  	String Ŭ������ ���� ���̷� �Ǿ��ֱ� ������
  	 �� �� �ۼ��� ���ڿ� �ڿ� ���ڿ��� �߰��ϰ� �Ǹ�
  	  ���ο� ���ڿ��� �ۼ��ϰ� �˴ϴ�.
	StringBuilder Ŭ������ ���������� ���ڿ��� ����ϴ� Ŭ������
	 ���ڸ� �߰��ص� ���ο� ������Ʈ�� �ۼ����� �ʰ� 
	 ���ڿ��� �߰��մϴ�.
 */
public class Ex04 {
	// StringBuilder
	public static void main(String[] args) {
		resultCheck("Sam", 89);
	    resultCheck("Jeny", 45);
	    resultCheck("Tom", 67);
	    resultCheck("Yon", 92);
	}
	private static void resultCheck(String name, int tokuten){

	    StringBuilder sb = new StringBuilder();
	    sb.append(name);
	    sb.append("�� ������");
	    sb.append(tokuten);
	    sb.append("�� �Դϴ�.�����");

	    if (tokuten > 75){
	      sb.append("�հ�");
	    }else{
	      sb.append("���հ�");
	    }

	    sb.append("�Դϴ�.");
	    System.out.println(new String(sb));
}
}
