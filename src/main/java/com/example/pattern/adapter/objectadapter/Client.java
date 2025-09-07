package com.example.pattern.adapter.objectadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" === 對象適配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
