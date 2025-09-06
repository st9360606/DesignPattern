
package com.example.pattern.singleton.type1;

/**
 * 餓漢模式(靜態變量)
 */
//優點:類加載的時候就完成實例化了，避免線程同步問題
//缺點:如果都沒有用到這個實例，則會造成內存的浪費
public class SingletonTest01 {

	public static void main(String[] args) {
		//測試
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true，證明兩個對象是同一個
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//餓漢模式(靜態變量)

class Singleton {
	
	//1. 構造器私有化，外部能NEW
	private Singleton() {}
	
	//2. 類內部創建對象實例
	private final static Singleton instance = new Singleton();
	
	//3. 提供一個公有的靜態方法，返回對象
	public static Singleton getInstance() {
		return instance;
	}
	
}