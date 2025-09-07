package com.example.pattern.proxy.staticproxy;

//代理對象，靜態代理
public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target; // 目標對象，通過接口來聚合

	//構造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(" 開始進行代理... 完成某些操作 ! ");//����
		target.teach();
		System.out.println(" 提交... ");//����
	}

}
