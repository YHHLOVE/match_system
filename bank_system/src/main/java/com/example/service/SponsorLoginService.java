package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Sponsor;
import com.example.mappr.SponsorLoginDao;

@Service
public class SponsorLoginService {
	
	@Autowired
	private SponsorLoginDao sponsorLoginDao;
	
	public Sponsor login(int id,String password) {
		return sponsorLoginDao.login(id,password);
	}
}
