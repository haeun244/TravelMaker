package com.acon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acon.dao.CommunityDAO;

@Service
public class CommunityService {
	
	@Autowired
	CommunityDAO dao;

}
