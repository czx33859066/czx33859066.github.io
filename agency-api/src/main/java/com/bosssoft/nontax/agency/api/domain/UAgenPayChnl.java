package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 
 * 说明： 单位对应缴款渠道的值对象类
 * 
 * @author  lzp
 * @since 2014-12-05
 * @version 1.0
 */ 
public class UAgenPayChnl implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 30603567399179647L;

	private String fid; //主键   (主键)     

	private String frgnCode;
    private String fagenIdCode; //单位识别码      

    private String fpayChnlCode; //缴款渠道代码      

    private String falterCode; //变更类型代码      

    private long fversion; //版本号    
    
    private String fchnlName;//缴款渠道名称
    

    
    private String fcreateTime;
    private String fupdateTime;
    
    public String getFchnlName() {
		return fchnlName;
	}

	public void setFchnlName(String fchnlName) {
		this.fchnlName = fchnlName;
	}

    /** 以下为get,set方法 */

	/**
	 * @return 返回 主键
	 */
    public String getFid() {
      return this.fid;
    }
    /**
	 * @param fid
	 *            要设置的 主键
	 */
    public void setFid(String fid) {
      this.fid = fid;
    }

	/**
	 * @return 返回 单位识别码
	 */
    public String getFagenIdCode() {
      return this.fagenIdCode;
    }
    /**
	 * @param fagenIDCode
	 *            要设置的 单位识别码
	 */
    public void setFagenIdCode(String fagenIdCode) {
      this.fagenIdCode = fagenIdCode;
    }

	/**
	 * @return 返回 缴款渠道代码
	 */
    public String getFpayChnlCode() {
      return this.fpayChnlCode;
    }
    /**
	 * @param fpayChnlCode
	 *            要设置的 缴款渠道代码
	 */
    public void setFpayChnlCode(String fpayChnlCode) {
      this.fpayChnlCode = fpayChnlCode;
    }

	/**
	 * @return 返回 变更类型代码
	 */
    public String getFalterCode() {
      return this.falterCode;
    }
    /**
	 * @param falterCode
	 *            要设置的 变更类型代码
	 */
    public void setFalterCode(String falterCode) {
      this.falterCode = falterCode;
    }

	/**
	 * @return 返回 版本号
	 */
    public Long getFversion() {
      return this.fversion;
    }
    /**
	 * @param fversion
	 *            要设置的 版本号
	 */
    public void setFversion(Long fversion) {
      this.fversion = fversion;
    }

  	public String getFrgnCode() {
		return frgnCode;
	}

	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}

	public String getFcreateTime() {
		return fcreateTime;
	}

	public void setFcreateTime(String fcreateTime) {
		this.fcreateTime = fcreateTime;
	}

	public String getFupdateTime() {
		return fupdateTime;
	}

	public void setFupdateTime(String fupdateTime) {
		this.fupdateTime = fupdateTime;
	}

	public void setFversion(long fversion) {
		this.fversion = fversion;
	}

	/**
	 * 将对象的内容以字符串的方式输出
	 */
    public String toString()
    {
        StringBuffer str = new StringBuffer();

        str.append(this.getClass().getName())
            .append("[ 主键=").append(this.fid)
            .append(", 单位识别码=").append(this.fagenIdCode)
            .append(", 缴款渠道代码=").append(this.fpayChnlCode)
            .append(", 变更类型代码=").append(this.falterCode)
            .append(", 版本号=").append(this.fversion)
            .append(" ]");

        return str.toString();
    }
}
