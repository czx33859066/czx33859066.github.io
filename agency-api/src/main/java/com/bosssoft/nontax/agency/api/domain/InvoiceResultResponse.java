package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

public class InvoiceResultResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -528953890877828595L;
	/**
	 * 是否成功。业务库中是否存在
	 */
	public boolean isSuccess ;
	/**
	 * 是否最终数据
	 */
	public boolean isFinal ;
	/**
	 * 查询次数
	 */
	public int times ;
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	
}
