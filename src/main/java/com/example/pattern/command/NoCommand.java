package com.example.pattern.command;

/**
 * 沒有任何命令，即空執行 : 用於初始化每個按鈕，當調用空命令時，對象什麼都不做
 * 其實，這樣是一種設計模式，可以省掉對空的判斷
 * @author Administrator
 *
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
