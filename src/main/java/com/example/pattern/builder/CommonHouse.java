package com.example.pattern.builder;
/**
 * 建造者模式
 */
public class CommonHouse extends AbstractHouse {

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
