/**
 * 
 */
package com.bosssoft.nontax.agency.api.service;

import java.util.List;

import com.bosssoft.nontax.agency.api.domain.InvoiceResultResponse;
import com.bosssoft.nontax.agency.api.domain.TicketCenter;
import com.bosssoft.nontax.agency.api.domain.TicketCenterDataWrap;
import com.bosssoft.nontax.agency.api.domain.TicketCenterFreezed;
import com.bosssoft.nontax.agency.api.domain.TicketCenterRecycleParam;
import com.bosssoft.nontax.agency.api.domain.TicketCenterRecycleResult;
import com.bosssoft.nontax.agency.api.domain.TicketCenterStock;

/**
 * @author C.J.B
 */
public interface ITicketCenterService {
	/**
	 * 创建或修改票号池
	 * @param ticketCenter
	 * @throws Exception
	 */
	public void createOrUpdateTicketCenter(TicketCenter ticketCenter) throws Exception;
	/**
	 * 推送到票号中心
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param bills 票据列表
	 * @throws Exception
	 */
	/**
	 * @param id
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param bills
	 * @throws Exception
	 */
	public void pushToTicketCenter(String id,String rgnCode,String agenIdCode,String placeId,List<TicketCenterStock> bills)	throws Exception ;
	/**
	 * 分页查询票据中心明细库存
	 * @param rgnCode 区划编码，必填
	 * @param agenIdCode 单位识别码，非必填       开票点id不为空时，单位识别码不能为空
	 * @param placeId 开票点id，非必填
	 * @param billId 票据id 非必填          票据代码不为空时，票据id必填
	 * @param billBatchCode 票据代码 非必填
	 * @param Scope 查询范围 1： 表示往下级查询 0：只查询当前级
	 * @param Page 当前页码
	 * @param Size 页大小
	 * @return 
	 */
	public TicketCenterDataWrap queryTCStockDetailByPage(String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode,int Scope,int Page,int Size) ;
	/**
	 * 查询票据中心库存明细不分页
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param billId
	 * @param billBatchCode
	 * @param Scope
	 * @return
	 */
	public TicketCenterDataWrap queryTCStockDetail(String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode,int Scope) ;
	/**
	 * 查询票据中心库存，返回统计信息，按票据代码统计
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param billId
	 * @param billBatchCode
	 * @param Scope
	 * @return
	 */
	public TicketCenterDataWrap queryTCStockTotal(String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode,int Scope) ;
	/**
	 * 按条件回收库存，返回回收明细
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param billId
	 * @param billBatchCode
	 * @param type 回收类型
	 * @param number 每次回收数量
	 * @param takeBackKey 很批次回收库存凭证
	 * @return
	 */
	public TicketCenterDataWrap  takeBackTCStockByContidion(String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode,int type,int number,String takeBackKey,String userName) ;
	/**
	 * 按号段回收库存，返回回收明细
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param billId
	 * @param billBatchCode
	 * @param bgnBillNo
	 * @param endBillNo
	 * @return
	 */
	public TicketCenterDataWrap  takeBackTCStockByDetail(String rgnCode,String agenIdCode,String placeId,List<TicketCenterStock> billList) ;

	/**
	 * 查询票号
	 * @param userId 用户ID 
	 * @param rgnCode 区划编码
	 * @param agenIdCode 单位识别码
	 * @param placeId 开票点ID
	 * @param billBatchCode 票据代码
	 * @param invoiceMode 开票方式 1电子开票,2机打开票,3手工开票
	 * @param billNature 票据性质 1非税票据,2缴款书,3缴款书含收据联,9其他
	 * @param targetBillNo 欲取的票号
	 * @param lastBillNo 末次票号
	 * @return
	 * @throws Exception  000001
	 */
	public TicketCenterStock queryBillNo(String userId,String rgnCode,String agenIdCode,String placeId,String billId,
			String billBatchCode,String invoiceMode,String billNature,String bussTypeId,String targetBillNo,String lastBillNo) throws Exception ;	
	/**
	 * 确认出票
	 * @param userId
	 * @param placeId
	 * @param bussTypeId 业务类型ID
	 * @param billNo 要确认扣除的票号
	 * @throws Exception
	 */
	public boolean confirmOutTicket(String userId,String bussTypeId,String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode, String billNo1,String billNo2) ;
	/**
	 * 手工票扣票号
	 * @param userId
	 * @param rgnCode
	 * @param agenIdCode
	 * @param placeId
	 * @param billId
	 * @param billBatchCode
	 * @param bgnBillNo
	 * @param endBillNo
	 * @param bussTypeId
	 */
	public void outStockOfHandBill(String userId,String rgnCode,String agenIdCode,String placeId,String billId,String billBatchCode,String bgnBillNo,String endBillNo,String bussTypeId) ;
	/**
	 * 接收票据中心库存预警
	 */
	public void receiveTCStockWarn(String frgnCode, String fagenIdCode, String fplaceId, String fbillId, String fnumber) ;
	/**
	 * 查询上级区划编码
	 * @param rgnCode
	 * @return
	 */
	public String queryUpRgnCode(String rgnCode) ;
	
	/**
	 * 预确认回收
	 * @param id
	 */
	public void preConfirmRecycle(String id);
	
	/**
	 * 确认回收
	 * @param id
	 */
	public void confirmRecycle(String id);
	
	/**
	 * 取消回收
	 * @param id
	 */
	public void cancelRecycle(String id);
	
	/**
	 * 查询回收票据
	 * @param page
	 * @param pageSize
	 * @param takeBackKey
	 * @return
	 */
	public TicketCenterDataWrap queryRecycleStock(int page,int pageSize,String takeBackKey);
	
	/**
	 * 混合回收
	 * @return
	 */
	public TicketCenterDataWrap takeBackTCStockByMulti(String userName,List<TicketCenterRecycleParam> params);
	
	/**
	 * 当前未完成回收的单据
	 */
	public List<TicketCenterFreezed> queryExistRecycleIds(String rgnCode,String agenIdCode,String placeId);
	
	/**
	 * 查询单据推送是否成功
	 * @param id
	 * @return
	 */
	public boolean queryPush(String id);
	/**
	 * 锁票号
	 * @return
	 */
	public boolean lockTicket(String userId,String bussTypeId,String billId,String billBatchCode,String bgnBillNo,String endBillNo) ;

	/**
	 * 查询回收是否成功
	 * @param dto
	 * @return
	 */
	public TicketCenterRecycleResult queryRecycleResult(String rgnCode,String agenIdCode,String placeId,String takeBackKey,String time);
	/**
	 * 查询票号锁定信息
	 * @param bussTypeId
	 * @param billId
	 * @param billBatchCode
	 * @param bgnBillNo
	 * @param endBillNo
	 * @return
	 */
	public InvoiceResultResponse queryInvoiceResult(String userId,String bussTypeId,String billId,String billBatchCode,String bgnBillNo,String endBillNo,String times) ;

}
