package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.util.List;

public class TicketCenter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1084974027500815292L;
	/**
	 * 区划编码
	 */
	private String rgnCode;
	private String rgnName ;
	/**
	 * 单位识别码
	 */
	private String agenIdCode;
	private String agenCode ;
	private String agenName ;
	/**
	 * 开票点Id
	 */
	private String placeId;

	private String placeCode ;
	private String placeName ;
	
	
	/**
	 * 票据列表
	 */
	private List<TicketCenterBill> bills ;
	
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
	
	public String getRgnName() {
		return rgnName;
	}
	public void setRgnName(String rgnName) {
		this.rgnName = rgnName;
	}
	public String getAgenCode() {
		return agenCode;
	}
	public void setAgenCode(String agenCode) {
		this.agenCode = agenCode;
	}
	public String getAgenName() {
		return agenName;
	}
	public void setAgenName(String agenName) {
		this.agenName = agenName;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public List<TicketCenterBill> getBills() {
		return bills;
	}
	public void setBills(List<TicketCenterBill> bills) {
		this.bills = bills;
	}	

	public TicketCenter() {
		
	}
	
	@Override
	public String toString() {
		return "TicketCenter [rgnCode=" + rgnCode + ", rgnName=" + rgnName + ", agenIdCode=" + agenIdCode + ", agenCode=" + agenCode + ", agenName="
				+ agenName + ", placeId=" + placeId + ", placeCode=" + placeCode + ", placeName=" + placeName + ", bills=" + bills + "]";
	}	
	
	public void check() throws Exception{
		if(isNullOrEmpty(rgnCode))
			throw new Exception("区划编码不能为空") ;
		if(isNullOrEmpty(rgnName))
			throw new Exception("区划名称不能为空") ;		
		if(isNullOrEmpty(agenIdCode)&&(!isNullOrEmpty(placeId)))
			throw new Exception("开票点ID有值时，单位识别码不能为空") ;
	}
	private boolean isNullOrEmpty(String str){
		boolean flag = false ;
		if(str==null||"".equals(str.trim()))
			flag = true ;
		return flag ;
	}
	
}
