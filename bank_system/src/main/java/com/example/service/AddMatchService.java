package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappr.AddMatchDao;

@Service
public class AddMatchService {

	@Autowired
	public AddMatchDao addMatchDao;
	public int addMatch(String sponsorId,String matchName,String matchType,String matchDate,String matchAddress) {
		return addMatchDao.addMatch(sponsorId,matchName,matchType,matchDate,matchAddress);
	}
}
