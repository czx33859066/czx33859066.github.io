package com.bosssoft.nontax.agency.api.exception;

/**
 * 
 * 说明：异常枚举类
 * 
 * @author  sujian
 * @since 2014-10-31
 * @version 1.0
 */
public enum ExceptionEnum {

	PAYBOOK_NULL, //缴款书不存在,
	PAYBOOK_STATE_INVALID, //作废
	PAYBOOK_STATE_COMFIRM, //已缴款确认
	
	PAYBOOK_STATE_PAPER, //转电脑开票
	PAYBOOK_STATE_OVERDUE, //缴款书过期
	PAYBOOK_SUCCESS, //缴款书确认成功
	PAYBOOK_TRANSFORM_EXCEPTION, // 转换缴款书出现异常
	
	PAYBOOK_SIGN_EXCEPTION, //验证签名异常
	PAYBOOK_QUERY_EXCEPTION, // 查询缴款书出现异常
	PAYBOOK_UPDATE_EXCEPTION, //确认缴款书出现异常
	
	PAYBOOK_PARAM_EXCEPTION, // 平台传参数出现异常
	PAYBOOK_REVJSON_EXCEPTION, // 接收json字符串异常
	PAYBOOK_POS_EXCEPTION, //缴款书pos异常数据,
//	PAYBOOK_POS, //缴款书pos,
	PAYBOOK_EXCEPTION //其他异常

}
