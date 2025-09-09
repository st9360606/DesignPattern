package com.example.pattern.memento.theory;

public class Originator {

	private String state;//狀態信息

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//編寫一個方法，可以保存一個狀態對象 Memento
	//因此編寫一個方法，返回 Memento
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	//通過備忘錄對象，恢復狀態
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
