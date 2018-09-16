package com.acon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acon.dao.MemberDAO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
}
