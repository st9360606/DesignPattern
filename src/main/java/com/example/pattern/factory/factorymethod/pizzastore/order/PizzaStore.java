package com.example.pattern.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//北京口味
			new BJOrderPizza();
		} else {
			//倫敦口味
			new LDOrderPizza();
		}
		// TODO Auto-generated method stub
	}

}
