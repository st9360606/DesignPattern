package com.example.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	//維護一個目標對象 , Object
	private Object target;

	//構造器， 對 target 進行初始化
	public ProxyFactory(Object target) {
		
		this.target = target;
	} 
	
	//給目標對象，生成一個代理對象
	public Object getProxyInstance() {
		
		//˵��
		/*
		 *  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
                                          
            //1. ClassLoader loader 指定當前目標對象使用的類加載器，獲取加載器的方法固定
            //2. Class<?>[] interfaces: 目標對象實現的接口類型，使用泛型方法確認類型
            //3. InvocationHandler h : 事情處理，執行目標對象的方法時，會觸發事情處理器方法，
            *                          會把當前執行的目標對象方法作為一個參數
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("JDK代理開始~~");
						//反射機制調用目標對象的方法
						Object returnVal = method.invoke(target, args); //反射
						System.out.println("JDK代理提交...");
						return returnVal;
					}
				});
	}
	
	
}
