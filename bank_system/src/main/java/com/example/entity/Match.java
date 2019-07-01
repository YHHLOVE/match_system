package com.example.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Match {
	private int matchId;
	private String matchName;
	private int sponsorId;
	private String matchType;
	private Date time;
	private String matchAddress;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public int getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(int sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getTime() {
		return new SimpleDateFormat("yyyy-MM-dd").format(time);
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMatchAddress() {
		return matchAddress;
	}
	public void setMatchAddress(String matchAddress) {
		this.matchAddress = matchAddress;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", matchName=" + matchName + ", sponsorId=" + sponsorId + ", matchType="
				+ matchType + ", time=" + time + ", matchAddress=" + matchAddress + "]";
	}
	
	
	
}
