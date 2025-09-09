package com.example.pattern.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		//空實現
	}
	
	@Override
	boolean customerWantCondiments() {
		// TODO Auto-generated method stub
		return false;//因為是純豆漿，配料就不會加了
	}
 
}
