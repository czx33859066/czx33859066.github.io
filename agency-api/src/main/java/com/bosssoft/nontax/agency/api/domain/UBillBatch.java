package com.bosssoft.nontax.agency.api.domain;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 票据批次 UAB_BILL_BATCH 值对象 * 
 * @author  C.J.B
 * @since 2014-10-22
 * @version 1.0
 */ 
@SuppressWarnings("serial")
public class UBillBatch implements Serializable {

    private String fid; //主键  

    private String fbillId; //票据类型ID     

    private String fcode; //票据批次号代码     

    private String fname; //票据批次号名称   

    private String fmemo; //备注     

    private String fauthor; //编制人   

    private Integer fcopyNum; //份数    

    private Integer fjoinNum; //联数

    private Integer fbillNoLen; //票号长度      

    private BigDecimal fagenPrice; //单位价      

    private String fyear; //年度     

    private Integer flimitRowNo; //限制行数

    private long fversion; //版本号      

    private String falterCode; //修改类型代码      

    private String fcreateTime; //创建时间     

    private String fupdateTime; //修改时间     

    private String fcustom1; //自定义1     

    private String fcustom2; //自定义2   

    private String fcustom3; //自定义3  
    
    private String fcheckCodeLen;//效验位数

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFbillId() {
		return fbillId;
	}

	public void setFbillId(String fbillId) {
		this.fbillId = fbillId;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFmemo() {
		return fmemo;
	}

	public void setFmemo(String fmemo) {
		this.fmemo = fmemo;
	}

	public String getFauthor() {
		return fauthor;
	}

	public void setFauthor(String fauthor) {
		this.fauthor = fauthor;
	}

	public Integer getFcopyNum() {
		return fcopyNum;
	}

	public void setFcopyNum(Integer fcopyNum) {
		this.fcopyNum = fcopyNum;
	}

	public Integer getFjoinNum() {
		return fjoinNum;
	}

	public void setFjoinNum(Integer fjoinNum) {
		this.fjoinNum = fjoinNum;
	}

	public Integer getFbillNoLen() {
		return fbillNoLen;
	}

	public void setFbillNoLen(Integer fbillNoLen) {
		this.fbillNoLen = fbillNoLen;
	}

	public BigDecimal getFagenPrice() {
		return fagenPrice;
	}

	public void setFagenPrice(BigDecimal fagenPrice) {
		this.fagenPrice = fagenPrice;
	}

	public String getFyear() {
		return fyear;
	}

	public void setFyear(String fyear) {
		this.fyear = fyear;
	}

	public Integer getFlimitRowNo() {
		return flimitRowNo;
	}

	public void setFlimitRowNo(Integer flimitRowNo) {
		this.flimitRowNo = flimitRowNo;
	}

	public long getFversion() {
		return fversion;
	}

	public void setFversion(long fversion) {
		this.fversion = fversion;
	}

	public String getFalterCode() {
		return falterCode;
	}

	public void setFalterCode(String falterCode) {
		this.falterCode = falterCode;
	}

	public String getFcreateTime() {
		return fcreateTime;
	}

	public void setFcreateTime(String fcreateTime) {
		this.fcreateTime = fcreateTime;
	}

	public String getFupdateTime() {
		return fupdateTime;
	}

	public void setFupdateTime(String fupdateTime) {
		this.fupdateTime = fupdateTime;
	}

	public String getFcustom1() {
		return fcustom1;
	}

	public void setFcustom1(String fcustom1) {
		this.fcustom1 = fcustom1;
	}

	public String getFcustom2() {
		return fcustom2;
	}

	public void setFcustom2(String fcustom2) {
		this.fcustom2 = fcustom2;
	}

	public String getFcustom3() {
		return fcustom3;
	}

	public void setFcustom3(String fcustom3) {
		this.fcustom3 = fcustom3;
	}

	public String getFcheckCodeLen() {
		return fcheckCodeLen;
	}

	public void setFcheckCodeLen(String fcheckCodeLen) {
		this.fcheckCodeLen = fcheckCodeLen;
	}


}
