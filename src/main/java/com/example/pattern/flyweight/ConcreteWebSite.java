package com.example.pattern.flyweight;

//具體網站
public class ConcreteWebSite extends WebSite {

	private String type = ""; //網站發布的形式(類型)

	
	//構造器
	public ConcreteWebSite(String type) {
		
		this.type = type;
	}


	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("網站發布的形式為:" + type + " 在使用中.. 使用者式 = " + user.getName());
	}
	
	
}
