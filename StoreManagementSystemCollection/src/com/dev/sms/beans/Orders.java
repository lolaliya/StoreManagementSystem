package com.dev.sms.beans;

public class Orders {
	private int orderId;
	private float orderPrice;
	private Integer orderQuantiy;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Integer getOrderQuantiy() {
		return orderQuantiy;
	}
	public void setOrderQuantiy(Integer orderQuantiy) {
		this.orderQuantiy = orderQuantiy;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderPrice=" + orderPrice + ", orderQuantiy=" + orderQuantiy + "]";
	}
}
