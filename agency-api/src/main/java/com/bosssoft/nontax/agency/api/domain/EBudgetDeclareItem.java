package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class EBudgetDeclareItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3336444061605132952L;
	
	//序号
	private Integer fsortNo;
	//票据ID
	private String fitemIdCode;
	//调整的预算金额
	private BigDecimal fadjustedBudgetAmt;
	
	public Integer getFsortNo() {
		return fsortNo;
	}
	public void setFsortNo(Integer fsortNo) {
		this.fsortNo = fsortNo;
	}
	public String getFitemIdCode() {
		return fitemIdCode;
	}
	public void setFitemIdCode(String fitemIdCode) {
		this.fitemIdCode = fitemIdCode;
	}
	public BigDecimal getFadjustedBudgetAmt() {
		return fadjustedBudgetAmt;
	}
	public void setFadjustedBudgetAmt(BigDecimal fadjustedBudgetAmt) {
		this.fadjustedBudgetAmt = fadjustedBudgetAmt;
	}
	
	
}
