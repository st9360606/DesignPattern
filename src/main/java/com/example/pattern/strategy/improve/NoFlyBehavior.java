package com.example.pattern.strategy.improve;

public class NoFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(" 不會飛翔  ");
	}
}