package com.example.pattern.responsibilitychain;


//請求類
public class PurchaseRequest {

	private int type = 0; //請求類型
	private float price = 0.0f; //
	private int id = 0;
	//構造器
	public PurchaseRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public float getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
}
