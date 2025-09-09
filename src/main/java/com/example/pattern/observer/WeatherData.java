package com.example.pattern.observer;

/**
 * 類是核心
 * 1. 包含最新的天氣情況信息
 * 2. 含有 CurrentConditions 對象
 * 3. 當數據有更新時，就主動的調用 CurrentConditions 對象 update方法(含 display), 這樣他們(接入方)就能看到最新的信息
 * @author Administrator
 *
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	//加入新的第三方

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//調用 接入方的 update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

	// 當數據有更新時，就調用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//調用dataChange，將最新的信息 推送給 接入方 currentConditions
		dataChange();
	}
}
