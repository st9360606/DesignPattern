package com.example.pattern.builder.improve;

/**
 * 建造者模式
 * House-> HouseBuilder -> CommonHouse -> HighBuilding -> HouseDirector -> Client
 */

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(" 將建築物 - 進行打地基 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 將建築物 - 進行沏牆 ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 將建築物 - 進行封頂");
    }

}
