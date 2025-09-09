package com.example.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

//數據結構，管理很多人 Man, Woman
public class ObjectStructure {

	//維護了一個集合
	private List<Person> persons = new LinkedList<>();
	
	//增加到list
	public void attach(Person p) {
		persons.add(p);
	}
	//移除出list
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//顯示評價的情況
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
