package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 
 * 财政端审批结果
 * 
 * @author xushc
 * 
 */
public class ECheckResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -266885200439990264L;

	private String fid; // 主键

	private Integer fchangeState; // 1 审批通过 2 审批退回

	private String fchangeDate; // 审批日期

	private String fchangeMan; // 审批人

	private String fchangeSitu; // 审批意见
	
	public static Integer checkSuccess = 1;
	
	public static Integer checkError = 2;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public Integer getFchangeState() {
		return fchangeState;
	}

	public void setFchangeState(Integer fchangeState) {
		this.fchangeState = fchangeState;
	}

	public String getFchangeDate() {
		return fchangeDate;
	}

	public void setFchangeDate(String fchangeDate) {
		this.fchangeDate = fchangeDate;
	}

	public String getFchangeMan() {
		return fchangeMan;
	}

	public void setFchangeMan(String fchangeMan) {
		this.fchangeMan = fchangeMan;
	}

	public String getFchangeSitu() {
		return fchangeSitu;
	}

	public void setFchangeSitu(String fchangeSitu) {
		this.fchangeSitu = fchangeSitu;
	}

	@Override
	public String toString() {
		return "主键：" + fid + "审批状态：" + fchangeState + "审批日期：" + fchangeDate
				+ "审批人：" + fchangeMan + "审批意见：" + fchangeSitu;
	}

}
