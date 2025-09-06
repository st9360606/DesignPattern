package com.example.pattern.builder.improve;

/**
 * 建造者模式
 * House-> HouseBuilder -> CommonHouse -> HighBuilding -> HouseDirector -> Client
 */

// 抽象的建造者
public abstract class HouseBuilder {

	protected House house = new House();
	
	//將建造的流程寫好，抽象的方法
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//建造房子好後，將產品(房子)返回
	public House buildHouse() {
		return house;
	}
	
}
