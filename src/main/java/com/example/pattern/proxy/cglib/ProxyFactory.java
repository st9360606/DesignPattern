package com.example.pattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

    //維護一個目標對象 , Object
	private Object target;
	
	//構造器，傳入一個被代理的對象
	public ProxyFactory(Object target) {
		this.target = target;
	}

	//返回一個代理對象:  是 target 對象的代理對象
	public Object getProxyInstance() {
		//1. 創建一個工具類
		Enhancer enhancer = new Enhancer();
		//2. 設置父類
		enhancer.setSuperclass(target.getClass());
		//3. 設置回調函數
		enhancer.setCallback(this);
		//4. 創建子類對象，即代理對象
		return enhancer.create();
		
	}

	//重寫  intercept 方法，會調用目標對象的方法
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Cglib代理模式 ~~ 開始");
		Object returnVal = method.invoke(target, args);
		System.out.println("Cglib代理模式 ~~ 提交");
		return returnVal;
	}
}
