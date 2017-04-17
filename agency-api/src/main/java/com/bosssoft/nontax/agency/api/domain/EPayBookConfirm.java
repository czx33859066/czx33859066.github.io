package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 说明：缴款确认对象
 * 
 * @author 苏健
 * @since 2014-12-09
 * @version 1.0
 */
public class EPayBookConfirm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7993726724446352281L;
	/**
	 * 缴款码
	 */
	private String payCode; 
	/**
	 * 缴款确认日期
	 */
	private String confirmDate; 
	/**
     * 缴款时间
     */
    private String confirmTime;
	/**
	 * 缴款缴款确认码
	 */
	private String confirmCode; 
	/**
	 * 经办人
	 */
	private String operator; 
	/**
	 * 银行网点
	 */
	private String bankOutLet;  
	/**
	 * 缴款银行
	 */
	private String payProxyBank;

	/**
	 * 缴款渠道
	 */
	private String paymentChannel;
	
	/**
	 * 收款人（所属银行）
	 */
	private String recAcctBank; 
	
	/**
	 * 收款人帐户开户行
	 */
	private String recAcctOpBank; 
	
	/**
	 * 收款人帐户识别码 
	 */
	private String recAcctIdCode;
	/**
	 * 收款帐户类型
	 */
	private String recAcctType; 
	/**
	 *  收款人帐户帐号
	 */
	private String recAcct;
	
	/**
	 * 资金到账情况
	 */
	private int receive;
	
	/**
	 *  金额
	 */
	private BigDecimal totalAmt;
	
	/**
	 * 应用发起源
	 */
	private String appSrc;
	

	public String getAppSrc() {
		return appSrc;
	}

	public void setAppSrc(String appSrc) {
		this.appSrc = appSrc;
	}

	public int getReceive() {
		return receive;
	}
	
	public void setReceive(int receive) {
		this.receive = receive;
	}
	/**
	 * 缴款码
	 */
	public String getPayCode() {
		return payCode;
	}
	/**
	 * 缴款码
	 */
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	/**
	 * 缴款确认日期
	 */
	public String getConfirmDate() {
		return confirmDate;
	}
	/**
	 * 缴款确认日期
	 */
	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
	}
	/**
	 * 缴款缴款确认码
	 */
	public String getConfirmCode() {
		return confirmCode;
	}
	/**
	 * 缴款缴款确认码
	 */
	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}
	/**
	 * 经办人
	 */
	public String getOperator() {
		return operator;
	}
	/**
	 * 经办人
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	/**
	 * 银行网点
	 */
	public String getBankOutLet() {
		return bankOutLet;
	}
	/**
	 * 银行网点
	 */
	public void setBankOutLet(String bankOutLet) {
		this.bankOutLet = bankOutLet;
	}
	/**
	 * 缴款银行
	 */
	public String getPayProxyBank() {
		return payProxyBank;
	}
	/**
	 * 缴款银行
	 */
	public void setPayProxyBank(String payProxyBank) {
		this.payProxyBank = payProxyBank;
	}
	/**
	 * 缴款渠道
	 */
	public String getPaymentChannel() {
		return paymentChannel;
	}
	/**
	 * 缴款渠道
	 */
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	/**
	 * 收款人帐户开户行
	 */
	public String getRecAcctBank() {
		return recAcctBank;
	}
	/**
	 * 收款人帐户开户行
	 */
	public void setRecAcctBank(String recAcctBank) {
		this.recAcctBank = recAcctBank;
	}
	/**
	 * 收款人帐户识别码  
	 */
	public String getRecAcctIdCode() {
		return recAcctIdCode;
	}
	/**
	 * 收款人帐户识别码 
	 */
	public void setRecAcctIdCode(String recAcctIdCode) {
		this.recAcctIdCode = recAcctIdCode;
	}
	/**
	 * 收款帐户类型
	 */
	public String getRecAcctType() {
		return recAcctType;
	}
	/**
	 * 收款帐户类型
	 */
	public void setRecAcctType(String recAcctType) {
		this.recAcctType = recAcctType;
	}
	/**
	 * 收款人帐户帐号
	 */
	public String getRecAcct() {
		return recAcct;
	}
	/**
	 * 收款人帐户帐号
	 */
	public void setRecAcct(String recAcct) {
		this.recAcct = recAcct;
	}
	/**
	 * 缴款时间
	 */
	public String getConfirmTime() {
		return confirmTime;
	}
	/**
	 * 缴款时间
	 */
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	/**
	 *  金额
	 */
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	/**
	 *  金额
	 */
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getRecAcctOpBank() {
		return recAcctOpBank;
	}

	public void setRecAcctOpBank(String recAcctOpBank) {
		this.recAcctOpBank = recAcctOpBank;
	}
	
}
