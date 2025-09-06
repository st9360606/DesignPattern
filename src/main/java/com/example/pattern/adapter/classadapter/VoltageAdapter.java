package com.example.pattern.adapter.classadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

//適配器類
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		// 獲取到220V的電壓
		int srcV = output220V();
		int dstV = srcV / 44 ; //220 轉成 5v
		return dstV;
	}

}
