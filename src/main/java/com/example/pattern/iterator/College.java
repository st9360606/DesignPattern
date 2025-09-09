package com.example.pattern.iterator;

import java.util.Iterator;

public interface College {
	
	public String getName();
	
	//增加科系的方法
	public void addDepartment(String name, String desc);
	
	//返回一個迭代器，遍歷
	public Iterator  createIterator();
}
