package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class EAdjustItemBudget implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7064268581290667967L;
	
	private String fid; //
	private Integer fsortNo;
	private BigDecimal fadjustedBudgetAmt;
	
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public Integer getFsortNo() {
		return fsortNo;
	}
	public void setFsortNo(Integer fsortNo) {
		this.fsortNo = fsortNo;
	}
	public BigDecimal getFadjustedBudgetAmt() {
		return fadjustedBudgetAmt;
	}
	public void setFadjustedBudgetAmt(BigDecimal fadjustedBudgetAmt) {
		this.fadjustedBudgetAmt = fadjustedBudgetAmt;
	}
	
	
	

}
