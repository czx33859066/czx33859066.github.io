package com.bosssoft.nontax.agency.api.service;

import java.util.List;

import com.bosssoft.nontax.agency.api.domain.EPay;
import com.bosssoft.nontax.agency.api.domain.EPayBook;
import com.bosssoft.nontax.agency.api.domain.EPayBookConfirm;
import com.bosssoft.nontax.agency.api.domain.EPayBookReceive;
import com.bosssoft.nontax.agency.api.domain.EPayPlanConfirm;
import com.bosssoft.nontax.agency.api.domain.ETemporaryDeposit;

/**
 * 
 * 说明：单位端对外的api
 * 
 * @author 苏健
 * @since 2014-12-09
 * @version 1.0
 */
public interface IEPayBookService {
	
	/**
	 * 根据缴款对象查询缴款书
	 * @param epay 
	 * @return List<EPayBook>
	 */
	List<EPayBook> queryPayBook(EPay epay);

	/**
	 * 根据缴款码查询缴款书
	 * @param payCode 
	 * @return List<EPayBook>
	 */
	List<EPayBook> queryPayBook(String payCode);

	/**
	 * 根据缴款确认实体进行缴款确认
	 * @param ePayBookConfirm
	 * @return EConfirmResult
	 */
	void confirmPayBook(EPayBookConfirm ePayBookConfirm);
	
	/**
	 * 到账确认
	 * @param paybooks
	 */
	void receivePayBook(List<EPayBookReceive> paybooks);
	
	/**
	 * 暂存款匹配缴款书
	 */
	void autoMatchPayBook(ETemporaryDeposit temporaryDeposit);
	
	/**
	 * 划缴确认(1.0)
	 * @param epaybookList
	 */
	void confirmPayplan(List<EPayBook> epaybookList);
	/**
	 * 确认划缴
	 * @param epaybookList
	 */
	void confirmPayplanNew(List<EPayPlanConfirm> epaybookList) ;
	
}
