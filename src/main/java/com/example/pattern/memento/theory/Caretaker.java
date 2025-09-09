package com.example.pattern.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	//在List 集合中會有很多的備忘錄對象
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//獲取到第 index個 Originator 的備忘錄對象(即保存狀態)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
