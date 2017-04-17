package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class TicketCenterRecycleParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8758638302614812866L;
	private String rgnCode;
	private String agenIdCode;
	private String placeId;
	private String billId;
	private String billBatchCode;
	private Integer number;
	private Integer type;
	public String getRgnCode() {
		return rgnCode;
	}
	public void setRgnCode(String rgnCode) {
		this.rgnCode = rgnCode;
	}
	public String getAgenIdCode() {
		return agenIdCode;
	}
	public void setAgenIdCode(String agenIdCode) {
		this.agenIdCode = agenIdCode;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillBatchCode() {
		return billBatchCode;
	}
	public void setBillBatchCode(String billBatchCode) {
		this.billBatchCode = billBatchCode;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
