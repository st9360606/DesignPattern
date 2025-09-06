package com.example.pattern.builder;

/**
 * 建造者模式
 */
public abstract class AbstractHouse {
	
	//打地基
	public abstract void buildBasic();
	//沏牆
	public abstract void buildWalls();
	//封頂
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
	
}
