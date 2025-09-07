package com.example.pattern.adapter.objectadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

public class Phone {

	//充電
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("電壓為 5V, 可以充電~~");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("電壓大於5V, 無法充電~~");
		}
	}
}
