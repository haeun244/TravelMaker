package com.acon.travelmaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acon.travelmaker.dao.MemberDAO;
import com.acon.travelmaker.vo.Member;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	public Member login(Member member) {
		return dao.login(member);
	}

}
