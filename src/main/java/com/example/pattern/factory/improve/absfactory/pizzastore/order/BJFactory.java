package com.example.pattern.factory.improve.absfactory.pizzastore.order;

import com.example.pattern.factory.improve.absfactory.pizzastore.pizza.BJCheesePizza;
import com.example.pattern.factory.improve.absfactory.pizzastore.pizza.BJPepperPizza;
import com.example.pattern.factory.improve.absfactory.pizzastore.pizza.Pizza;

//工廠子類
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ 使用的是抽象工廠模式 ~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
