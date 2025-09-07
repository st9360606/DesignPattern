package com.example.pattern.bridge;

public abstract class Phone {
	
	//組合品牌
	private Brand brand;

	//構造器
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
        brand.open();
	}
	protected void close() {
        brand.close();
	}
	protected void call() {
        brand.call();
	}
	
}
