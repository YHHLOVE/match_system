package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Match;
import com.example.mappr.EditMatchInfoDao;

@Service
public class EditMatchInfoService {

	@Autowired
	public EditMatchInfoDao editMatchInfoDao;
	public Match editMatchInfo(int matchId,int sponsorId) {
		return editMatchInfoDao.editMatchInfo(matchId,sponsorId);
	}
	
	public int editMatch(String matchId,String sponsorId,String matchName,String matchType,String matchDate,String matchAddress) {
		return editMatchInfoDao.editMatch(matchId,sponsorId,matchName,matchType,matchDate,matchAddress);
	}
}
