package com.bosssoft.nontax.agency.api.domain;

import java.io.Serializable;

/**
 * 
 * 说明： AGEN_ITEM的值对象类
 * 
 * @author C.J.B
 * @since 2015-08-28
 * @version 1.0
 */ 
public class UAgenItem implements Serializable {

	private static final long serialVersionUID = 489648675757599346L;
	private String fid ; 	//主键
	private String fpidCode; 	//父主键
	private String fitemIdCode; 	//项目识别码
	private String fcode; 	//项目编码
	private String fname; 	//项目名称
	private String fmnem; 	//助记码
	private int flevel; 	//级别
	private String funits; 	//计量单位
	private int fisLeaf; 	//是否叶子节点
	private int fisFinal; 	//是否最终数据
	private String ffundsNature; 	//资金性质
	private String ffundsNatureName ; 	//资金性质名称
	private String fitemSortId; 	//项目分类
	private String feffDate; 	//生效日期
	private String fexpDate; 	//失效日期
	private String fshareDirectCode; 	//分成方向
	private String fshareDirectName ; 	//分成方向名称
	private String fsubId; 	//预算科目id
	private String fmemo; 	//备注
	private String fauthor; 	//编制人
	private long fversion; 	//版本号
	private String falterCode; 	//修改类型代码
	private String fcreateTime; 	//创建时间
	private String fupdateTime; 	//修改时间
	private String fcustom1; 	//自定义1
	private String fcustom2; 	//自定义2
	private String fcustom3; 	//自定义3	
	private String fitemStdIdCode ;		//项目标准识别码
	private String fstdCode ;	// 项目标准编码
	private String fstdName ;	// 项目标准名称
	private String fminCharge ;	// 最小区间
	private String fmaxCharge ;	// 最大区间
	private String fagenItemIdCode ;	// 单位项目识别码
	private String fagenIdCode ;	// 单位识别码
	private String frgnCode ;	// 区划编码
	private String fisAgenRemain ;	// 是否有单位留存
	private String fremainCode ;	// 单位留存类型
	private String fremainName ;	// 单位留存类型名称
	private String fremainValue ;	// 单位留存值
	private String fisEnable ;	// 是否启用单位项目标准
	private String fsubCode ;	// 预算科目编码
	private String fsubName ;	// 预算科目名称
	private String fsubYear ;	// 预算科目年度
	
	
	private  String fsortName;//分类名
	private String fpubName;//全国项目分类
	private String fregionName;//地方项目分类
	private String fparentName;//上级项目
	
	//辅助字段
	private String fagenItemStd;
	
