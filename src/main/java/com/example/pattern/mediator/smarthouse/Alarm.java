package com.example.pattern.mediator.smarthouse;

//具體的同事類
public class Alarm extends Colleague {

	//構造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		//在創建Alarm 同事對象時，將自己放入到 ConcreteMediator 對象中[集合]
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		//調用中介者對象的getMessage
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
