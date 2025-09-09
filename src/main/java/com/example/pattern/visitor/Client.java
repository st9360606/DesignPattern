package com.example.pattern.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建 ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		
		//成功
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======給的是待定的評價========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
