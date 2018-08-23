package com.yin.gava;

public class Result<T> {

	private String msg;
	private int status;
	private Data<T> data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Data<T> getData() {
		return data;
	}
	public void setData(Data<T> data) {
		this.data = data;
	}
	
	
}
