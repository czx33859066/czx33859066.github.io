package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 库存转入明细
 * @author C.J.B
 *
 */
public class StockSwitchInItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fbillCode; 		// 票据编码
	private String fbillBatchCode ; // 票据代码
	private String fbillNo1; 		// 票据起始号
	private String fbillNo2; 		// 票据终止号
	private double fnumber; 		// 数量
	private double fprice; 			// 单价
	private double famt; 			// 金额
	
	public String getFbillCode() {
		return fbillCode;
	}
	public void setFbillCode(String fbillCode) {
		this.fbillCode = fbillCode;
	}
	public String getFbillBatchCode() {
		return fbillBatchCode;
	}
	public void setFbillBatchCode(String fbillBatchCode) {
		this.fbillBatchCode = fbillBatchCode;
	}
	public String getFbillNo1() {
		return fbillNo1;
	}
	public void setFbillNo1(String fbillNo1) {
		this.fbillNo1 = fbillNo1;
	}
	public String getFbillNo2() {
		return fbillNo2;
	}
	public void setFbillNo2(String fbillNo2) {
		this.fbillNo2 = fbillNo2;
	}
	public double getFnumber() {
		return fnumber;
	}
	public void setFnumber(double fnumber) {
		this.fnumber = fnumber;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	public double getFamt() {
		return famt;
	}
	public void setFamt(double famt) {
		this.famt = famt;
	}

}
