package com.bosssoft.nontax.agency.api.exception;

/**
 * 
 * 说明：缴款书接口异常类
 * 
 * @author  sujian
 * @since 2014-10-31
 * @version 1.0
 */
public class PayBookException extends RuntimeException{

	private static final long serialVersionUID = -4627320533128935538L;
	
	private ExceptionEnum ee;

    public PayBookException() {
        super();
    }

    public PayBookException(String message){
        super(message);
    }
    
    public PayBookException(String message, ExceptionEnum ee){
        super(message);
        this.ee = ee;
    }

	public ExceptionEnum getEe() {
		return ee;
	}

	public void setEe(ExceptionEnum ee) {
		this.ee = ee;
	}
}
