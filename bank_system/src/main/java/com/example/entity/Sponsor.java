package com.example.entity;

public class Sponsor {

	private int sponsorId;
	private String sponsorName;
	private String sponsorPassword;
	private String sponsorAddress;
	private String sponsorLinkman;
	private String sponsorTel;
	
	public int getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(int sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public String getSponsorPassword() {
		return sponsorPassword;
	}
	public void setSponsorPassword(String sponsorPassword) {
		this.sponsorPassword = sponsorPassword;
	}
	public String getSponsorAddress() {
		return sponsorAddress;
	}
	public void setSponsorAddress(String sponsorAddress) {
		this.sponsorAddress = sponsorAddress;
	}
	public String getSponsorLinkman() {
		return sponsorLinkman;
	}
	public void setSponsorLinkman(String sponsorLinkman) {
		this.sponsorLinkman = sponsorLinkman;
	}
	public String getSponsorTel() {
		return sponsorTel;
	}
	public void setSponsorTel(String sponsorTel) {
		this.sponsorTel = sponsorTel;
	}
	@Override
	public String toString() {
		return "Sponsor [sponsorId=" + sponsorId + ", sponsorName=" + sponsorName + ", sponsorPassword="
				+ sponsorPassword + ", sponsorAddress=" + sponsorAddress + ", sponsorLinkman=" + sponsorLinkman
				+ ", sponsorTel=" + sponsorTel + "]";
	}
	
}
