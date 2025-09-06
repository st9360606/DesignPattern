package com.example.pattern.prototype.improve;

/**
 * 原型模式
 * implements Cloneable 實作 clone方法
 */
public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private String address = "紐西蘭";
	public Sheep friend; //是對象
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}
	// Clone 該實例，使用默認的clone方法來完成
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Sheep sheep = null;
		try {
			sheep = (Sheep)super.clone(); //使用默認的clone方法來完成
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		return sheep;
	}
	
	
}
