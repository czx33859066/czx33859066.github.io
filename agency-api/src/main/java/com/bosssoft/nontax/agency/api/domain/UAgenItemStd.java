package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 单位项目标准
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */
public class UAgenItemStd implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1680980986987825589L;
	private String fid;
	private String frgnCode;
	private String fagenItemIdCode;
	private String fitemStdIdCode ;
	private String fitemStdIDCode;
	private String fagenIdCode;
	private String fitemIdCode;
	private String fmemo;
	private String fauthor;
	private String fisEnable;
	private long fversion;
	private String falterCode;
	private String fcreateTime;
	private String fupdateTime;

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

	public String getFagenItemIdCode() {
		return fagenItemIdCode;
	}

	public void setFagenItemIdCode(String fagenItemIdCode) {
		this.fagenItemIdCode = fagenItemIdCode;
	}

	public String getFitemStdIDCode() {
		return fitemStdIDCode;
	}

	public void setFitemStdIDCode(String fitemStdIDCode) {
		this.fitemStdIDCode = fitemStdIDCode;
	}

	public String getFagenIdCode() {
		return fagenIdCode;
	}

	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}

	public String getFitemIdCode() {
		return fitemIdCode;
	}

	public void setFitemIdCode(String fitemIdCode) {
		this.fitemIdCode = fitemIdCode;
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

	public String getFisEnable() {
		return fisEnable;
	}

	public void setFisEnable(String fisEnable) {
		this.fisEnable = fisEnable;
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

	public String getFitemStdIdCode() {
		return fitemStdIdCode;
	}

	public void setFitemStdIdCode(String fitemStdIdCode) {
		this.fitemStdIdCode = fitemStdIdCode;
	}

}
