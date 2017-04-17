package com.bosssoft.nontax.agency.api.service;

import com.bosssoft.nontax.agency.api.domain.ECheckResult;

/**
 * 
 * 非税票据申领审批确认接口
 * 
 * @author xushc
 * 
 */
public interface IEStockApplyService {

	/**
	 * 
	 * 非税票据申领审批结果
	 * 
	 * @param result
	 */
	void stockApplyCheck(ECheckResult result);

}
