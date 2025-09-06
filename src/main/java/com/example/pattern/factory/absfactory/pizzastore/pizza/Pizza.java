package com.example.pattern.factory.absfactory.pizzastore.pizza;

//將 Pizza 作為 抽象類
public abstract class Pizza {
	protected String name;

    //準備原材料，不同披薩是不一樣的，因此我們做成抽象方法
	public abstract void prepare();

	
	public void bake() {
		System.out.println(name + " baking;");
	}

	public void cut() {
		System.out.println(name + " cutting;");
	}

	//裝箱
	public void box() {
		System.out.println(name + " boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
