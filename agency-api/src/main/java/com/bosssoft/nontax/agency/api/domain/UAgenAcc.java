package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 
 * 说明： UAB_ACC的值对象类
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */ 
public class UAgenAcc implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -218829551591039544L;


    private String fid; //主键  
    
    private String frgnCode; //区划ID      

    private String fagenIdCode; //单位识别码

    private String faccIdCode; //账户识别码   

    private String faccount; //账户

    private String faccName; //账户号码     

    private String fbankOpenName; //开户银行名称   

    private String fbankId; //银行ID      

    private String faccType; //账户类型 
    
    private String faccTypeName ;//账户类型名称
    
    private String ffundsNature ;// 
    private String ffundsNatureCode ;//资金性质编码
    
    private String ffundsNatureName ;//

    private String feffDate; //生效日期      

    private String fexpDate; //失效日期

    private int fisFinal; //是否最终数据

    private String fauthor; //编制人    

    private long fversion; //版本号  

    private String falterCode; //变更类型代码     

    private String fcreateTime; //创建时间  

    private String fupdateTime; //修改时间    

    private String fcustom1; //自定义1      

    private String fcustom2; //自定义2      

    private String fcustom3; //自定义3     
    
    //辅助字段   
    private String fname;//单位名称
    private String fcode;//单位编码
    private String fbankName;//代理银行
    
    private String fadaptScope;//适用范围
    
    private String faccSetIdCode ;//账户设置规则识别码

    /** 以下为get,set方法 */

	/**
	 * @return 返回 fid
	 */
    public String getFid() {
      return this.fid;
    }
    /**
	 * @param fid
	 *            要设置的 fid
	 */
    public void setFid(String fid) {
      this.fid = fid;
    }

	/**
	 * @return 返回 faccount
	 */
    public String getFaccount() {
      return this.faccount;
    }
    /**
	 * @param faccount
	 *            要设置的 faccount
	 */
    public void setFaccount(String faccount) {
      this.faccount = faccount;
    }

	/**
	 * @return 返回 fbankopenname
	 */
    public String getFbankOpenName() {
      return this.fbankOpenName;
    }
    /**
	 * @param fbankOpenName
	 *            要设置的 fbankopenname
	 */
    public void setFbankOpenName(String fbankOpenName) {
      this.fbankOpenName = fbankOpenName;
    }

	/**
	 * @return 返回 fbankid
	 */
    public String getFbankId() {
      return this.fbankId;
    }
    /**
	 * @param fbankId
	 *            要设置的 fbankid
	 */
    public void setFbankId(String fbankId) {
      this.fbankId = fbankId;
    }

	/**
	 * @return 返回 见字典表（账户类型） (1：国库；2：专户；3：归集户；4：
	 */
    public String getFaccType() {
      return this.faccType;
    }
    /**
	 * @param faccType
	 *            要设置的 见字典表（账户类型） (1：国库；2：专户；3：归集户；4：
	 */
    public void setFaccType(String faccType) {
      this.faccType = faccType;
    }

	public String getFfundsNature() {
		return ffundsNature;
	}

	public void setFfundsNature(String ffundsNature) {
		this.ffundsNature = ffundsNature;
	}

	/**
	 * @return 返回 fauthor
	 */
    public String getFauthor() {
      return this.fauthor;
    }
    /**
	 * @param fauthor
	 *            要设置的 fauthor
	 */
    public void setFauthor(String fauthor) {
      this.fauthor = fauthor;
    }

	/**
	 * @return 返回 fversion
	 */
    public long getFversion() {
      return this.fversion;
    }
    /**
	 * @param fversion
	 *            要设置的 fversion
	 */
    public void setFversion(long fversion) {
      this.fversion = fversion;
    }

	/**
	 * @return 返回 见数据字典（变更类型代码１新增　２修改）
	 */
    public String getFalterCode() {
      return this.falterCode;
    }
    /**
	 * @param falterCode
	 *            要设置的 见数据字典（变更类型代码１新增　２修改）
	 */
    public void setFalterCode(String falterCode) {
      this.falterCode = falterCode;
    }

	/**
	 * @return 返回 fcreatetime
	 */
    public String getFcreateTime() {
      return this.fcreateTime;
    }
    /**
	 * @param fcreateTime
	 *            要设置的 fcreatetime
	 */
    public void setFcreateTime(String fcreateTime) {
      this.fcreateTime = fcreateTime;
    }

	/**
	 * @return 返回 fupdatetime
	 */
    public String getFupdateTime() {
      return this.fupdateTime;
    }
    /**
	 * @param fupdateTime
	 *            要设置的 fupdatetime
	 */
    public void setFupdateTime(String fupdateTime) {
      this.fupdateTime = fupdateTime;
    }

	/**
	 * @return 返回 fcustom1
	 */
    public String getFcustom1() {
      return this.fcustom1;
    }
    /**
	 * @param fcustom1
	 *            要设置的 fcustom1
	 */
    public void setFcustom1(String fcustom1) {
      this.fcustom1 = fcustom1;
    }

	/**
	 * @return 返回 fcustom2
	 */
    public String getFcustom2() {
      return this.fcustom2;
    }
    /**
	 * @param fcustom2
	 *            要设置的 fcustom2
	 */
    public void setFcustom2(String fcustom2) {
      this.fcustom2 = fcustom2;
    }

	/**
	 * @return 返回 fcustom3
	 */
    public String getFcustom3() {
      return this.fcustom3;
    }
    /**
	 * @param fcustom3
	 *            要设置的 fcustom3
	 */
    public void setFcustom3(String fcustom3) {
      this.fcustom3 = fcustom3;
    }

	public String getFrgnCode() {
		return frgnCode;
	}

	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}

	public String getFagenIdCode() {
		return fagenIdCode;
	}

	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}

	public String getFaccIdCode() {
		return faccIdCode;
	}

	public void setFaccIdCode(String faccIdCode) {
		this.faccIdCode = faccIdCode;
	}

	public String getFaccName() {
		return faccName;
	}

	public void setFaccName(String faccName) {
		this.faccName = faccName;
	}

	public String getFeffDate() {
		return feffDate;
	}

	public void setFeffDate(String feffDate) {
		this.feffDate = feffDate;
	}

	public String getFexpDate() {
		return fexpDate;
	}

	public void setFexpDate(String fexpDate) {
		this.fexpDate = fexpDate;
	}

	public int getFisFinal() {
		return fisFinal;
	}

	public void setFisFinal(int fisFinal) {
		this.fisFinal = fisFinal;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

 
 
	public String getFbankName() {
		return fbankName;
	}

	public void setFbankName(String fbankName) {
		this.fbankName = fbankName;
	}

	public String getFaccTypeName() {
		return faccTypeName;
	}

	public void setFaccTypeName(String faccTypeName) {
		this.faccTypeName = faccTypeName;
	}

 

	public String getFfundsNatureName() {
		return ffundsNatureName;
	}

	public void setFfundsNatureName(String ffundsNatureName) {
		this.ffundsNatureName = ffundsNatureName;
	}

	public String getFadaptScope() {
		return fadaptScope;
	}

	public void setFadaptScope(String fadaptScope) {
		this.fadaptScope = fadaptScope;
	}

	public String getFaccSetIdCode() {
		return faccSetIdCode;
	}

	public void setFaccSetIdCode(String faccSetIdCode) {
		this.faccSetIdCode = faccSetIdCode;
	}

	public String getFfundsNatureCode() {
		return ffundsNatureCode;
	}

	public void setFfundsNatureCode(String ffundsNatureCode) {
		this.ffundsNatureCode = ffundsNatureCode;
	}
	
	
 
}
