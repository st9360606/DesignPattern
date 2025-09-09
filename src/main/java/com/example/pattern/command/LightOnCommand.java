package com.example.pattern.command;

//實現 Command 接口
public class LightOnCommand implements Command {

	// 聚合 LightReceiver
	
	LightReceiver light;

	//構造器
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//調用接收者的方法
		light.on();
	}

	

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		//調用接收者的方法
		light.off();
	}

}
