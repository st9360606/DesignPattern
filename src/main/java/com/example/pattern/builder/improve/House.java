package com.example.pattern.builder.improve;

/**
 * 建造者模式
 * House-> HouseBuilder -> CommonHouse -> HighBuilding -> HouseDirector -> Client
 */

// 產品 -> Product
public class House {
	private String baise;
	private String wall;
	private String roofed;
	public String getBaise() {
		return baise;
	}
	public void setBaise(String baise) {
		this.baise = baise;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoofed() {
		return roofed;
	}
	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}
	
}
