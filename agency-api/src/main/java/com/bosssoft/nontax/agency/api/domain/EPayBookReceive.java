package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 到账确认
 * @author chenzhihua
 *
 */
public class EPayBookReceive implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -9175801962125518074L;

	/**
	 * 
	 */
 

	private String fid;
    
    private String fbankCode;
    /**
     * 序列号
     */
    
    private String fserialNo;
    
    /**
     * 单位识别吗
     */
    private String fagenIdCode;
    
    /**
     * 单位编码
     */
    private String fagenCode;
    
    /**
     * 收到日期
     */
    private String frecDate;
    /**
     * 收到时间
     */
    private String frecTime;
    /**
     * 非税账户
     */
    private String ffinAcct;
    /**
     * 金额
     */
    private BigDecimal famt;
    /**
     * 缴款码
     */
    private String fpayCode;
    
    /**
     * 业务类型
     */
    private String fbusType;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFbankCode() {
		return fbankCode;
	}

	public void setFbankCode(String fbankCode) {
		this.fbankCode = fbankCode;
	}

	public String getFserialNo() {
		return fserialNo;
	}

	public void setFserialNo(String fserialNo) {
		this.fserialNo = fserialNo;
	}

	public String getFrecDate() {
		return frecDate;
	}

	public void setFrecDate(String frecDate) {
		this.frecDate = frecDate;
	}

	public String getFrecTime() {
		return frecTime;
	}

	public void setFrecTime(String frecTime) {
		this.frecTime = frecTime;
	}

	public String getFfinAcct() {
		return ffinAcct;
	}

	public void setFfinAcct(String ffinAcct) {
		this.ffinAcct = ffinAcct;
	}



	public BigDecimal getFamt() {
		return famt;
	}

	public void setFamt(BigDecimal famt) {
		this.famt = famt;
	}

	public String getFpayCode() {
		return fpayCode;
	}

	public void setFpayCode(String fpayCode) {
		this.fpayCode = fpayCode;
	}

	public String getFagenIdCode() {
		return fagenIdCode;
	}

	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}

	public String getFagenCode() {
		return fagenCode;
	}

	public void setFagenCode(String fagenCode) {
		this.fagenCode = fagenCode;
	}

	public String getFbusType() {
		return fbusType;
	}

	public void setFbusType(String fbusType) {
		this.fbusType = fbusType;
	}
    
    
  
}
