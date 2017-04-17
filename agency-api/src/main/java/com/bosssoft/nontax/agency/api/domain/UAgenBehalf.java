package com.bosssoft.nontax.agency.api.domain;
import java.io.Serializable;
/**
 * 
 * 说明： 单位代开单位  Agen_Behalf 的值对象类
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */ 
@SuppressWarnings("serial")
public class UAgenBehalf implements Serializable {

    private String fid; //id  主键

    private String frgncode; //区划编码  

    private String fagenidcode; //单位识别码

    private String faccagenidcode; //代开单位识别码      

    private String faccagencode; //代开单位编码      

    private String faccagenname; //代开单位名称     

    private String fauthor; //编制人      

    private long fversion; //版本号      

    private String faltercode; //变更类型代码

    private String fcreatetime; //创建时间     

    private String fupdatetime; //修改时间

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFrgncode() {
		return frgncode;
	}

	public void setFrgncode(String frgncode) {
		this.frgncode = frgncode;
	}

	public String getFagenidcode() {
		return fagenidcode;
	}

	public void setFagenidcode(String fagenidcode) {
		this.fagenidcode = fagenidcode;
	}

	public String getFaccagenidcode() {
		return faccagenidcode;
	}

	public void setFaccagenidcode(String faccagenidcode) {
		this.faccagenidcode = faccagenidcode;
	}

	public String getFaccagencode() {
		return faccagencode;
	}

	public void setFaccagencode(String faccagencode) {
		this.faccagencode = faccagencode;
	}

	public String getFaccagenname() {
		return faccagenname;
	}

	public void setFaccagenname(String faccagenname) {
		this.faccagenname = faccagenname;
	}

	public String getFauthor() {
		return fauthor;
	}

	public void setFauthor(String fauthor) {
		this.fauthor = fauthor;
	}

	 

	public long getFversion() {
		return fversion;
	}

	public void setFversion(long fversion) {
		this.fversion = fversion;
	}

	public String getFaltercode() {
		return faltercode;
	}

	public void setFaltercode(String faltercode) {
		this.faltercode = faltercode;
	}

	public String getFcreatetime() {
		return fcreatetime;
	}

	public void setFcreatetime(String fcreatetime) {
		this.fcreatetime = fcreatetime;
	}

	public String getFupdatetime() {
		return fupdatetime;
	}

	public void setFupdatetime(String fupdatetime) {
		this.fupdatetime = fupdatetime;
	}
    
    
}
