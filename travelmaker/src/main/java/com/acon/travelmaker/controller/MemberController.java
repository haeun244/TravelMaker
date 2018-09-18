package com.acon.travelmaker.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acon.travelmaker.service.MemberService;
import com.acon.travelmaker.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;

	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String login(Member member , HttpSession session) {
		member = service.login(member);
		session.setAttribute("member", member);
		return "home";
	}
}
