package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 *  票据中心库存号段
 * @author C.J.B
 */
public class TicketCenterStock implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1522970699461633515L;
	private String rgnCode ;
	private String rgnName ;
	private String agenIdCode;
	private String agenCode;
	private String agenName;
	private String placeId;
	private String placeCode;
	private String placeName;
	private String billId;
	private String billCode;
	private String billName;
	private String billBatchCode;
	private String billBatchId ;
	private String invoiceMode;
	private String billNature;
	private String billNoLen;
	private String checkCodeLen;
	private String bgnBillNo;
	private String endBillNo;
	private String number;
	private String isEBill;
	private String warnNum;
	public String getRgnCode() {
		return rgnCode;
	}
	public void setRgnCode(String rgnCode) {
		this.rgnCode = rgnCode;
	}
	public String getRgnName() {
		return rgnName;
	}
	public void setRgnName(String rgnName) {
		this.rgnName = rgnName;
	}
	public String getAgenIdCode() {
		return agenIdCode;
	}
	public void setAgenIdCode(String agenIdCode) {
		this.agenIdCode = agenIdCode;
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
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
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
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillBatchCode() {
		return billBatchCode;
	}
	public void setBillBatchCode(String billBatchCode) {
		this.billBatchCode = billBatchCode;
	}
	public String getInvoiceMode() {
		return invoiceMode;
	}
	public void setInvoiceMode(String invoiceMode) {
		this.invoiceMode = invoiceMode;
	}
	public String getBillNature() {
		return billNature;
	}
	public void setBillNature(String billNature) {
		this.billNature = billNature;
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
	public String getBgnBillNo() {
		return bgnBillNo;
	}
	public void setBgnBillNo(String bgnBillNo) {
		this.bgnBillNo = bgnBillNo;
	}
	public String getEndBillNo() {
		return endBillNo;
	}
	public void setEndBillNo(String endBillNo) {
		this.endBillNo = endBillNo;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getIsEBill() {
		return isEBill;
	}
	public void setIsEBill(String isEBill) {
		this.isEBill = isEBill;
	}
	
	@Override
	public String toString() {
		return "TicketCenterStockSegment [rgnCode=" + rgnCode + ", rgnName=" + rgnName + ", agenIdCode=" + agenIdCode + ", agenCode=" + agenCode
				+ ", agenName=" + agenName + ", placeId=" + placeId + ", placeCode=" + placeCode + ", placeName=" + placeName + ", billId="
				+ billId + ", billCode=" + billCode + ", billName=" + billName + ", billBatchCode=" + billBatchCode + ", invoiceMode="
				+ invoiceMode + ", billNature=" + billNature + ", billNoLen=" + billNoLen + ", checkCodeLen=" + checkCodeLen + ", bgnBillNo="
				+ bgnBillNo + ", endBillNo=" + endBillNo + ", number=" + number + "]";
	}
	public String getBillBatchId() {
		return billBatchId;
	}
	public void setBillBatchId(String billBatchId) {
		this.billBatchId = billBatchId;
	}
	public String getWarnNum() {
		return warnNum;
	}
	public void setWarnNum(String warnNum) {
		this.warnNum = warnNum;
	}
	
}
