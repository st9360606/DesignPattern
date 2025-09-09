package com.example.pattern.memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState(" 狀態#1 攻擊力100 ");
		
		//保存了當前的狀態
		caretaker.add(originator.saveStateMemento());

		originator.setState(" 狀態#2 攻擊力80 ");
		
		caretaker.add(originator.saveStateMemento());

		originator.setState(" 狀態#3 攻擊力50 ");
		caretaker.add(originator.saveStateMemento());

		System.out.println("當前的狀態是 =" + originator.getState());
		
		//希望恢復到 狀態#1, 將 originator 恢復到狀態#1
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("恢復到狀態1");
		System.out.println("當前的狀態是 =" + originator.getState());
	}
}
