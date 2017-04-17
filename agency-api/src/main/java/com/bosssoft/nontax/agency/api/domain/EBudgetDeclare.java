package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.util.List;
import com.bosssoft.nontax.agency.api.domain.EBudgetDeclareItem;

public class EBudgetDeclare implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7079192792442756146L;
	
	//ID
	private String fid;
	//单号
	private String fno;
	//区划编码
	private String frgnCode;
	//单位识别码
	private String fagenIdCode;
	//年度
	private Integer fyear;
	//填报人
	private String foperator;
	//备注
	private String fmemo;
	//填报日期
	private String fdate;
	//联系人
	private String flinkMan;
	//联系电话
	private String flinkTel;
	//收入预算申报单明细
	private List<EBudgetDeclareItem> itemList;
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFno() {
		return fno;
	}
	public void setFno(String fno) {
		this.fno = fno;
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
	public Integer getFyear() {
		return fyear;
	}
	public void setFyear(Integer fyear) {
		this.fyear = fyear;
	}
	public String getFoperator() {
		return foperator;
	}
	public void setFoperator(String foperator) {
		this.foperator = foperator;
	}
	public String getFmemo() {
		return fmemo;
	}
	public void setFmemo(String fmemo) {
		this.fmemo = fmemo;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getFlinkMan() {
		return flinkMan;
	}
	public void setFlinkMan(String flinkMan) {
		this.flinkMan = flinkMan;
	}
	public String getFlinkTel() {
		return flinkTel;
	}
	public void setFlinkTel(String flinkTel) {
		this.flinkTel = flinkTel;
	}
	public List<EBudgetDeclareItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<EBudgetDeclareItem> itemList) {
		this.itemList = itemList;
	}
	
	
	
}
