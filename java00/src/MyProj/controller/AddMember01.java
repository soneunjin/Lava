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
		// 회원 한명을 추가해 보자.
		// 회원 데이터는 VO 에 담아서 넘겨주기로 약속했으므로 VO를 준비한다.
		
		MemberVO mVO = new MemberVO();
		mVO.setName("손은진");
		mVO.setId("sej0267");
		mVO.setPw("45123");
		mVO.setMail("sej0267@navercom");
		mVO.setGen("M");
		mVO.setTel("010-5704-7478");
		mVO.setAno(12);
		
		// 데이터는 준비 되었으니
		// 데이터베이스 처리함수를 호출해준다.
		MemberDAO mDao = new MemberDAO();
		
		// 데이터베이스 처리함수를 호출해준다.
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getName() + " 님이 가입했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getName() + " 님이 가입이 거절 되었습니다.");
		}
	}

	public static void main(String[] args) {
		new AddMember01();
	}

}
