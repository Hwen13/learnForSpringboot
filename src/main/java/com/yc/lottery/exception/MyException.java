package com.yc.lottery.exception;

import com.yc.lottery.result.ResponseMessage.ResultEnum;

public class MyException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int code;

	private String errMsg;

	public  MyException(ResultEnum resultEnum){
	    this.code = resultEnum.getCode();
	    this.errMsg = resultEnum.getMsg();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
