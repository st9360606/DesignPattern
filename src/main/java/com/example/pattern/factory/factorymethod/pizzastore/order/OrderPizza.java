package com.example.pattern.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.pattern.factory.factorymethod.pizzastore.pizza.Pizza;



//抽象類
public abstract class OrderPizza {

	//定義一個抽象方法 createPizza , 讓各個工廠子類自己實現
	abstract Pizza createPizza(String orderType);
	
	// 構造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; //訂購的披薩類型
		do {
			orderType = getType();
			pizza = createPizza(orderType); //抽象方法 createPizza , 讓工廠子類自己實現完成
            // 輸出 pizza 製作過程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}



    // 寫一個方法，可以獲取客戶希望訂購的披薩種類
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 種類:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
