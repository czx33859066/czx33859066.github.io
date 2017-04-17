package com.bosssoft.nontax.agency.api.domain;
import java.io.Serializable;
import java.util.List;

/**
 * 
 * 说明： UAB_AGEN的值对象类
 * 
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */ 
public class UAgen implements Serializable {

	private static final long serialVersionUID = 489648675757599346L;

	/**
	 * 主键
	 */
    private String fid; //id   
    /**
     * 父节点Id,
     */
	private String fpid; // 父节点ID
	/**
	 * 区划编码
	 */
	private String frgnCode; // 区划编码
	/**
	 * 父节点识别码
	 */
	private String fpidCode; // 父节点编码
	/**
	 * 单位识别码
	 */
	private String fagenIdCode; // 单位识别码
	/**
	 * 层次码，内码
	 */
	private String flevelCode; // 层次码
	/**
	 * 单位业务编码
	 */
	private String fcode; // 单位编码
	/**
	 * 单位名称
	 */
	private String fname; // 单位名称
	/**
	 * 助记码
	 */
	private String fmnem; // 助记码
	/**
	 * 单位级别
	 */
	private int flevel; // 级别
	/**
	 * 是否叶子节点，最细级
	 */
	private int fisLeaf; // 是否叶子节点
	/**
	 * 单位生效日期
	 */
	private String feffDate; // 生效日期
	/**
	 * 失效日期
	 */
	private String fexpDate; // 失效日期
	/**
	 * 是否允许单位增加下级单位
	 */
	private int fisCreateAgency; // 是否允许增加下级单位
	/**
	 * 单位联系人
	 */
	private String flinkMan; // 联系人
	/**
	 * 联系电话
	 */
	private String flinkTel; // 联系电话
	/**
	 * 联系地址
	 */
	private String flinkAddr; // 联系地址
	/**
	 * 备注
	 */
	private String fmemo; // 备注
	/**
	 * 编制人
	 */
	private String fauthor; // 编制人
	/**
	 * 版本号
	 */
	private long fversion; // 版本号
	/**
	 * 变更类型代码
	 */
	private String falterCode; // 修改类型代码
	/**
	 * 创建时间
	 */
	private String fcreateTime; // 创建时间
	/**
	 * 修改时间
	 */
	private String fupdateTime; // 修改时间
	/**
	 * 自定义字段
	 */
	private String fcustom1; // 自定义1

	private String fcustom2; // 自定义2

	private String fcustom3; // 自定义3
	/**
	 * 单位分类
	 */
	private int fagenSort; // 单位分类
	/**
	 * 是否最终数据
	 */
	private int fisFinal; // 是否最终数据
	/**
	 * 缴款书有效期限
	 */
	private int fpayBookEffDays; // 缴款书有效期限
	/**
	 * 数据采集期限
	 */
	private int fcollectDays; // 数据采集期限

	private int fcheckDays; // 核销周期(审验周期)

	private String fappMode; // 系统应用方式

	private int fisOffLine; // 是否允许离线

	private int foffLineDays; // 允许离线天数

	private String fpayMode; // 缴款方式

	private int fsumPayDays; // 缴款期限（汇缴期限）

	private int fisRecCash; // 是否收现金
    
	private String fisNeedChkByFin; // 单位开票点是否需要财政审核

	private String forgCode;// 组织机构代码
	
	private String fisTickAgen; // 是否顶级单位/是否财政领票单位
	
	
	///辅助字段
	//单位缴款渠道
	private List<UAgenPayChnl> fpayChnls;
	
    private String fcreateBy;
	
	private String fsubSystemId ; //子系统ID 
    

	//是否由财政创建 : 1 表示由财政创建。其他表示单位创建
	private int fisFinCreate ;  

	public UAgen(){
    	
    }
    
    /**
	 * 财务负责人
	 */
    private String ffinMgr;
    /**
	 * 财务负责人电话
	 */
    private String ffinMgrTel;
    /**
	 * 是否开通网上缴费
	 */
    private String fisAlwOnlinePay;
    /**
     * 是否允許下級單位離線部署
     */
    private String fisAgencyOffline;

	public String getForgCode() {
		return forgCode;
	}

	public void setForgCode(String forgCode) {
		this.forgCode = forgCode;
	}

	public int getFisRecCash() {
		return fisRecCash;
	}

	public void setFisRecCash(int fisRecCash) {
		this.fisRecCash = fisRecCash;
	}

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

