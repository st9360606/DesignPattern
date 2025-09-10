package com.example.pattern.strategy.improve;

public class PekingDuck extends Duck {

	//假如北京鴨可以飛翔，但是飛翔技術一般
	public PekingDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new BadFlyBehavior();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~北京鴨~~");
	}
	
	

}
