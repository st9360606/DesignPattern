package com.example.principles.singleresponsibility.improve;

/**
 * 七大設計原則
 * 單一職責原則
 */

//雖然沒有在class上遵守單一原則，但在方法級別上，仍然遵守單一原則
public class singleresponsibility2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("公車");
        vehicle.run("氣車");
        vehicle.runAir("飛機");
        vehicle.runWater("郵輪");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在馬路運行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天上運行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在海上運行...");
    }
}