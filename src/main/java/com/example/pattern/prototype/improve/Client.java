package com.example.pattern.prototype.improve;


/**
 * 原型模式
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("原型模式_完成對象的創建");
		// TODO Auto-generated method stub
		Sheep sheep = new Sheep("tom", 1, "白色");
		
		sheep.friend = new Sheep("jack", 2, "黑色");
		
		Sheep sheep2 = (Sheep)sheep.clone(); //clone
		Sheep sheep3 = (Sheep)sheep.clone(); //clone
		Sheep sheep4 = (Sheep)sheep.clone(); //clone
		Sheep sheep5 = (Sheep)sheep.clone(); //clone
		
		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());//引用類型的淺拷貝
		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());//引用類型的淺拷貝
		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());//引用類型的淺拷貝
		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());//引用類型的淺拷貝
	}

}
