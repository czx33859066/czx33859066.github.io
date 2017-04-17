package com.bosssoft.nontax.agency.api.service;

import com.bosssoft.nontax.agency.api.domain.ResultMsg;
import com.bosssoft.nontax.agency.api.domain.StockSwitchIn;

/**
 * 
 * 说明：WEB版票据向三代票据下发票据接口
 * 
 * @author C.J.B
 * @since 2015-01-12
 * @version 1.0
 */
public interface IEStockSwitchInService {

	/**
	 * 执行库存转入
	 * @param payCode 
	 * @return List<EPayBook>
	 */
	ResultMsg doStockSwitchIn(StockSwitchIn ssi);
	
	/**
	 * 执行库存转入
	 */
	void doStockInFromFinance(StockSwitchIn ssi);
	
	/**
	 * 删除转入单据
	 * @param fserialNumber
	 * @return
	 */
	ResultMsg doStockSwitchDel(String fexternalId) ;
	
	/**
	 * 外部系统发起入库确认
	 * @param fexternalId 外部系统单据唯一标识
	 */
	void doStockInConfirm(String fexternalId);
	
	/**
	 * 查询转入单据
	 * @param fserialNumber
	 * @return
	 */
	StockSwitchIn queryStockSwitchIn(String fexternalId) ;
}
