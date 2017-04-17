package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 说明：划缴确认
 * 
 * @author C.J.B
 * @since 2016-04-05
 * @version 1.0
 */
public class EPayPlanConfirm implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2582904755131655883L;
	private String payCode	;//缴款码
	private String payerNo	;//缴款人编号
	private String protocolNo	;//划缴协议号
	private String payerName	;//缴（付）款人全称
	private String payerAcct	;//缴（付）款人账号
	private String payerOpBkName	;//缴（付）款人开户行名称
	private String recAcctType	;//收款人账户类型
	private String recName	;//收款人全称
	private String recAcct	;//收款人账号
	private String recOpBkName	;//收款人开户行
	private BigDecimal amt	;//应缴金额
	private String result	;//划缴结果
	private String resultDes	;//划缴结果描述
	private BigDecimal paidAmt	;//实缴金额
	private String traNo	;//流水号
	private String memo	;//备注
	
	public String getPayCode() {
		return payCode;
	}
	
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	
	public String getPayerNo() {
		return payerNo;
	}
	
	public void setPayerNo(String payerNo) {
		this.payerNo = payerNo;
	}
	
	public String getProtocolNo() {
		return protocolNo;
	}
	
	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}
	
	public String getPayerName() {
		return payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getPayerAcct() {
		return payerAcct;
	}
	
	public void setPayerAcct(String payerAcct) {
		this.payerAcct = payerAcct;
	}
	
	public String getPayerOpBkName() {
		return payerOpBkName;
	}
	
	public void setPayerOpBkName(String payerOpBkName) {
		this.payerOpBkName = payerOpBkName;
	}
	
	public String getRecAcctType() {
		return recAcctType;
	}
	
	public void setRecAcctType(String recAcctType) {
		this.recAcctType = recAcctType;
	}
	
	public String getRecName() {
		return recName;
	}
	
	public void setRecName(String recName) {
		this.recName = recName;
	}
	
	public String getRecAcct() {
		return recAcct;
	}
	
	public void setRecAcct(String recAcct) {
		this.recAcct = recAcct;
	}

	public String getRecOpBkName() {
		return recOpBkName;
	}
	
	public void setRecOpBkName(String recOpBkName) {
		this.recOpBkName = recOpBkName;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getResultDes() {
		return resultDes;
	}
	
	public void setResultDes(String resultDes) {
		this.resultDes = resultDes;
	}
	
	public String getTraNo() {
		return traNo;
	}
	
	public void setTraNo(String traNo) {
		this.traNo = traNo;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
		
	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(BigDecimal paidAmt) {
		this.paidAmt = paidAmt;
	}

	@Override
	public String toString() {
		return "EPayPlanConfirm [payCode=" + payCode + ", payerNo=" + payerNo + ", protocolNo=" + protocolNo + ", payerName=" + payerName
				+ ", payerAcct=" + payerAcct + ", payerOpBkName=" + payerOpBkName + ", recAcctType=" + recAcctType + ", recName=" + recName
				+ ", recAcct=" + recAcct + ", recOpBkName=" + recOpBkName + ", amt=" + amt + ", result=" + result + ", resultDes=" + resultDes
				+ ", paidAmt=" + paidAmt + ", traNo=" + traNo + ", memo=" + memo + "]";
	}

	
	
}
