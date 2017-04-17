package com.bosssoft.nontax.agency.api.service;
import com.bosssoft.nontax.agency.api.domain.EBudgetDeclare;
import com.bosssoft.nontax.agency.api.domain.ECheckResult;

public interface IEBudgetDeclareService {
	/**
	 *预算申报 审核
	 * @param result
	 */
	public void budgetDeclareCheck(ECheckResult result);
	

	/**
	 * 调整预算申报单中的项目预算金额
	 * @param eBudgetDeclare
	 */
	public void adjustItemBudgetAmt(EBudgetDeclare eBudgetDeclare);
}
