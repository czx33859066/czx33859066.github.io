package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.util.List;

public class TicketCenterBill implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6492242207619559997L;

	private String billId ;
	private String billCode ;
	private String billName;
	private String warnNum;
	private String invoiceMode;
	private String billNature;
	private boolean isEBill;
	private List<TicketCenterBillBatch> billBatchs ;
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
	public String getWarnNum() {
		return warnNum;
	}
	public void setWarnNum(String warnNum) {
		this.warnNum = warnNum;
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
	public boolean isEBill() {
		return isEBill;
	}
	public void setEBill(boolean isEBill) {
		this.isEBill = isEBill;
	}
	public List<TicketCenterBillBatch> getBillBatchs() {
		return billBatchs;
	}
	public void setBillBatchs(List<TicketCenterBillBatch> billBatchs) {
		this.billBatchs = billBatchs;
	}
	
	@Override
	public String toString() {
		return "TicketCenterBill [billId=" + billId + ", billCode=" + billCode + ", billName=" + billName + ", warnNum=" + warnNum + ", invoiceMode="
				+ invoiceMode + ", billNature=" + billNature + ", isEBill=" + isEBill + ", billBatchs=" + billBatchs + "]";
	}

	
}
