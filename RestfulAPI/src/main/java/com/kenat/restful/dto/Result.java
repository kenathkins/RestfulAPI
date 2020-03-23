package com.kenat.restful.dto;

import java.util.Date;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private boolean success;// 是否成功标志

	private T data;// 成功时返回的数据

	private String error;// 错误信息
	
	private String token;//token

	public Result() {
	}

	// method when succeed
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	// method when succeed
	public Result(boolean success, T data, String token) {
		this.success = success;
		this.data = data;
		this.token = token;
	}

	// method when failed
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", data=" + data + ", error=" + error + ", token=" + token + "]";
	}

//	@Override
//	public String toString() {
//		if (data != null) {
//			return "{\"success\":\"" + success + "\", \"data\":{" + data + "}, \"error\":\"" + error + "\",\"token\":\"" + token +"\"}";
//		}else {
//			return "{\"success\":\"" + success + "\", \"data\":\"" + data + "\", \"error\":\"" + error + "\",\"token\":\"" + token +"\"}";
//		}
//	}

}