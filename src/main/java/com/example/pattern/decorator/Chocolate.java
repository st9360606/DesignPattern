package com.example.pattern.decorator;

//具體的 Decorator。這裡是口味
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		setPrice(3.0f); // 口味的價格
	}

}
