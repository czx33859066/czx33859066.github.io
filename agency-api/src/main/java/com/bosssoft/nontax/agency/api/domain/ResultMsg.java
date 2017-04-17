package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 结果消息实体
 * @author C.J.B
 *
 */
public class ResultMsg implements Serializable{
	
	public ResultMsg(){
		
	}
	public ResultMsg(boolean ifSuccess,String resultCode,String resulgMsg){
		this.ifSuccess = ifSuccess ;
		this.resultCode = resultCode ;
		this.resultMsg = resulgMsg ;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean ifSuccess ; //是否成功
 
	private String resultCode ; //信息代码
	                                                                          
	private String resultMsg ;  //中文消息

	public boolean getIfSuccess() {
		return ifSuccess;
	}

	public void setIfSuccess(boolean ifSuccess) {
		this.ifSuccess = ifSuccess;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	
}
