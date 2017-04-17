package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * 说明：缴款书对象
 * 
 * @author 苏健
 * @since 2014-12-09
 * @version 1.0
 */
public class EPayBook implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2582904755131655883L;
	/**
	 * 缴款码
	 */
	private String payCode;
	/**
	 * 填制日期
	 */
	private String fillDate;
	/**
	 * 有效日期
	 */
	private String effectiveDate;
	/**
	 * 执收区划编码
	 */
	private String exeRegionCode;
	/**
	 * 执收单位识别码
	 */
	private String exeAgencyIdCode;
	/**
	 * 执收单位业务码
	 */
	private String exeAgencyCode;
	/**
	 * 执收单位业名称
	 */
	private String exeAgencyName;
	/**
	 * 编制人
	 */
	private String author;
	/**
	 * 备注
	 */
	private String memo;
	/**
	 * 付款帐户名称
	 */
	private String payAcctName;
	/**
	 * 付款帐户开户行名称
	 */
	private String payAcctBank;
	/**
	 * 付款人帐户帐号
	 */
	private String payAcct;
	/**
	 * 收款人帐户名称
	 */
	private String recAcctName;

	/**
	 * 收款人帐户开户行
	 */
	private String recAcctBank;

	/**
	 * 收款人帐户识别码
	 */
	private String recAcctIdCode;
	/**
	 * 收款帐户类型
	 */
	private String recAcctType;
	/**
	 * 收款人帐户帐号
	 */
	private String recAcct;
	/**
	 * 金额合计
	 */
	private BigDecimal totalAmount;
	/**
	 * 缴款书来源
	 */
	private String source;
	/**
	 * 安全码
	 */
	private String securityCode;
	/**
	 * 校验码
	 */
	private String checkCode;
	/**
	 * 确认码
	 */
	private String confirmCode;

	/**
	 * 确认日期
	 */
	private String confirmDate;

	/**
	 * 确认时间
	 */
	private String confirmTime;

	/**
	 * 银行网点编码
	 */
	private String bankOutlet;

	/**
	 * 缴款确认银行编码
	 */
	private String bankCode;

	/**
	 * 缴款类型
	 */
	private String busType;

	/**
	 * 电子收据号
	 */
	private String receiptno;

	/**
	 * 缴款书状态
	 */
	private String state;

	/**
	 * 划缴状态
	 */
	private String payplanState;

	/**
	 * 划缴结果
	 */
	private String payplanResult;

	/**
	 * 缴款渠道名称
	 */
	private String confirmPayModeName;

	/**
	 * 缴款渠道
	 */
	private String confirmPayMode;

	/**
	 * 缴款人
	 */
	private String confirmer;

	/**
	 * 缴款确认流水号(缴款码)
	 */
	private String serialNo;
	
	/**
	 * 绑定渠道
	 */
	private String bindChannel;
	
	/**
	 * 虚拟子账户
	 */
	private String virtualAccount;

	/**
	 * 缴款书明细数据集
	 */
	private List<EPayBookItem> payBookItems;

	/**
	 * 确认日期
	 */
	public String getConfirmDate() {
		return confirmDate;
	}

	/**
	 * 确认日期
	 */
	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
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

	/** 填制日期,格式[YYYY-MM-DD] */
	public String getFillDate() {
		return fillDate;
	}

	/** 填制日期,格式[YYYY-MM-DD] */
	public void setFillDate(String fillDate) {
		this.fillDate = fillDate;
	}

	/** 有效日期,格式[YYYY-MM-DD] */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/** 有效日期,格式[YYYY-MM-DD] */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/** 执收区划编码 */
	public String getExeRegionCode() {
		return exeRegionCode;
	}

	/** 执收区划编码 */
	public void setExeRegionCode(String exeRegionCode) {
		this.exeRegionCode = exeRegionCode;
	}

	/** 执收单位编码 */
	public String getExeAgencyCode() {
		return exeAgencyCode;
	}

	/** 执收单位编码 */
	public void setExeAgencyCode(String exeAgencyCode) {
		this.exeAgencyCode = exeAgencyCode;
	}

	/** 执收单位名称 */
	public String getExeAgencyName() {
		return exeAgencyName;
	}

	/** 执收单位名称 */
	public void setExeAgencyName(String exeAgencyName) {
		this.exeAgencyName = exeAgencyName;
	}

	/** 备注 */
	public String getMemo() {
		return memo;
	}

	/** 备注 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/** 付款人帐户开户行 */
	public String getPayAcctBank() {
		return payAcctBank;
	}

	/** 付款人帐户开户行 */
	public void setPayAcctBank(String payAcctBank) {
		this.payAcctBank = payAcctBank;
	}

	/** 收款人帐户开户行 */
	public String getRecAcctBank() {
		return recAcctBank;
	}

	/** 收款人帐户开户行 */
	public void setRecAcctBank(String recAcctBank) {
		this.recAcctBank = recAcctBank;
	}

	/**
	 * 收款人帐户帐号
	 */
	public void setRecAcct(String recAcct) {
		this.recAcct = recAcct;
	}

	/**
	 * 收款人帐户帐号
	 */
	public String getRecAcct() {
		return recAcct;
	}

	/**
	 * 收款人帐户识别码
	 */
	public void setRecAcctIdCode(String recAcctIdCode) {
		this.recAcctIdCode = recAcctIdCode;
	}

	/**
	 * 收款人帐户识别码
	 */
	public String getRecAcctIdCode() {
		return recAcctIdCode;
	}

	/** 金额合计 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/** 金额合计 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * 执收单位识别码
	 */
	public String getExeAgencyIdCode() {
		return exeAgencyIdCode;
	}

	/**
	 * 执收单位识别码
	 */
	public void setExeAgencyIdCode(String exeAgencyIdCode) {
		this.exeAgencyIdCode = exeAgencyIdCode;
	}

	/**
	 * 编制人
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 编制人
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 付款帐户名称
	 */
	public String getPayAcctName() {
		return payAcctName;
	}

	/**
	 * 付款帐户名称
	 */
	public void setPayAcctName(String payAcctName) {
		this.payAcctName = payAcctName;
	}

	/**
	 * 付款人帐户帐号
	 */
	public String getPayAcct() {
		return payAcct;
	}

	/**
	 * 付款人帐户帐号
	 */
	public void setPayAcct(String payAcct) {
		this.payAcct = payAcct;
	}

	/**
	 * 收款人帐户名称
	 */
	public String getRecAcctName() {
		return recAcctName;
	}

	/**
	 * 收款人帐户名称
	 */
	public void setRecAcctName(String recAcctName) {
		this.recAcctName = recAcctName;
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
	 * 缴款书来源
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 缴款书来源
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 安全码
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * 安全码
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * 校验码
	 */
	public String getCheckCode() {
		return checkCode;
	}

	/**
	 * 校验码
	 */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	/**
	 * 确认码
	 */
	public String getConfirmCode() {
		return confirmCode;
	}

	/**
	 * 确认码
	 */
	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}

	/**
	 * 缴款书明细数据集
	 */
	public List<EPayBookItem> getPayBookItems() {
		return payBookItems;
	}

	/**
	 * 缴款书明细数据集
	 */
	public void setPayBookItems(List<EPayBookItem> payBookItems) {
		this.payBookItems = payBookItems;
	}

	/**
	 * 缴款类型
	 */
	public String getBusType() {
		return busType;
	}

	/**
	 * 缴款类型
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getReceiptno() {
		return receiptno;
	}

	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}

	public String getPayplanState() {
		return payplanState;
	}

	public void setPayplanState(String payplanState) {
		this.payplanState = payplanState;
	}

	public String getPayplanResult() {
		return payplanResult;
	}

	public void setPayplanResult(String payplanResult) {
		this.payplanResult = payplanResult;
	}

	public String getConfirmPayModeName() {
		return confirmPayModeName;
	}

	public void setConfirmPayModeName(String confirmPayModeName) {
		this.confirmPayModeName = confirmPayModeName;
	}

	public String getConfirmPayMode() {
		return confirmPayMode;
	}

	public void setConfirmPayMode(String confirmPayMode) {
		this.confirmPayMode = confirmPayMode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getBankOutlet() {
		return bankOutlet;
	}

	public void setBankOutlet(String bankOutlet) {
		this.bankOutlet = bankOutlet;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getConfirmer() {
		return confirmer;
	}

	public void setConfirmer(String confirmer) {
		this.confirmer = confirmer;
	}

	public String getBindChannel() {
		return bindChannel;
	}

	public void setBindChannel(String bindChannel) {
		this.bindChannel = bindChannel;
	}

	public String getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(String virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

}
