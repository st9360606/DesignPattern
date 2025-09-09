package com.example.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {

	
	List<Department> departmentList; // 信息工程學院是以 List 方式存放科系
	int index = -1;//索引
	

	public InfoColleageIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	//判斷 list 中還有沒有下一個元素
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index >= departmentList.size() - 1) {
			return false;
		} else {
			index += 1;
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return departmentList.get(index);
	}
	
	//空實現 remove
	public void remove() {
		
	}

}
