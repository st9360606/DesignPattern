package com.example.pattern.adapter.classadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

//被適配的類
public class Voltage220V {
	// 輸出 220V的電壓
	public int output220V() {
		int src = 220;
		System.out.println("電壓 = " + src + "伏");
		return src;
	}
}
