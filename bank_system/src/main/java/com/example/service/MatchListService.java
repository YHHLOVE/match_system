package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Match;
import com.example.mappr.MatchListDao;

@Service
public class MatchListService {
	@Autowired
	private MatchListDao matchListDao;
	
	public List<Match> findMatchList(int id){
		return matchListDao.findMatchList(id);
	}
}
