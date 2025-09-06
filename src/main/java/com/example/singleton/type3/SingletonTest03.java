package com.example.singleton.type3;

/**
 * 懶漢模式 (線程不安全的)
 * 多線程會造成一個線程進入判斷語句，另一個已經通過創建實例，這樣會造成多個實例，所以不適用多線程環境
 * 實際開發中，不要使用這種方式
 */
public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("---懶漢模式 (線程不安全的)---");
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

	public static Singleton getInstance() {
		if(instance == null) { //判斷有沒有對象，沒有才創建
			instance = new Singleton();
		}
		return instance;
	}
}