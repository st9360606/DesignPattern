package com.example.pattern.visitor;

//說明
//1. 這裡我們使用到了"雙分派"，即首先在客戶端程序中，將具體狀態作為參數傳遞 第一次分派
//2. 然後 Man 類 調用作為參數的 "具體方法" 中方法 getManResult，同是將自己(this)作為參數傳入，完成第二次分派
public class
Man extends Person {

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManResult(this);
	}

}
