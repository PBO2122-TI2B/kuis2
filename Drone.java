/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_PraktikumKUIS2;

/**
 *
 * @author Chaidir Wiradhika
 */
public class Drone implements WiFi, Radio {
    private int maxSpeed, maxAltitude;
    
    public Drone(int maxSpeed, int maxAltitude){
        this.maxSpeed=maxSpeed;
        this.maxAltitude=maxAltitude;
    }
    @Override
    public void sendData(){
        System.out.println("Drone");
        System.out.println("Maximum Speed    = "+this.maxSpeed+" km/jam");
        System.out.println("Maximum Altitude = "+this.maxAltitude+" Meter");
    }
    @Override
    public void sendSignal(){
    }
}