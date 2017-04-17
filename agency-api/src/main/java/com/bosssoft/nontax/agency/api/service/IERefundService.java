package com.bosssoft.nontax.agency.api.service;
import com.bosssoft.nontax.agency.api.domain.ECheckResult;

public interface IERefundService {
	
	
	/**
	 * 退付审核
	 * @param result
	 */
	public void refundCheck(ECheckResult result);

}
