package com.bosssoft.nontax.agency.api.domain;
import java.io.Serializable;

/**
 * 
 * 说明： UAB_ITEM的值对象类
 * 
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */ 
public class UItem implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6023882760787746916L;

	private String fid; //fid   (主键)     

    private String fitemIdCode; //fitemidcode      

    private String fcode; //fcode      
 
    private String fname; //fname      

    private String fmnem; //fmnem      

    private String funits; //funits      

    private String fitemSortId; //fitemsortid      

    private String feffDate; //feffdate      

    private String fexpDate; //fexpdate      

    private String ffundsNature; //见字典表（资金性质）      

    private String ffundsMode; //见字典表（资金管理方式）１：国库、２：专户、３：代收、４：其      

    private Integer fisFinal; //fisfinal      

    private String fmemo; //fmemo      

    private String fauthor; //fauthor      

    private long fversion; //fversion      

    private String falterCode; //见数据字典（变更类型代码１新增　２修改）      

    private String fcreateTime; //fcreatetime      

    private String fupdateTime; //fupdatetime      

    private String fcustom1; //fcustom1      

    private String fcustom2; //fcustom2      

    private String fcustom3; //fcustom3    
    
    private String fpidCode;
    
    private String fisLeaf;//是否叶子节点
    
    private int flevel ; //级别
    
    private String flevelCode ;//层次码
    
    private String fitemPubSortId ; //全国项目分类
    
    private String fitemRgnSortId ; //地方项目分类
    
    private String fsubId ; //预算科目ID
    
    private String fshareDirectCode ;//分成方向编码

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
	 * @return 返回 fitemidcode
	 */
    public String getFitemIdCode() {
      return this.fitemIdCode;
    }
    /**
	 * @param fitemIDCode
	 *            要设置的 fitemidcode
	 */
    public void setFitemIdCode(String fitemIdCode) {
      this.fitemIdCode = fitemIdCode;
    }

	/**
	 * @return 返回 fcode
	 */
    public String getFcode() {
      return this.fcode;
    }
    /**
	 * @param fcode
	 *            要设置的 fcode
	 */
    public void setFcode(String fcode) {
      this.fcode = fcode;
    }

	/**
	 * @return 返回 fname
	 */
    public String getFname() {
      return this.fname;
    }
    /**
	 * @param fname
	 *            要设置的 fname
	 */
    public void setFname(String fname) {
      this.fname = fname;
    }

	/**
	 * @return 返回 fmnem
	 */
    public String getFmnem() {
      return this.fmnem;
    }
    /**
	 * @param fmnem
	 *            要设置的 fmnem
	 */
    public void setFmnem(String fmnem) {
      this.fmnem = fmnem;
    }

	/**
	 * @return 返回 funits
	 */
    public String getFunits() {
      return this.funits;
    }
    /**
	 * @param funits
	 *            要设置的 funits
	 */
    public void setFunits(String funits) {
      this.funits = funits;
    }

	/**
	 * @return 返回 fitemsortid
	 */
    public String getFitemSortId() {
      return this.fitemSortId;
    }
    /**
	 * @param fitemSortId
	 *            要设置的 fitemsortid
	 */
    public void setFitemSortId(String fitemSortId) {
      this.fitemSortId = fitemSortId;
    }

	/**
	 * @return 返回 feffdate
	 */
    public String getFeffDate() {
      return this.feffDate;
    }
    /**
	 * @param feffDate
	 *            要设置的 feffdate
	 */
    public void setFeffDate(String feffDate) {
      this.feffDate = feffDate;
    }

	/**
	 * @return 返回 fexpdate
	 */
    public String getFexpDate() {
      return this.fexpDate;
    }
    /**
	 * @param fexpDate
	 *            要设置的 fexpdate
	 */
    public void setFexpDate(String fexpDate) {
      this.fexpDate = fexpDate;
    }

	/**
	 * @return 返回 见字典表（资金性质）
	 */
    public String getFfundsNature() {
      return this.ffundsNature;
    }
    /**
	 * @param ffundsNature
	 *            要设置的 见字典表（资金性质）
	 */
    public void setFfundsNature(String ffundsNature) {
      this.ffundsNature = ffundsNature;
    }

	/**
	 * @return 返回 见字典表（资金管理方式）１：国库、２：专户、３：代收、４：其
	 */
    public String getFfundsMode() {
      return this.ffundsMode;
    }
    /**
	 * @param ffundsMode
	 *            要设置的 见字典表（资金管理方式）１：国库、２：专户、３：代收、４：其
	 */
    public void setFfundsMode(String ffundsMode) {
      this.ffundsMode = ffundsMode;
    }

	/**
	 * @return 返回 fisfinal
	 */
    public Integer getFisFinal() {
      return this.fisFinal;
    }
    /**
	 * @param fisFinal
	 *            要设置的 fisfinal
	 */
    public void setFisFinal(Integer fisFinal) {
      this.fisFinal = fisFinal;
    }

	/**
	 * @return 返回 fmemo
	 */
    public String getFmemo() {
      return this.fmemo;
    }
    /**
	 * @param fmemo
	 *            要设置的 fmemo
	 */
    public void setFmemo(String fmemo) {
      this.fmemo = fmemo;
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

  	public String getFpidCode() {
		return fpidCode;
	}

	public void setFpidCode(String fpidCode) {
		this.fpidCode = fpidCode;
	}

	public String getFisLeaf() {
		return fisLeaf;
	}

	public void setFisLeaf(String fisLeaf) {
		this.fisLeaf = fisLeaf;
	}

	/**
	 * 将对象的内容以字符串的方式输出
	 */
    public String toString()
    {
        StringBuffer str = new StringBuffer();

        str.append(this.getClass().getName())
            .append("[ fid=").append(this.fid)
            .append(", fitemidcode=").append(this.fitemIdCode)
            .append(", fcode=").append(this.fcode)
            .append(", fname=").append(this.fname)
            .append(", fmnem=").append(this.fmnem)
            .append(", funits=").append(this.funits)
            .append(", fitemsortid=").append(this.fitemSortId)
            .append(", feffdate=").append(this.feffDate)
            .append(", fexpdate=").append(this.fexpDate)
            .append(", 见字典表（资金性质）=").append(this.ffundsNature)
            .append(", 见字典表（资金管理方式）１：国库、２：专户、３：代收、４：其=").append(this.ffundsMode)
            .append(", fisfinal=").append(this.fisFinal)
            .append(", fmemo=").append(this.fmemo)
            .append(", fauthor=").append(this.fauthor)
            .append(", fversion=").append(this.fversion)
            .append(", 见数据字典（变更类型代码１新增　２修改）=").append(this.falterCode)
            .append(", fcreatetime=").append(this.fcreateTime)
            .append(", fupdatetime=").append(this.fupdateTime)
            .append(", fcustom1=").append(this.fcustom1)
            .append(", fcustom2=").append(this.fcustom2)
            .append(", fcustom3=").append(this.fcustom3)
            .append(" ]");

        return str.toString();
    }

	public int getFlevel() {
		return flevel;
	}

	public void setFlevel(int flevel) {
		this.flevel = flevel;
	}

	public String getFlevelCode() {
		return flevelCode;
	}

	public void setFlevelCode(String flevelCode) {
		this.flevelCode = flevelCode;
	}

	public String getFshareDirectCode() {
		return fshareDirectCode;
	}

	public void setFshareDirectCode(String fshareDirectCode) {
		this.fshareDirectCode = fshareDirectCode;
	}

	public String getFsubId() {
		return fsubId;
	}

	public void setFsubId(String fsubId) {
		this.fsubId = fsubId;
	}

	public String getFitemRgnSortId() {
		return fitemRgnSortId;
	}

	public void setFitemRgnSortId(String fitemRgnSortId) {
		this.fitemRgnSortId = fitemRgnSortId;
	}

	public String getFitemPubSortId() {
		return fitemPubSortId;
	}

	public void setFitemPubSortId(String fitemPubSortId) {
		this.fitemPubSortId = fitemPubSortId;
	}
}
