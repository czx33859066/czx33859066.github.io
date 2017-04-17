package com.bosssoft.nontax.agency.api.service;

import java.util.List;

import com.bosssoft.nontax.agency.api.domain.ResultMsg;

/**
 * 
 * @author C.J.B
 * @since 2015-01-12
 * @version 1.0
 */
public interface IEWriteOffApplyService {

	/**
	 * 接收核销单据结果
	 */
	ResultMsg recResult(String result, List<String> ids);
}
