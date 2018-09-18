package com.acon.travelmaker.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acon.travelmaker.vo.Member;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate template;

	public Member login(Member member) {
		return template.selectOne("MemberMapper.login",member);
	}

	public int join(Member member) {
		return template.insert("MemberMapper.join", member);
	}

}
