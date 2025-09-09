package com.example.pattern.iterator;

import java.util.Iterator;


public class ComputerCollegeIterator implements Iterator {

	//這裡我們需要知道 Department 是以怎樣的方式存放 => 數組
	Department[] departments;
	int position = 0; //遍歷的位置

	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}

	//判斷是否還有下一個元素
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= departments.length || departments[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Department department = departments[position];
		position += 1;
		return department;
	}
	
	//刪除的方法，默認空實現
	public void remove() {
	}
}
