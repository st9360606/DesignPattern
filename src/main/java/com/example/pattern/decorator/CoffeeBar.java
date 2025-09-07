package com.example.pattern.decorator;

public class CoffeeBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 裝飾者模式下的訂單 : 加 2份巧可力 + 一份牛奶 的 大冰美式咖啡

		// 1. 點一份 LongBlack
		Drink order = new LongBlack();
		System.out.println("費用 = " + order.cost());
		System.out.println("描述 = " + order.getDes());

		// 2. order 加入一份牛奶
		order = new Milk(order);

		System.out.println("order 加入一份牛奶 費用 = " + order.cost());
		System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

		// 3. order 加入一份巧克力

		order = new Chocolate(order);

        System.out.println("order 加入一份巧克力 & 加入一份牛奶 費用 = " + order.cost());
        System.out.println("order 加入一份巧克力 & 加入一份牛奶 描述 = " + order.getDes());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入2份巧克力 & 加入一份牛奶 費用 = " + order.cost());
        System.out.println("order 加入2份巧克力 & 加入一份牛奶 描述 = " + order.getDes());
	
		System.out.println("===========================");
		
		Drink order2 = new DeCaf();
		
		System.out.println("order2 低咖啡因  費用 = " + order2.cost());
		System.out.println("order2 低咖啡因 描述 = " + order2.getDes());
		
		order2 = new Milk(order2);

        System.out.println("order2 低咖啡因 & 加入一份牛奶 費用 = " + order2.cost());
        System.out.println("order2 低咖啡因 & 加入一份牛奶 描述 = " + order2.getDes());

	
	}

}
