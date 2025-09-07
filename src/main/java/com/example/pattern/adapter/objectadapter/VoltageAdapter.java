package com.example.pattern.adapter.objectadapter;

/**
 * Voltage220V -> IVoltage5V -> VoltageAdapter -> Phone -> Client
 */

//適配器類
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    //通過構造器，傳入一個 Voltage220V 實例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();// 獲取到220V的電壓
            System.out.println("使用對象適配器，進行適配!");
            dst = src / 44; //220 轉成 5v
            System.out.println("適配完成，輸出的電壓為= " + dst);
        }
        return dst;
    }
}
