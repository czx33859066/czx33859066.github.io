package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class TicketCenterRecycleResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String found;
	
	private String finalResult;

	public String getFound() {
		return found;
	}

	public void setFound(String found) {
		this.found = found;
	}

	public String getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}
	
}
