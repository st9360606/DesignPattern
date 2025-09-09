package com.example.pattern.observer.improve;

//觀察者接口，有觀察者來實現
public interface Observer {

	public void update(float temperature, float pressure, float humidity);
}
