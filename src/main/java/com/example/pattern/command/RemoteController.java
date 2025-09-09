package com.example.pattern.command;

public class RemoteController {

	// 開 按鈕的命令數組
	Command[] onCommands;
	Command[] offCommands;

	// 執行撤銷的命令
	Command undoCommand;

	// 構造器，完成對按鈕初始化

	public RemoteController() {

		onCommands = new Command[5];
		offCommands = new Command[5];

		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand(); //NoCommand 用來初始化的
			offCommands[i] = new NoCommand();
		}
	}

	// 給我們的按鈕設置你需要的命令
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}

	// 按下開的按鈕
	public void onButtonWasPushed(int no) { // no 0
		// 找到你按下的開的按鈕，並調用對應的方法
		onCommands[no].execute();
		// 紀錄這次的操作，用於撤銷
		undoCommand = onCommands[no];

	}

	// 按下關的按鈕
	public void offButtonWasPushed(int no) { // no 0
		// 找到你按下的關的按鈕，並調用對應的方法
		offCommands[no].execute();
		// 紀錄這次的操作，用於撤銷
		undoCommand = offCommands[no];

	}
	
	// 按下撤銷的按鈕
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
