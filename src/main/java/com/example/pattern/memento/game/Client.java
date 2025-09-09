package com.example.pattern.memento.game;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建遊戲角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("和 boss 大戰前的狀態");
		gameRole.display();
		
		//把當前狀態保存 caretaker
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());
		
		System.out.println("和 boss 大戰~~~");
		gameRole.setDef(30);
		gameRole.setVit(30);
		
		gameRole.display();
		
		System.out.println("大戰後，使用備忘錄對象，恢復到大戰前");
		
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento()); //caretaker.setMemento 狀態是大戰前的狀態
		System.out.println("恢復後的狀態 :");
		gameRole.display();
	}

}
