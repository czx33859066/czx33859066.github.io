package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 说明：缴款书明细对象
 * 
 * @author 苏健
 * @since 2014-12-09
 * @version 1.0
 */
public class EPayBookItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1652702376012236347L;
	/**
	 * 序号
	 */
	private int sortNo;
	/**
	 * 项目识别码
	 */
    private String itemIdCode;
    /**
     * 项目编码
     */
    private String itemCode;
    /**
     * 项目名称
     */
    private String itemName; 
    /**
     * 项目标准识别码
     */
    private String itemStdIdCode; 
    /**
     * 项目标准编码
     */
    private String itemStdCode;
    /**
     * 项目标准名称
     */
    private String itemStdName;
    /**
     * 数量
     */
    private BigDecimal number; 
    /**
     * 标准
     */
    private BigDecimal std;
    /**
     * 金额
     */
    private BigDecimal amt; 
    
    /**
     * 单位
     */
    private String units;
    
    /**
     * 全国项目识别码
     */
    private String cenItemidcode;
    
    
    public String getCenItemidcode() {
		return cenItemidcode;
	}

	public void setCenItemidcode(String cenItemidcode) {
		this.cenItemidcode = cenItemidcode;
	}

	/**
     * 单位
     */ 
    public String getUnits() {
		return units;
	}

    /**
     * 单位
     */
	public void setUnits(String units) {
		this.units = units;
	}

	/**
	 * 序号
	 */
	public int getSortNo() {
		return sortNo;
	}
	
	/**
	 * 序号
	 */
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
	/**
	 * 项目识别码
	 */
	public String getItemIdCode() {
		return itemIdCode;
	}
	/**
	 * 项目识别码
	 */
	public void setItemIdCode(String itemIdCode) {
		this.itemIdCode = itemIdCode;
	}
	/**
     * 项目编码
     */
	public String getItemCode() {
		return itemCode;
	}
	/**
     * 项目编码
     */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
     * 项目名称
     */
	public String getItemName() {
		return itemName;
	}
	/**
     * 项目名称
     */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
     * 项目标准识别码
     */
	public String getItemStdIdCode() {
		return itemStdIdCode;
	}
	/**
     * 项目标准识别码
     */
	public void setItemStdIdCode(String itemStdIdCode) {
		this.itemStdIdCode = itemStdIdCode;
	}
	/**
     * 项目标准编码
     */
	public String getItemStdCode() {
		return itemStdCode;
	}
	/**
     * 项目标准编码
     */
	public void setItemStdCode(String itemStdCode) {
		this.itemStdCode = itemStdCode;
	}
	/**
     * 项目标准名称
     */
	public String getItemStdName() {
		return itemStdName;
	}
	/**
     * 项目标准名称
     */
	public void setItemStdName(String itemStdName) {
		this.itemStdName = itemStdName;
	}
	/**
     * 数量
     */
	public BigDecimal getNumber() {
		return number;
	}
	/**
     * 数量
     */
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	/**
     * 标准
     */
	public BigDecimal getStd() {
		return std;
	}
	/**
     * 标准
     */
	public void setStd(BigDecimal std) {
		this.std = std;
	}
	/**
     * 金额
     */
	public BigDecimal getAmt() {
		return amt;
	}
	/**
     * 金额
     */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}
    
}

