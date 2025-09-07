package com.example.pattern.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(" 老師授課中.... ");
	}

}
