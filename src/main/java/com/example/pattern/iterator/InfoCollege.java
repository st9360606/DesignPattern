package com.example.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

	List<Department> departmentList;
	
	
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("信息安全專業", " 信息安全專業 ");
		addDepartment("網路安全專業", " 網路安全專業 ");
		addDepartment("服務器安全專業", " 服務器安全專業 ");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "信息工程學院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new InfoColleageIterator(departmentList);
	}

}
