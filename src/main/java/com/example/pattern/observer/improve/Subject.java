package com.example.pattern.observer.improve;

//接口, 讓 WeatherData 來實現
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
