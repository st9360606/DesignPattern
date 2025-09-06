package com.example.pattern.singleton.type8;

/**
 * 使用枚舉，可以實現單例，可以避免多線程同步問題
 * 推薦使用
 */
public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
	}
}


enum Singleton {
	INSTANCE; //
	public void sayOK() {
		System.out.println("ok~");
	}
}