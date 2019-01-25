package com.yc.lottery.result;

public class ResponseMessage<T> {
	//错误码
	private int code;

	//信息描述
	private String msg;

	//具体的信息内容

	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public enum ResultEnum {

		UNKNOWN_ERROR(-100, "未知错误"),
		NEED_LOGIN(-1, "未登录"),
		REPEAT_REGISTER(-2, "该用户已注册"),
		USER_NOT_EXIST(-3, "不存在该用户"),
		PASSWORD_ERROR(-4, "密码错误"),
		EMPTY_USERNAME(-5, "用户名为空"),
		EMPTY_PASSWORD(-6, "密码为空"),
		SUCCESS(0, "success"),
		SYSTEM_ERROR(-1000001,"系统错误");

		private Integer code;

		private String msg;

		private ResultEnum(Integer code, String msg) {
		    this.code = code;
		    this.msg = msg;
		}

		public Integer getCode() {
		    return code;
		}

		public String getMsg() {
		    return msg;
		}
}
}