	public String getFrgnCode() {
		return frgnCode;
	}

	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}

	public String getFpidCode() {
		return fpidCode;
	}

	public void setFpidCode(String fpidCode) {
		this.fpidCode = fpidCode;
	}

	public String getFagenIdCode() {
		return fagenIdCode;
	}

	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}

	public String getFlevelCode() {
		return flevelCode;
	}

	public void setFlevelCode(String flevelCode) {
		this.flevelCode = flevelCode;
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

	public int getFisCreateAgency() {
		return fisCreateAgency;
	}

	public void setFisCreateAgency(int fisCreateAgency) {
		this.fisCreateAgency = fisCreateAgency;
	}

	public String getFlinkMan() {
		return flinkMan;
	}

	public void setFlinkMan(String flinkMan) {
		this.flinkMan = flinkMan;
	}

	public String getFlinkTel() {
		return flinkTel;
	}

	public void setFlinkTel(String flinkTel) {
		this.flinkTel = flinkTel;
	}

	public String getFlinkAddr() {
		return flinkAddr;
	}

	public void setFlinkAddr(String flinkAddr) {
		this.flinkAddr = flinkAddr;
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

	public int getFagenSort() {
		return fagenSort;
	}

	public void setFagenSort(int fagenSort) {
		this.fagenSort = fagenSort;
	}

	public int getFisFinal() {
		return fisFinal;
	}

	public void setFisFinal(int fisFinal) {
		this.fisFinal = fisFinal;
	}

	public int getFpayBookEffDays() {
		return fpayBookEffDays;
	}

	public void setFpayBookEffDays(int fpayBookEffDays) {
		this.fpayBookEffDays = fpayBookEffDays;
	}

	public int getFcollectDays() {
		return fcollectDays;
	}

	public void setFcollectDays(int fcollectDays) {
		this.fcollectDays = fcollectDays;
	}

	public int getFcheckDays() {
		return fcheckDays;
	}

	public void setFcheckDays(int fcheckDays) {
		this.fcheckDays = fcheckDays;
	}

	public String getFappMode() {
		return fappMode;
	}

	public void setFappMode(String fappMode) {
		this.fappMode = fappMode;
	}

	public int getFisOffLine() {
		return fisOffLine;
	}

	public void setFisOffLine(int fisOffLine) {
		this.fisOffLine = fisOffLine;
	}

	public int getFoffLineDays() {
		return foffLineDays;
	}

	public void setFoffLineDays(int foffLineDays) {
		this.foffLineDays = foffLineDays;
	}

	public String getFpayMode() {
		return fpayMode;
	}

	public void setFpayMode(String fpayMode) {
		this.fpayMode = fpayMode;
	}

	public int getFsumPayDays() {
		return fsumPayDays;
	}

	public void setFsumPayDays(int fsumPayDays) {
		this.fsumPayDays = fsumPayDays;
	}

	public String getFfinMgr() {
		return ffinMgr;
	}

	public void setFfinMgr(String ffinMgr) {
		this.ffinMgr = ffinMgr;
	}

	public String getFfinMgrTel() {
		return ffinMgrTel;
	}

	public void setFfinMgrTel(String ffinMgrTel) {
		this.ffinMgrTel = ffinMgrTel;
	}

	public String getFisAlwOnlinePay() {
		return fisAlwOnlinePay;
	}

	public void setFisAlwOnlinePay(String fisAlwOnlinePay) {
		this.fisAlwOnlinePay = fisAlwOnlinePay;
	}

	public String getFisNeedChkByFin() {
		return fisNeedChkByFin;
	}

	public void setFisNeedChkByFin(String fisNeedChkByFin) {
		this.fisNeedChkByFin = fisNeedChkByFin;
	}

	public String getFisTickAgen() {
		return fisTickAgen;
	}

	public void setFisTickAgen(String fisTickAgen) {
		this.fisTickAgen = fisTickAgen;
	}

	public List<UAgenPayChnl> getFpayChnls() {
		return fpayChnls;
	}

	public void setFpayChnls(List<UAgenPayChnl> fpayChnls) {
		this.fpayChnls = fpayChnls;
	}

	public String getFisAgencyOffline() {
		return fisAgencyOffline;
	}

	public void setFisAgencyOffline(String fisAgencyOffline) {
		this.fisAgencyOffline = fisAgencyOffline;
	}
    public String getFcreateBy() {
		return fcreateBy;
	}

	public void setFcreateBy(String fcreateBy) {
		this.fcreateBy = fcreateBy;
	}

	public String getFsubSystemId() {
		return fsubSystemId;
	}

	public void setFsubSystemId(String fsubSystemId) {
		this.fsubSystemId = fsubSystemId;
	}

	public int getFisFinCreate() {
		return fisFinCreate;
	}

	public void setFisFinCreate(int fisFinCreate) {
		this.fisFinCreate = fisFinCreate;
	}
 
    
}
