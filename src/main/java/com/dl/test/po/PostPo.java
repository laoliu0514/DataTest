package com.dl.test.po;

public class PostPo {
	
	private String num;
	private int id;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PostPo [num=" + num + ", id=" + id + "]";
	}
	
	
	
}
