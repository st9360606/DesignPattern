package com.example.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
	
	//學院集合
	List<College> collegeList;

	public OutPutImpl(List<College> collegeList) {
		
		this.collegeList = collegeList;
	}
	//遍歷所有學院，然後調用 printDepartment 輸出各個學院科系
	public void printCollege() {
		
		//從 collegeList 取出所有學院, Java 中的 List 已經實現 Iterator
		Iterator<College> iterator = collegeList.iterator();
		
		while(iterator.hasNext()) {
			//取出一個學院
			College college = iterator.next();
			System.out.println("=== "+college.getName() +"=====" );
			printDepartment(college.createIterator()); //得到對應的迭代器
		}
	}

	//輸出學院的科系
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
	
}
