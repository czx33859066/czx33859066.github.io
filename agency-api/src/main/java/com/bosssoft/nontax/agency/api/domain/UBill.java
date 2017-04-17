package com.bosssoft.nontax.agency.api.domain;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 票据类型 UAB_Bill 的值对象
 * 
 * @author  C.J.B
 * @since 2014-10-22
 * @version 1.0
 */ 
public class UBill implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fid; //id  

    private String fpid; //父ID

    private String fcode; //票据类型编码

    private String fname; //票据名称

    private String fmnem; //助记码

    private int flevel; //级别

    private int fisLeaf; //是否叶子节点    

    private String funits; //计量单位

    private String finvoiceMode; //开票方式
    
    private String finvoiceModeName ;// 开票方式名称

    private String fbillNature; //票据性质     
    
    private String fbillNatureName ;// 票据性质名称

    private String feffDate; //生效日期    

    private String fexpDate; //失效日期  

    private Integer fisQuota; //是否定额    

    private BigDecimal fquotaAmt; //定额面值     

    private Integer fsafeYear; //法定保存年限

    private BigDecimal fminStock; //最小库存   

    private String fmemo; //备注   

    private String fauthor; //编制人

    private long fversion; //版本号 

    private String falterCode; //修改类型代码     

    private String fcreateTime; //创建时间

    private String fupdateTime; //修改时间      

    private String fcustom1; //自定义1      

    private String fcustom2; //自定义2      

    private String fcustom3; //自定义3  
    
    //add by C.J.B 
    private String fbillNoMagCode ; //票号管理方式：1 财政发放 2 自动生成
    
    //辅助字段  edit by chenzhihua
    private String fbillSortName;
    private String fsisQuota;//是否定额
    private String fbillSortId;

    public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFpid() {
		return fpid;
	}

	public void setFpid(String fpid) {
		this.fpid = fpid;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFmnem() {
		return fmnem;
	}

	public void setFmnem(String fmnem) {
		this.fmnem = fmnem;
	}

	public int getFlevel() {
		return flevel;
	}

	public void setFlevel(int flevel) {
		this.flevel = flevel;
	}

	public int getFisLeaf() {
		return fisLeaf;
	}

	public void setFisLeaf(int fisLeaf) {
		this.fisLeaf = fisLeaf;
	}

	public String getFunits() {
		return funits;
	}

	public void setFunits(String funits) {
		this.funits = funits;
	}

	public String getFinvoiceMode() {
		return finvoiceMode;
	}

	public void setFinvoiceMode(String finvoiceMode) {
		this.finvoiceMode = finvoiceMode;
	}

	public String getFbillNature() {
		return fbillNature;
	}

	public void setFbillNature(String fbillNature) {
		this.fbillNature = fbillNature;
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

	public void setFexpdate(String fexpDate) {
		this.fexpDate = fexpDate;
	}

	public Integer getFisQuota() {
		return fisQuota;
	}

	public void setFisQuota(Integer fisQuota) {
		this.fisQuota = fisQuota;
	}

	public BigDecimal getFquotaAmt() {
		return fquotaAmt;
	}

	public void setFquotaAmt(BigDecimal fquotaAmt) {
		this.fquotaAmt = fquotaAmt;
	}

	public Integer getFsafeYear() {
		return fsafeYear;
	}

	public void setFsafeYear(Integer fsafeYear) {
		this.fsafeYear = fsafeYear;
	}

	public BigDecimal getFminStock() {
		return fminStock;
	}

	public void setFminStock(BigDecimal fminStock) {
		this.fminStock = fminStock;
	}

	public String getFmemo() {
		return fmemo;
	}

	public void setFmemo(String fmemo) {
		this.fmemo = fmemo;
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

	public String getFalterCode() {
		return falterCode;
	}

	public void setFalterCode(String falterCode) {
		this.falterCode = falterCode;
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

	public String getFcustom1() {
		return fcustom1;
	}

	public void setFcustom1(String fcustom1) {
		this.fcustom1 = fcustom1;
	}

	public String getFcustom2() {
		return fcustom2;
	}

	public void setFcustom2(String fcustom2) {
		this.fcustom2 = fcustom2;
	}

	public String getFcustom3() {
		return fcustom3;
	}

	public void setFcustom3(String fcustom3) {
		this.fcustom3 = fcustom3;
	}

	public String getFinvoiceModeName() {
		return finvoiceModeName;
	}

	public void setFinvoiceModeName(String finvoiceModeName) {
		this.finvoiceModeName = finvoiceModeName;
	}

	public String getFbillNatureName() {
		return fbillNatureName;
	}

	public void setFbillNatureName(String fbillNatureName) {
		this.fbillNatureName = fbillNatureName;
	}

	public String getFbillSortName() {
		return fbillSortName;
	}

	public void setFbillSortName(String fbillSortName) {
		this.fbillSortName = fbillSortName;
	}

	public void setFexpDate(String fexpDate) {
		this.fexpDate = fexpDate;
	}

	public String getFsisQuota() {
		return fsisQuota;
	}

	public void setFsisQuota(String fsisQuota) {
		this.fsisQuota = fsisQuota;
	}

	public String getFbillSortId() {
		return fbillSortId;
	}

	public void setFbillSortId(String fbillSortId) {
		this.fbillSortId = fbillSortId;
	}

	public String getFbillNoMagCode() {
		return fbillNoMagCode;
	}

	public void setFbillNoMagCode(String fbillNoMagCode) {
		this.fbillNoMagCode = fbillNoMagCode;
	}

 }
