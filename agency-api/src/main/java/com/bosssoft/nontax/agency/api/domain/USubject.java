package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
/**
 * 预算科目对象实体
 * @author C.J.B
 * @Date 2015-05-31
 *
 */
public class USubject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3645033392698444001L;
	
	private String fid ; 
	private String fpid ; 
	private String fyear ; 
	private Integer flevel ; 
	private Integer fisLeaf ; 
	private String fname ; 
	private String fmemo ; 
	private String fcode ; 
	private String fmnem ; 
	private String fauthor ; 
	private String falterCode ; 
	private String fcreateTime ; 
	private long fversion ; 
	private String fupdateTime ;
	
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFpid() {
		return fpid;
	}
	public void setFpid(String fpid) {
		this.fpid = fpid;
	}
	public String getFyear() {
		return fyear;
	}
	public void setFyear(String fyear) {
		this.fyear = fyear;
	}
	public Integer getFlevel() {
		return flevel;
	}
	public void setFlevel(Integer flevel) {
		this.flevel = flevel;
	}
	public Integer getFisLeaf() {
		return fisLeaf;
	}
	public void setFisLeaf(Integer fisLeaf) {
		this.fisLeaf = fisLeaf;
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
	public String getFcode() {
		return fcode;
	}
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	public String getFmnem() {
		return fmnem;
	}
	public void setFmnem(String fmnem) {
		this.fmnem = fmnem;
	}
	public String getFauthor() {
		return fauthor;
	}
	public void setFauthor(String fauthor) {
		this.fauthor = fauthor;
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
	public long getFversion() {
		return fversion;
	}
	public void setFversion(long fversion) {
		this.fversion = fversion;
	}
	public String getFupdateTime() {
		return fupdateTime;
	}
	public void setFupdateTime(String fupdateTime) {
		this.fupdateTime = fupdateTime;
	}
	
	
}
