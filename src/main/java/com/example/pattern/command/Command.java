package com.example.pattern.command;


//創建命令接口
public interface Command {

	//ִ執行操做
	public void execute();
	//撤銷操作
	public void undo();
}
