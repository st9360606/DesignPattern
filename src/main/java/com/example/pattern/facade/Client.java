package com.example.pattern.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接調用
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
        homeTheaterFacade.pause();
		homeTheaterFacade.end();
	}

}
