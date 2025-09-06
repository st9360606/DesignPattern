package com.example.pattern.factory.improve.absfactory.pizzastore.order;

import com.example.pattern.factory.improve.absfactory.pizzastore.pizza.Pizza;

//一個抽象工廠模式的抽象層(AbsFact Interface)
public interface AbsFactory {
	//讓下面的工廠子類來 "實現"
	public Pizza createPizza(String orderType);
}
