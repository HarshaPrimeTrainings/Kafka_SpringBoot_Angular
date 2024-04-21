package com.bootcamp.orderservice.dto;

public class OrderDetails {
	
	
	private Integer oid;
	private String product;
	private String status;
	private Integer price;
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "OrderDetails [oid=" + oid + ", product=" + product + ", status=" + status + ", price=" + price + "]";
	}

}
