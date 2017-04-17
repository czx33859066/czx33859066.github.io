package com.bosssoft.nontax.agency.api.service;

import com.bosssoft.nontax.agency.api.domain.ECheckResult;

/**
 * 
 * 期初库存审批确认接口
 * 
 * @author xushc
 * 
 */
public interface IEStockBeginService {

	/**
	 * 
	 * 期初库存审批结果
	 * 
	 * @param result
	 */
	void doCheck(ECheckResult result);

}
