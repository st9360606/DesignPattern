package com.example.pattern.template;

//抽象類 豆漿
public abstract class SoyaMilk {

	//模板方法, make , 模板方法可以做成 final , 不讓子類去覆蓋.
	final void make() {
		select(); 
		addCondiments();
		soak();
		beat();
	}
	
	//選材料
	void select() {
		System.out.println(" 第一步 : 選擇好的新鮮黃豆 ");
	}
	
	//第二步 : 添加不同的配料，抽象方法
	abstract void addCondiments();
	
	//浸泡
	void soak() {
		System.out.println(" 第三步 : 黃豆和配料開始浸泡，需要3小時 ");
	}
	 
	void beat() {
		System.out.println(" 第四步 : 黃豆和配料放到豆漿機去打碎 ");
	}
}
