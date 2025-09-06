package com.example.pattern.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
        System.out.println(" 將高樓 - 進行打地基 100米 ");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
        System.out.println(" 將高樓 - 進行沏牆 50米 ");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
        System.out.println(" 將高樓 - 進行封頂");
	}

}
