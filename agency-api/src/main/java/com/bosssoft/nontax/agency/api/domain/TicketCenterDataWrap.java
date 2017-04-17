package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.util.List;

public class TicketCenterDataWrap implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7636603704219559718L;
	/**
	 * 总记录数
	 */
	private int total ;
	/**
	 * 当前页码
	 */
	private int pageNo ;
	/**
	 * 页大小
	 */
	private int pageSize ;
	/**
	 * 回收秘钥：回收数据量较大时，用回收秘钥可以多次分批回收
	 */
	private String takeBackKey ;
	/**
	 * 是否完成
	 */
	private boolean isDone = false;
	/**
	 * 记录明细
	 */
	List<TicketCenterStock> rows ;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<TicketCenterStock> getRows() {
		return rows;
	}
	public void setRows(List<TicketCenterStock> rows) {
		this.rows = rows;
	}
	public String getTakeBackKey() {
		return takeBackKey;
	}
	public void setTakeBackKey(String takeBackKey) {
		this.takeBackKey = takeBackKey;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
}
