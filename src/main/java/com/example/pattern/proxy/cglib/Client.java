package com.example.pattern.proxy.cglib;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //創建目標對象
		TeacherDao target = new TeacherDao();
        //獲取到代理對象，並且將目標對象傳遞給代理對象
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		//ִ執行代理對象的方法，底層會觸發 intecept 方法，從而實現 對目標對象的調用
		String res = proxyInstance.teach();
		System.out.println("res=" + res);
	}
}
