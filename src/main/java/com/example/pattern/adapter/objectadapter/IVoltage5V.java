package com.example.pattern.adapter.objectadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

//適配接口
public interface IVoltage5V {
	public int output5V();
}
