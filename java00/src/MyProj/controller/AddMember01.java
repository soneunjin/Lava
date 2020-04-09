package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;

public class AddMember01 {
	/*
	  ALTER TABLE
    	member
		add(
    		joinDate Date default sysdate
        	CONSTRAINT MEMB_JOIN_NN NOT NULL
			);
	 */
	
	
	

	public AddMember01() {
		// ȸ�� �Ѹ��� �߰��� ����.
		// ȸ�� �����ʹ� VO �� ��Ƽ� �Ѱ��ֱ�� ��������Ƿ� VO�� �غ��Ѵ�.
		
		MemberVO mVO = new MemberVO();
		mVO.setName("������");
		mVO.setId("sej0267");
		mVO.setPw("45123");
		mVO.setMail("sej0267@navercom");
		mVO.setGen("M");
		mVO.setTel("010-5704-7478");
		mVO.setAno(12);
		
		// �����ʹ� �غ� �Ǿ�����
		// �����ͺ��̽� ó���Լ��� ȣ�����ش�.
		MemberDAO mDao = new MemberDAO();
		
		// �����ͺ��̽� ó���Լ��� ȣ�����ش�.
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getName() + " ���� �����߽��ϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getName() + " ���� ������ ���� �Ǿ����ϴ�.");
		}
	}

	public static void main(String[] args) {
		new AddMember01();
	}

}
