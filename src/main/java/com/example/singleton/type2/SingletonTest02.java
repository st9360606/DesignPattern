package com.example.singleton.type2;

/**
 * 餓漢模式(靜態代碼塊)
 */
public class SingletonTest02 {

	public static void main(String[] args) {
        //測試
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}



class Singleton {

	private Singleton() {}

	private  static Singleton instance;
	
	static { //在靜態代碼塊中，創建單俐對象
		instance = new Singleton();
	}

	public static Singleton getInstance() {
		return instance;
	}
	
}