package com.example.pattern.decorator;

public class Decorator extends Drink {
	private Drink obj;
	
	public Decorator(Drink obj) { //構造器
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己的價格
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 被裝飾者的描述
		return des + " " + getPrice() + " && " + obj.getDes() + "  上一份的成本 " + obj.getPrice();
	}
	
	

}
