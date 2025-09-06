package com.example.pattern.builder.improve;

public class Client {
	public static void main(String[] args) {
		
		//蓋建築物
		CommonHouse commonHouse = new CommonHouse();
		//準備創建房子的指揮者，傳入要蓋的產品
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//完成蓋房子，返回產品(房子)
		House house = houseDirector.constructHouse();

		System.out.println("--------------------------");
        //蓋高樓
		HighBuilding highBuilding = new HighBuilding();
        //準備創建房子的指揮者，傳入要蓋的產品
		houseDirector.setHouseBuilder(highBuilding);
        //完成蓋房子，返回產品(房子)
		houseDirector.constructHouse();

	}
}