	public String getId(){
		return fid ;
	}
	public void setId(String id){
		fid = id ;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFpidCode() {
		return fpidCode;
	}
	public void setFpidCode(String fpidCode) {
		this.fpidCode = fpidCode;
	}
	public String getFitemIdCode() {
		return fitemIdCode;
	}
	public void setFitemIdCode(String fitemIdCode) {
		this.fitemIdCode = fitemIdCode;
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
	public String getFunits() {
		return funits;
	}
	public void setFunits(String funits) {
		this.funits = funits;
	}
	public int getFisLeaf() {
		return fisLeaf;
	}
	public void setFisLeaf(int fisLeaf) {
		this.fisLeaf = fisLeaf;
	}
	public int getFisFinal() {
		return fisFinal;
	}
	public void setFisFinal(int fisFinal) {
		this.fisFinal = fisFinal;
	}
	public String getFfundsNature() {
		return ffundsNature;
	}
	public void setFfundsNature(String ffundsNature) {
		this.ffundsNature = ffundsNature;
	}
	public String getFfundsNatureName() {
		return ffundsNatureName;
	}
	public void setFfundsNatureName(String ffundsNatureName) {
		this.ffundsNatureName = ffundsNatureName;
	}
	public String getFitemSortId() {
		return fitemSortId;
	}
	public void setFitemSortId(String fitemSortId) {
		this.fitemSortId = fitemSortId;
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
	public String getFshareDirectCode() {
		return fshareDirectCode;
	}
	public void setFshareDirectCode(String fshareDirectCode) {
		this.fshareDirectCode = fshareDirectCode;
	}
	public String getFshareDirectName() {
		return fshareDirectName;
	}
	public void setFshareDirectName(String fshareDirectName) {
		this.fshareDirectName = fshareDirectName;
	}
	public String getFsubId() {
		return fsubId;
	}
	public void setFsubId(String fsubId) {
		this.fsubId = fsubId;
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
	public String getFitemStdIdCode() {
		return fitemStdIdCode;
	}
	public void setFitemStdIdCode(String fitemStdIdCode) {
		this.fitemStdIdCode = fitemStdIdCode;
	}
	public String getFstdCode() {
		return fstdCode;
	}
	public void setFstdCode(String fstdCode) {
		this.fstdCode = fstdCode;
	}
	public String getFstdName() {
		return fstdName;
	}
	public void setFstdName(String fstdName) {
		this.fstdName = fstdName;
	}
	public String getFminCharge() {
		return fminCharge;
	}
	public void setFminCharge(String fminCharge) {
		this.fminCharge = fminCharge;
	}
	public String getFmaxCharge() {
		return fmaxCharge;
	}
	public void setFmaxCharge(String fmaxCharge) {
		this.fmaxCharge = fmaxCharge;
	}
	public String getFagenItemIdCode() {
		return fagenItemIdCode;
	}
	public void setFagenItemIdCode(String fagenItemIdCode) {
		this.fagenItemIdCode = fagenItemIdCode;
	}
	public String getFagenIdCode() {
		return fagenIdCode;
	}
	public void setFagenIdCode(String fagenIdCode) {
		this.fagenIdCode = fagenIdCode;
	}
	public String getFrgnCode() {
		return frgnCode;
	}
	public void setFrgnCode(String frgnCode) {
		this.frgnCode = frgnCode;
	}
	public String getFisAgenRemain() {
		return fisAgenRemain;
	}
	public void setFisAgenRemain(String fisAgenRemain) {
		this.fisAgenRemain = fisAgenRemain;
	}
	public String getFremainCode() {
		return fremainCode;
	}
	public void setFremainCode(String fremainCode) {
		this.fremainCode = fremainCode;
	}
	public String getFremainName() {
		return fremainName;
	}
	public void setFremainName(String fremainName) {
		this.fremainName = fremainName;
	}
	public String getFremainValue() {
		return fremainValue;
	}
	public void setFremainValue(String fremainValue) {
		this.fremainValue = fremainValue;
	}
	public String getFisEnable() {
		return fisEnable;
	}
	public void setFisEnable(String fisEnable) {
		this.fisEnable = fisEnable;
	}
	public String getFsubCode() {
		return fsubCode;
	}
	public void setFsubCode(String fsubCode) {
		this.fsubCode = fsubCode;
	}
	public String getFsubName() {
		return fsubName;
	}
	public void setFsubName(String fsubName) {
		this.fsubName = fsubName;
	}
	public String getFsubYear() {
		return fsubYear;
	}
	public void setFsubYear(String fsubYear) {
		this.fsubYear = fsubYear;
	}
	public String getFsortName() {
		return fsortName;
	}
	public void setFsortName(String fsortName) {
		this.fsortName = fsortName;
	}
	public String getFpubName() {
		return fpubName;
	}
	public void setFpubName(String fpubName) {
		this.fpubName = fpubName;
	}
	public String getFregionName() {
		return fregionName;
	}
	public void setFregionName(String fregionName) {
		this.fregionName = fregionName;
	}
	public String getFparentName() {
		return fparentName;
	}
	public void setFparentName(String fparentName) {
		this.fparentName = fparentName;
	}
	public String getFagenItemStd() {
		return fagenItemStd;
	}
	public void setFagenItemStd(String fagenItemStd) {
		this.fagenItemStd = fagenItemStd;
	}
	
	
}
