package com.example.pattern.visitor;

public abstract class Action {
	
	//得到男性的 評價
	public abstract void getManResult(Man man);
	
	//得到女性的 評價
	public abstract void getWomanResult(Woman woman);
}
