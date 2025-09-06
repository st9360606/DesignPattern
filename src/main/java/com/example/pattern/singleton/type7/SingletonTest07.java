package com.example.pattern.singleton.type7;

/**
 * 懶漢模式 (線程安全的)
 * 靜態內部類方式在Singleton類被加載並會立刻實例化，而是在需要實例化時，調用getInstance方法，才會加載 SingletonInstance 類
 * 利用靜態內部類，實現延遲加載，效率高
 * 實際開發中，推薦使用
 */
public class SingletonTest07 {

	public static void main(String[] args) {
        System.out.println("---懶漢模式 (線程安全的)---");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

//靜態內部類完成
class Singleton {
	private static volatile Singleton instance;

    //構造器私有化
	private Singleton() {}

    //寫一個靜態內部類，該類中有一個靜態屬性 Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}

    //提供一個靜態的公有方法，直接返回 SingletonInstance.INSTANCE
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}