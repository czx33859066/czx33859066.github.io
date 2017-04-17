package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 库存转入实体
 * @author C.J.B
 *
 */
public class StockSwitchIn implements Serializable{
	
	public StockSwitchIn(){
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fexternalId ; //流水号，查询用。双方用于匹配的标示符

    private String frgnCode; //区划编码   
    
    private String fagenCode; //单位编码 
    
    private String fapplyman; //领票人
    
    private String foperator ; //经办人
    
    private String fdate; //编制日期      

    private String fmemo; //备注      
    
    private int fchangeState ; //转入变更状态  1 已确认入库 ，不可更改，0 未确认入库 ，可更改
    
	private List<StockSwitchInItem> listItem ; //出库明细记录		

	public String getFrgnCode() {
		return frgnCode;
	}

	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}

	public String getFdate() {
		return fdate;
	}

	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	public String getFmemo() {
		return fmemo;
	}

	public void setFmemo(String fmemo) {
		this.fmemo = fmemo;
	}

	public List<StockSwitchInItem> getListItem() {
		return listItem;
	}

	public void setListItem(List<StockSwitchInItem> listItem) {
		this.listItem = listItem;
	}

	public String getFoperator() {
		return foperator;
	}

	public void setFoperator(String foperator) {
		this.foperator = foperator;
	}

	public String getFexternalId() {
		return fexternalId;
	}

	public void setFexternalId(String fexternalId) {
		this.fexternalId = fexternalId;
	}

	public int getFchangeState() {
		return fchangeState;
	}

	public void setFchangeState(int fchangeState) {
		this.fchangeState = fchangeState;
	}

	public String getFagenCode() {
		return fagenCode;
	}

	public void setFagenCode(String fagenCode) {
		this.fagenCode = fagenCode;
	}

	public String getFapplyman() {
		return fapplyman;
	}

	public void setFapplyman(String fapplyman) {
		this.fapplyman = fapplyman;
	}

	
}
