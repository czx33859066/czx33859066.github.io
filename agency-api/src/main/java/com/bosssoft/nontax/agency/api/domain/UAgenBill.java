package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;


/**
 * 单位可用票据
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 * 
 */
public class UAgenBill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7093874917397709136L;
	private String fid;
	private String frgnCode;
	private String fagenIdCode;
	private String fbillId;
	private String feffDate;
	private String fexpDate;
	private String fauthor;
	private long fversion;
	private String falterCode;
	private String fcreateTime;
	private String fupdateTime;
	
	//辅助字段
	private String fbillNatureName;
	private String finvoiceModeName;
	private String fcode;
	private String fname;
	private String funits;
	private String fsafeYear;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFrgnCode() {
		return frgnCode;
	}

	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}

	public String getFagenIdCode() {
		return fagenIdCode;
	}

	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}

	public String getFbillId() {
		return fbillId;
	}

	public void setFbillId(String fbillId) {
		this.fbillId = fbillId;
	}

	public String getFeffDate() {
		return feffDate;
	}

	public void setFeffDate(String feffDate) {
		this.feffDate = feffDate;
	}

	public String getFexpDate() {
		return fexpDate;
	}

	public void setFexpDate(String fexpDate) {
		this.fexpDate = fexpDate;
	}

	public String getFauthor() {
		return fauthor;
	}

	public void setFauthor(String fauthor) {
		this.fauthor = fauthor;
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

	public String getFbillNatureName() {
		return fbillNatureName;
	}

	public void setFbillNatureName(String fbillNatureName) {
		this.fbillNatureName = fbillNatureName;
	}

	public String getFinvoiceModeName() {
		return finvoiceModeName;
	}

	public void setFinvoiceModeName(String finvoiceModeName) {
		this.finvoiceModeName = finvoiceModeName;
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

	public String getFunits() {
		return funits;
	}

	public void setFunits(String funits) {
		this.funits = funits;
	}

	public String getFsafeYear() {
		return fsafeYear;
	}

	public void setFsafeYear(String fsafeYear) {
		this.fsafeYear = fsafeYear;
	}

	
	
}
