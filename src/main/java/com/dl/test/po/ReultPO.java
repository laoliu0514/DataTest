package com.dl.test.po;

import java.io.Serializable;

import com.dl.annotation.DV;

public class ReultPO implements Serializable{
	
	@DV(nullable=true)
	private String shopId;
	@DV(nullable=false)
	private String startTime;
	@DV(nullable=false)
	private String endTime;
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "ReultPO [shopId=" + shopId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}
