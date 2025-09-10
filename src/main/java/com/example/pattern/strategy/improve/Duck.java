package com.example.pattern.strategy.improve;

public abstract class Duck {

	//屬性, 策略接口
	FlyBehavior flyBehavior;

	//其他屬性 <-> 策略接口
	QuackBehavior quackBehavior;
	
	public Duck() {
	}

	public abstract void display();//顯示鴨子信息
	
	public void quack() {
		System.out.println("鴨子呱呱叫~~");
	}
	
	public void swim() {
		System.out.println("鴨子會游泳~~");
	}
	
	public void fly() {
		
		//改進
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
