package com.example.pattern.mediator.smarthouse;

public class ClientTest {

	public static void main(String[] args) {
		//創建一個中介者對象
		Mediator mediator = new ConcreteMediator();
		
		//創建 Alarm 並且加入到  ConcreteMediator 對象的 HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//創建了 CoffeeMachine 對象，並 且加入到 ConcreteMediator 對象的 HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		//創建 Curtains , 對象，並 且加入到  ConcreteMediator 對象的 HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		
		//讓鬧鐘發出消息
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
