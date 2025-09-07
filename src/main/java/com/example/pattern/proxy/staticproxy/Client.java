package com.example.pattern.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建目標對象(被代理對象)
		TeacherDao teacherDao = new TeacherDao();
		
		//創建代理對象，同時將被代理對象傳遞給代理對象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		//通過代理對象，調用到被代理對象的方法
		//即 : 執行的是代理對象的方法，代理對象再去調用目標對象的方法
		teacherDaoProxy.teach();
	}

}
