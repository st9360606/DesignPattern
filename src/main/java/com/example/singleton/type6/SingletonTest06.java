package com.example.singleton.type6;

/**
 * 懶漢模式 (線程安全的)
 * 雙重檢查
 * volatile 增加可見性，多線程下每個線程執行完成都會通知主線程
 * 實際開發中，推薦使用
 */
public class SingletonTest06 {

	public static void main(String[] args) {
        System.out.println("---懶漢模式 (線程安全的)---");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

class Singleton {
	private static volatile Singleton instance; //這裡加入 volatile ，可見性，多線程下每個線程執行完成都會通知主線程
	
	private Singleton() {}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) { //這裡也加入 synchronized
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
}