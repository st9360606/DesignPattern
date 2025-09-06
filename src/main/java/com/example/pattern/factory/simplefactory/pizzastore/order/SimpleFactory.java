package com.example.pattern.factory.simplefactory.pizzastore.order;


import com.example.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.example.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.example.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.example.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

//簡單工廠類
public class SimpleFactory {

	//根據 orderType 返回對應的 Pizza 對象
	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println("使用簡單工廠模式...");
        switch (orderType) {
            case "greek" -> {
                pizza = new GreekPizza();
                pizza.setName("【希臘披薩】");
            }
            case "cheese" -> {
                pizza = new CheesePizza();
                pizza.setName("【起司披薩】");
            }
            case "pepper" -> {
                pizza = new PepperPizza();
                pizza.setName("【胡椒披薩】");
            }
        }
		
		return pizza;
	}

    //根據 orderType 返回對應的 Pizza 對象
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

        System.out.println("使用簡單工廠模式2...");
        switch (orderType) {
            case "greek" -> {
                pizza = new GreekPizza();
                pizza.setName("【希臘披薩】");
            }
            case "cheese" -> {
                pizza = new CheesePizza();
                pizza.setName("【起司披薩】");
            }
            case "pepper" -> {
                pizza = new PepperPizza();
                pizza.setName("【胡椒披薩】");
            }
        }
		
		return pizza;
	}

}
