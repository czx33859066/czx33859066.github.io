package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UItemStd implements Serializable {

	private String fid;
	/**
	 * 项目识别码
	 */
	private String fitemIdCode;
	/**
	 * 收费标准识别码
	 */
	private String fitemStdIdCode;
	/**
	 * 编码
	 */
	private String fcode;
	/**
	 * 名称
	 */
	private String fname;
	/**
	 * 助记码
	 */
	private String fmnem;
	/**
	 * 计量单位
	 */
	private String funits;
	/**
	 * 收费下限
	 */
	private String fminCharge;
	/**
	 * 收费上限
	 */
	private String fmaxCharge;
	/**
	 * 生效日期
	 */
	private String feffDate;
	/**
	 * 失效日期
	 */
	private String fexpDate;
	/**
	 * 备注
	 */
	private String fmemo;
	/**
	 * 编制人
	 */
	private String fauthor;
	/**
	 * 是否最终
	 */
	private String fisFinal;
	/**
	 * 版本号
	 */
	private long fversion;
	/**
	 * 变更类型代码
	 */
	private String falterCode;
	/**
	 * 创建时间
	 */
	private String fcreateTime;
	/**
	 * 修改时间
	 */
	private String fupdateTime;
	/**
	 * 自定义1
	 */
	private String fcustom1;
	/**
	 * 自定义2
	 */
	private String fcustom2;
	/**
	 * 自定义3
	 */
	
	private String fcustom3;
	/**
	 * 是否启用
	 */
	private String fisEnable;
		
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFitemIdCode() {
		return fitemIdCode;
	}
	public void setFitemIdCode(String fitemIdCode) {
		this.fitemIdCode = fitemIdCode;
	}
	public String getFitemStdIdCode() {
		return fitemStdIdCode;
	}
	public void setFitemStdIdCode(String fitemStdIdCode) {
		this.fitemStdIdCode = fitemStdIdCode;
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
	public String getFmnem() {
		return fmnem;
	}
	public void setFmnem(String fmnem) {
		this.fmnem = fmnem;
	}
	public String getFunits() {
		return funits;
	}
	public void setFunits(String funits) {
		this.funits = funits;
	}
	public String getFminCharge() {
		return fminCharge;
	}
	public void setFminCharge(String fminCharge) {
		this.fminCharge = fminCharge;
	}
	public String getFmaxCharge() {
		return fmaxCharge;
	}
	public void setFmaxCharge(String fmaxCharge) {
		this.fmaxCharge = fmaxCharge;
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
	public String getFisFinal() {
		return fisFinal;
	}
	public void setFisFinal(String fisFinal) {
		this.fisFinal = fisFinal;
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

	public String getFisEnable() {
		return fisEnable;
	}

	public void setFisEnable(String fisEnable) {
		this.fisEnable = fisEnable;
	}
	
}
