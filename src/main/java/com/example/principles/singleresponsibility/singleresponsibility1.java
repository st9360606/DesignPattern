package com.example.principles.singleresponsibility;

/**
 * 七大設計原則
 * 單一職責原則
 */
public class singleresponsibility1 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("公車");
        roadVehicle.run("氣車");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飛機");

    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "馬路運行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "天上運行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "海上運行");
    }
}
