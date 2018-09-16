package com.acon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acon.dao.TravelDAO;

@Service
public class TravelService {

	@Autowired
	TravelDAO dao;
}
