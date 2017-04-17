package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 说明：付款对象
 * 
 */
public class EPay implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7993726724446352281L;
	/**
	 * 缴款码
	 */
	private String payCode; 
	
	/**
	 * 渠道
	 */
	private String payChannel;

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

}
