package com.bosssoft.nontax.agency.api.service;

import com.bosssoft.nontax.agency.api.domain.ECheckResult;

/**
 * 
 * 开票点审批确认接口
 * 
 * @author xushc
 * 
 */
public interface IEPlacesService {

	/**
	 * 
	 * 收入调整审批结果
	 * 
	 * @param result
	 */
	void placeCheck(ECheckResult result);
}
