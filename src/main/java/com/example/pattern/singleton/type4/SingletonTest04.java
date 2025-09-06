package com.example.pattern.singleton.type4;

/**
 * 懶漢模式 (線程安全的)
 * 會帶來新的問題，效率太低，這個方法只要執行一次就夠了
 * 實際開發中，不要使用這種方式
 */
public class SingletonTest04 {

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
	private static Singleton instance;
	
	private Singleton() {}

	public static synchronized Singleton getInstance() { //這裡加入 synchronized
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}