package com.example.pattern.proxy.dynamic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建目標對象
		ITeacherDao target = new TeacherDao();
		
		//給目標對象，創建代理對象，可以轉成 ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
	
		// proxyInstance=class jdk.proxy1.$Proxy0 內存中動態生成了代理對象
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		
		//通過代理對象，調用目標對象的方法
//		proxyInstance.teach();
		
		proxyInstance.sayHello(" tom ");
	}

}
