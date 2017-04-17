package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class TicketCenterBillBatch implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6492242207619559997L;
	/**
	 * 票据代码
	 */
	private String billBatchCode ;
	/**
	 * 票据批次ID
	 */
	private String billBatchId ;
	/**
	 * 票据年度
	 */
	private String year;
	/**
	 * 限定行数
	 */
	private String limitRows;
	/**
	 * 票号长度
	 */
	private String billNoLen;
	/**
	 * 校验位长度
	 */
	private String checkCodeLen;
	/**
	 * 生效日期
	 */
	private String effDate;
	/**
	 * 失效日期
	 */
	private String expDate ;
	
	public String getBillBatchCode() {
		return billBatchCode;
	}
	public void setBillBatchCode(String billBatchCode) {
		this.billBatchCode = billBatchCode;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getLimitRows() {
		return limitRows;
	}
	public void setLimitRows(String limitRows) {
		this.limitRows = limitRows;
	}
	public String getBillNoLen() {
		return billNoLen;
	}
	public void setBillNoLen(String billNoLen) {
		this.billNoLen = billNoLen;
	}
	public String getCheckCodeLen() {
		return checkCodeLen;
	}
	public void setCheckCodeLen(String checkCodeLen) {
		this.checkCodeLen = checkCodeLen;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getBillBatchId() {
		return billBatchId;
	}
	public void setBillBatchId(String billBatchId) {
		this.billBatchId = billBatchId;
	}
	
	

	
}
