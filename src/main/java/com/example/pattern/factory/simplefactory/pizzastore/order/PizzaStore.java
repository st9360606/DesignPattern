package com.example.pattern.factory.simplefactory.pizzastore.order;

//相當一個客戶端，發出訂購
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new OrderPizza();
		
		//使用簡單工廠模式
//		new OrderPizza(new SimpleFactory());
//		System.out.println("~~退出程序~~");
		
		new OrderPizza2();
	}

}
