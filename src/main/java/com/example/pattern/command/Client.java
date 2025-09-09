package com.example.pattern.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用命令設計模式，完成通過遙控器，對電燈的操作
		
		//創建電燈對象(接收者)
		LightReceiver lightReceiver = new LightReceiver();
		
		//創建電燈相關的開關命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		//創建一個遙控器
		RemoteController remoteController = new RemoteController();
		
		//給遙控器設置命令，比如 no = 0 是電燈的開和關的操作
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println("--------按下電燈的開按鈕-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下電燈的關按鈕-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下電燈的撤銷按鈕-----------");
		remoteController.undoButtonWasPushed();
		
		
		System.out.println("=========使用遙控器操作TV==========");
		
		TVReceiver tvReceiver = new TVReceiver();
		
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

		//給遙控器設置命令，比如 no = 1 是電燈的開和關的操作，1 代表編號為 1 的第二組產品
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);

		System.out.println("--------按下TV的開按鈕-----------");
		remoteController.onButtonWasPushed(1); //產品編號為 1 的商品進行操作
		System.out.println("--------按下TV的關按鈕-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下TV的撤銷按鈕-----------");
		remoteController.undoButtonWasPushed();

	}

}
