package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class TicketCenterFreezed implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1397218326635660650L;

	private String userName;
	
	private long date;
	
	private String takeBackKey;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getTakeBackKey() {
		return takeBackKey;
	}

	public void setTakeBackKey(String takeBackKey) {
		this.takeBackKey = takeBackKey;
	}

}
