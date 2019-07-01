package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappr.DeleteMatchDao;

@Service
public class DeleteMatchService {

	@Autowired
	public DeleteMatchDao deleteMatchDao;
	public int deleteMatch(int matchId) {
		return deleteMatchDao.deleteMatch(matchId);
	}
}
